/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rhz.sistemas.dao;

import br.com.rhz.sistemas.model.Servicos;
import br.com.rhz.sistemas.util.Data;
import br.com.rhz.sistemas.util.FabricaDeConexao;
import br.com.rhz.sistemas.util.Texto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael
 */
public class ServicosDAO {
    
    public void cadastrarServico(Servicos servico) {

        System.out.println("Monitoramento - Classe ServicosDAO - Método cadastrarServico()");

        //VALIDACAO
        if (Texto.vazioOuNulo(servico.getNome()) || Texto.vazioOuNulo(servico.getValor().toString())) {
            JOptionPane.showMessageDialog(null, "Campo obrigatório não preenchido!");
        } else {

            try {

                Connection conexao = FabricaDeConexao.abrirConexao();

                PreparedStatement pst = null;

                String sql = " INSERT INTO t_servicos ";
                sql += " (nome, valor, descricao, data_cadastro, quem_cadastrou) ";
                sql += " VALUES (?, ?, ?, ?, ?);";

                pst = conexao.prepareStatement(sql);
                pst.setString(1, servico.getNome());
                pst.setDouble(2, servico.getValor());
                pst.setString(3, servico.getDescricao());
                pst.setDate(4, Data.ConvertDataFormParaBanco(servico.getData_cadastro()));
                pst.setString(5, servico.getQuem_cadastrou());

                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "Serviço cadastrado com sucesso!");

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
                Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                FabricaDeConexao.fecharConexao();
            }
        }
    }
    
}

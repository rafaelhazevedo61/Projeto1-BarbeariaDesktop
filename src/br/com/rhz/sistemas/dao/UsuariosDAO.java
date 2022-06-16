/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rhz.sistemas.dao;

import br.com.rhz.sistemas.model.Usuarios;
import br.com.rhz.sistemas.util.Data;
import br.com.rhz.sistemas.util.FabricaDeConexao;
import br.com.rhz.sistemas.util.Texto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael
 */
public class UsuariosDAO {

    public boolean verificarUsuarioExiste(String usuario) {

        System.out.println("Monitoramento - Classe UsuariosDAO - Método verificarUsuarioExiste()");

        try {

            Connection conexao = FabricaDeConexao.abrirConexao();

            PreparedStatement pst = null;
            ResultSet rs = null;

            String sql = "select * from t_usuarios where usuario=?";

            pst = conexao.prepareStatement(sql);

            pst.setString(1, usuario);

            rs = pst.executeQuery();

            while (rs.next()) {
                return true;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            FabricaDeConexao.fecharConexao();
        }
        return false;
    }

    public void cadastrarUsuario(Usuarios usuario) {

        System.out.println("Monitoramento - Classe UsuariosDAO - Método cadastrarUsuario()");

        //VALIDACAO
        if (Texto.vazioOuNulo(usuario.getUsuario()) || Texto.vazioOuNulo(usuario.getSenha())) {
            JOptionPane.showMessageDialog(null, "Campo obrigatório não preenchido!");
        } else {

            try {

                Connection conexao = FabricaDeConexao.abrirConexao();

                PreparedStatement pst = null;

                String sql = " INSERT INTO t_usuarios ";
                sql += " (usuario, senha, nome, data_cadastro, quem_cadastrou) ";
                sql += " VALUES (?, ?, ?, ?, ?);";

                pst = conexao.prepareStatement(sql);
                pst.setString(1, usuario.getUsuario());
                pst.setString(2, usuario.getSenha());
                pst.setString(3, usuario.getNome());
                pst.setDate(4, Data.ConvertDataFormParaBanco(usuario.getData_cadastro()));
                pst.setString(5, usuario.getQuem_cadastrou());

                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
                Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                FabricaDeConexao.fecharConexao();
            }
        }
    }

    public Usuarios autenticarUsuario(Usuarios usuario) {

        System.out.println("Monitoramento - Classe UsuariosDAO - Método autenticarUsuario()");

        //VALIDACAO
        if (Texto.vazioOuNulo(usuario.getUsuario()) || Texto.vazioOuNulo(usuario.getSenha())) {
            JOptionPane.showMessageDialog(null, "Campo obrigatório não preenchido!");
        } else {

            try {

                Connection conexao = FabricaDeConexao.abrirConexao();

                PreparedStatement pst = null;
                ResultSet rs = null;

                String sql = "select * from t_usuarios where usuario=? and senha=?";

                pst = conexao.prepareStatement(sql);

                pst.setString(1, usuario.getUsuario());
                pst.setString(2, usuario.getSenha());

                pst.execute();

                rs = pst.getResultSet();

                Usuarios usu = new Usuarios();

                if (rs.next()) {
                    usu = carregarResultSet(rs);
                    return usu;
                } else {
                    JOptionPane.showMessageDialog(null, "Usuário ou Senha inválidos!");
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
                Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                FabricaDeConexao.fecharConexao();
            }
        }
        return null;
    }

    public Usuarios carregarResultSet(ResultSet rs) throws SQLException {

        Usuarios usuario = new Usuarios();

        usuario.setCodusuario(rs.getInt("codusuario"));
        usuario.setUsuario(rs.getString("usuario"));
        usuario.setSenha(rs.getString("senha"));
        usuario.setData_cadastro(rs.getDate("data_cadastro"));
        usuario.setQuem_cadastrou(rs.getString("quem_cadastrou"));
        usuario.setData_alteracao(rs.getDate("data_alteracao"));
        usuario.setQuem_alterou(rs.getString("quem_alterou"));

        return usuario;

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rhz.sistemas.controller;

import br.com.rhz.sistemas.dao.ServicosDAO;
import br.com.rhz.sistemas.model.Servicos;
import br.com.rhz.sistemas.view.servicos.TelaServicosCadastrar;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael
 */
public class TelaServicosCadastrarController {

    private final TelaServicosCadastrar view;

    //CONSTRUTOR
    public TelaServicosCadastrarController(TelaServicosCadastrar view) {
        this.view = view;
    }

    public void cadastrarServico() {

        System.out.println("Monitoramento - Classe TelaServicosCadastrarController - Método cadastrarServico()");

        String nome = view.getjTextFieldServico().getText();
        String valor = view.getjTextFieldValor().getText();
        String descricao = view.getjTextAreaDescricao().getText();

        try {

            if (nome.isEmpty() || valor.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Campo de nome e/ou valor está em branco!");
                throw new IllegalArgumentException("Campo de nome e/ou valor está em branco!");
            }

            Double valorConvertido = NumberFormat.getInstance().parse(valor).doubleValue();

            Servicos novoServico = new Servicos(nome, valorConvertido, descricao);

            ServicosDAO dao = new ServicosDAO();

            dao.cadastrarServico(novoServico);

        } catch (NumberFormatException | ParseException ex) {
            JOptionPane.showMessageDialog(null, ex);
            Logger.getLogger(TelaServicosCadastrarController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}

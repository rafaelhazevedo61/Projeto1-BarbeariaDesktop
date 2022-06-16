/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rhz.sistemas.controller;

import br.com.rhz.sistemas.view.TelaPrincipal;
import br.com.rhz.sistemas.view.servicos.TelaServicosCadastrar;
import br.com.rhz.sistemas.view.usuarios.TelaUsuarioCadastrar;

/**
 *
 * @author Rafael
 */
public class TelaPrincipalController {

    private final TelaPrincipal view;

    //CONSTRUTOR
    public TelaPrincipalController(TelaPrincipal view) {
        this.view = view;
    }
    
    public void chamarTelaUsuarioCadastrar(){
        TelaUsuarioCadastrar tela = new TelaUsuarioCadastrar();
        tela.setVisible(true);
        view.getjDesktopPane1().add(tela);
    }
    
    public void chamarTelaServicosCadastrar(){
        TelaServicosCadastrar tela = new TelaServicosCadastrar();
        tela.setVisible(true);
        view.getjDesktopPane1().add(tela);
    }
    
}

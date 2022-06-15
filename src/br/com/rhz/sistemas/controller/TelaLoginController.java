/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rhz.sistemas.controller;

import br.com.rhz.sistemas.dao.UsuariosDAO;
import br.com.rhz.sistemas.model.Usuarios;
import br.com.rhz.sistemas.view.TelaLogin;
import br.com.rhz.sistemas.view.TelaPrincipal;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael
 */
public class TelaLoginController {

    private final TelaLogin view;

    //CONSTRUTOR
    public TelaLoginController(TelaLogin view) {
        this.view = view;
    }

    public void acessar() {
        
        System.out.println("Monitoramento - Classe LoginController - Método acessar()");

        String usuario = view.getjTextFieldUsuario().getText();
        String senha = view.getjPasswordFieldSenha().getText();

        Usuarios validaUsuario = new Usuarios(usuario, senha);

        UsuariosDAO dao = new UsuariosDAO();

        Usuarios retorno = dao.autenticarUsuario(validaUsuario);

        if (retorno != null) {
            JOptionPane.showMessageDialog(null, "Usuário autenticado com sucesso!");
            chamarTelaPrincipal();
        }

    }
    
    public void chamarTelaPrincipal(){
        
        System.out.println("Monitoramento - Classe LoginController - Método chamarTelaPrincipal()");
        
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
        view.dispose();
        
    }

}

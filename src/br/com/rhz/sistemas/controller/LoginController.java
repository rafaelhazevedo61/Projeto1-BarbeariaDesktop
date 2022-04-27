/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rhz.sistemas.controller;

import br.com.rhz.sistemas.dao.UsuariosDAO;
import br.com.rhz.sistemas.model.Usuarios;
import br.com.rhz.sistemas.view.TelaLogin;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael
 */
public class LoginController {

    private final TelaLogin view;

    //CONSTRUTOR
    public LoginController(TelaLogin view) {
        this.view = view;
    }

    public void acessar() {
        
        System.out.println("Monitoramento - Classe LoginController - Método Acessar()");

        String txtusuario = view.getjTextFieldUsuario().getText();
        String txtsenha = view.getjPasswordFieldSenha().getText();

        Usuarios usuario = new Usuarios(txtusuario, txtsenha);

        UsuariosDAO dao = new UsuariosDAO();

        Usuarios retorno = dao.verificarSeUsuarioExiste(usuario);

        if (retorno != null) {
            JOptionPane.showMessageDialog(null, "Usuário autenticado com sucesso!");
        }

    }

}

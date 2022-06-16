/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rhz.sistemas.controller;

import br.com.rhz.sistemas.dao.UsuariosDAO;
import br.com.rhz.sistemas.model.Usuarios;
import br.com.rhz.sistemas.view.usuarios.TelaUsuarioCadastrar;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael
 */
public class TelaUsuarioCadastrarController {

    private final TelaUsuarioCadastrar view;

    //CONSTRUTOR
    public TelaUsuarioCadastrarController(TelaUsuarioCadastrar view) {
        this.view = view;
    }

    public void cadastrarUsuario() {

        String nome = view.getjTextFieldUsuarioNome().getText();
        String usuario = view.getjTextFieldUsuario().getText();
        String senha = view.getjPasswordFieldSenha().getText();
        String confirmarSenha = view.getjPasswordFieldConfirmaSenha().getText();

        if (senha.isEmpty() || confirmarSenha.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo de senha e/ou confirmar senha está em branco!");
            throw new IllegalArgumentException("Campo de senha e/ou confirmar senha está em branco!");
        }

        if (!senha.equals(confirmarSenha)) {
            JOptionPane.showMessageDialog(null, "Campo de senha e confirmar senha não estão iguais!");
            throw new IllegalArgumentException("Campo de senha e confirmar senha não estão iguais!");
        }

        Usuarios novoUsuario = new Usuarios(usuario, senha, nome);

        UsuariosDAO dao = new UsuariosDAO();

        boolean usuarioExiste = dao.verificarUsuarioExiste(usuario);

        if (usuarioExiste != true) {
            dao.cadastrarUsuario(novoUsuario);
        } else {
            JOptionPane.showMessageDialog(null, "Usuário já cadastrado! Por favor, tente outro.");
        }

    }

}

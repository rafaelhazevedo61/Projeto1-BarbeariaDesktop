/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rhz.sistemas.testes;

import br.com.rhz.sistemas.util.FabricaDeConexao;
import java.sql.Connection;

/**
 *
 * @author Rafael
 */
public class TesteConexao {

    public static void main(String[] args) {

        Connection conexao = FabricaDeConexao.abrirConexao();

        if (conexao != null) {

            System.out.println("\nConectado!\n");

        } else {

            System.out.println("\nNão conectado!!\n");
        }

        FabricaDeConexao.fecharConexao();

    }
}

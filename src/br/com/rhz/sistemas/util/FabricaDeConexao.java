/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rhz.sistemas.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rafael
 */
public class FabricaDeConexao {
    
    private static Connection conexao;
    
    private static final String URL_CONEXAO = "jdbc:postgresql://localhost:5432/ProjetoBarbearia";
    private static final String USUARIO = "postgres";
    private static final String SENHA = "arisco2017";
    private static final String DRIVER = "org.postgresql.Driver";
    
    public static Connection abrirConexao() {
        
        if(conexao == null){
            
            try {
                
                Class.forName(DRIVER);
                conexao = DriverManager.getConnection(URL_CONEXAO, USUARIO, SENHA);
                
            } catch (SQLException|ClassNotFoundException ex){
            
                Logger.getLogger(FabricaDeConexao.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Erro no método getConexao na classe FabricaConexao");
                
            }
            
        }
        
        return conexao;
    }
    
    public static void fecharConexao() {
        
        if(conexao != null){
            
            try {
                
                conexao.close();
                conexao = null;
                
            } catch (SQLException ex){
            
                Logger.getLogger(FabricaDeConexao.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Erro no método fecharConexao na classe FabricaConexao");
                
            }
            
            
        }
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rhz.sistemas.model;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Rafael
 */
public class Usuarios {

    private int codusuario;
    private String usuario;
    private String senha;
    private String nome;
    private Date data_cadastro;
    private String quem_cadastrou;
    private Date data_alteracao;
    private String quem_alterou;

    public Usuarios() {
    }

    public Usuarios(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public Usuarios(String usuario, String senha, String nome) {

        SimpleDateFormat dtf = new SimpleDateFormat("yyyy/MM/dd");
        Calendar calendar = Calendar.getInstance();
        Date dataHoje = calendar.getTime();

        this.usuario = usuario;
        this.senha = senha;
        this.nome = nome;
        this.quem_cadastrou = "dev";
        this.data_cadastro = dataHoje;
    }

    public int getCodusuario() {
        return codusuario;
    }

    public void setCodusuario(int codusuario) {
        this.codusuario = codusuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(Date data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    public String getQuem_cadastrou() {
        return quem_cadastrou;
    }

    public void setQuem_cadastrou(String quem_cadastrou) {
        this.quem_cadastrou = quem_cadastrou;
    }

    public Date getData_alteracao() {
        return data_alteracao;
    }

    public void setData_alteracao(Date data_alteracao) {
        this.data_alteracao = data_alteracao;
    }

    public String getQuem_alterou() {
        return quem_alterou;
    }

    public void setQuem_alterou(String quem_alterou) {
        this.quem_alterou = quem_alterou;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "codusuario=" + codusuario + ", usuario=" + usuario + ", senha=" + senha + ", nome=" + nome + ", data_cadastro=" + data_cadastro + ", quem_cadastrou=" + quem_cadastrou + ", data_alteracao=" + data_alteracao + ", quem_alterou=" + quem_alterou + '}';
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rhz.sistemas.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Rafael
 */
public class Servicos {

    private Integer codservico;
    private String nome;
    private Double valor;
    private String descricao;
    private Date data_cadastro;
    private String quem_cadastrou;

    public Servicos(String nome, Double valor, String descricao) {

        SimpleDateFormat dtf = new SimpleDateFormat("yyyy/MM/dd");
        Calendar calendar = Calendar.getInstance();
        Date dataHoje = calendar.getTime();

        this.nome = nome;
        this.valor = valor;
        this.descricao = descricao;
        this.quem_cadastrou = "dev";
        this.data_cadastro = dataHoje;
    }

    public Integer getCodservico() {
        return codservico;
    }

    public void setCodservico(Integer codservico) {
        this.codservico = codservico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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

    @Override
    public String toString() {
        return "Servicos{" + "codservico=" + codservico + ", nome=" + nome + ", valor=" + valor + ", descricao=" + descricao + ", data_cadastro=" + data_cadastro + ", quem_cadastrou=" + quem_cadastrou + '}';
    }

}

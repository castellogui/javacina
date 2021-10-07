package com.mycompany.javacinav2;

import java.time.LocalDate;

public class Pessoa {

    private int codigo;
    private String nomePessoa;
    private String endereçoPessoa;
    private String dataNascPessoa;
    private String trabalhaSaudePessoa;
    private LocalDate dataVacinacao;
    private int prioridade;

    public Pessoa() {

    }

    public Pessoa(String nomePessoa, String endereçoPessoa, String dataNascPessoa, String trabalhaSaudePessoa, int prioridade) {
        this.nomePessoa = nomePessoa;
        this.endereçoPessoa = endereçoPessoa;
        this.dataNascPessoa = dataNascPessoa;
        this.trabalhaSaudePessoa = trabalhaSaudePessoa;
        this.prioridade = prioridade;
    }

    public Pessoa(int codigo, LocalDate dataVacinacao) {
        this.codigo = codigo;
        this.dataVacinacao = dataVacinacao;
    }

    //GETs
    public int getCodigo() {
        return codigo;
    }
    
    public String getNomePessoa() {
        return nomePessoa;
    }

    public String getEndereçoPessoa() {
        return endereçoPessoa;
    }

    public String getDataNascPessoa() {
        return dataNascPessoa;
    }

    public String getTrabalhaSaudePessoa() {
        return trabalhaSaudePessoa;
    }

    public LocalDate getDataVacinacao() {
        return dataVacinacao;
    }

    public int getPrioridade() {
        return prioridade;
    }
    
    
    //SETs    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public void setEndereçoPessoa(String endereçoPessoa) {
        this.endereçoPessoa = endereçoPessoa;
    }

    public void setDataNascPessoa(String dataNascPessoa) {
        this.dataNascPessoa = dataNascPessoa;
    }

    public void setTrabalhaSaudePessoa(String trabalhaSaudePessoa) {
        this.trabalhaSaudePessoa = trabalhaSaudePessoa;
    }

    public void setDataVacinacao(LocalDate dataVacinacao) {
        this.dataVacinacao = dataVacinacao;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }
    
}

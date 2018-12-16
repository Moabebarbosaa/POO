package br.edu.ifpb.Dominio;

import java.io.Serializable;

public abstract class Pessoa implements Serializable {

    private Long id;
    private String nome;
    private Long cpf;



    public Pessoa(String nome, Long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }



    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf=" + cpf +
                '}';
    }
}

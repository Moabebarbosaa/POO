package br.edu.ifpb.Dominio;

import java.util.Date;

public class Hospede extends Pessoa {

    private Date dataNascimento;



    public Hospede(String nome, Long cpf, Date dataNascimento) {
        super(nome, cpf);
        this.dataNascimento = dataNascimento;
    }




    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }


    @Override
    public String toString() {
        return "Tipo: Hospede\n" +
                "ID: " + getId()  + "\n" +
                "Nome: " + getNome() + "\n" +
                "CPF: " + getCpf() + "\n" +
                "Data Nascimento: " + getDataNascimento() + "\n";
    }
}

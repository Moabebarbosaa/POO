package br.edu.ifpb.Dominio;

public class Funcionario extends Pessoa {

    private Double salario;



    public Funcionario(String nome, Long cpf, Double salario) {
        super(nome, cpf);
        this.salario = salario;
    }



    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }



    @Override
    public String toString() {
        String imprimir = "\n";
        imprimir += "Tipo: Funcionário" + "\n";
        imprimir += "ID: " +getId()+ "\n";
        imprimir += "Nome: " + getNome() + "\n";
        imprimir += "CPF: " + getCpf() + "\n";
        imprimir += "Salários: " + getSalario() + "\n";

        return imprimir;
    }
}

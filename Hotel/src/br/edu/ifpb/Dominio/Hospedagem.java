package br.edu.ifpb.Dominio;

import java.io.Serializable;

public class Hospedagem implements Serializable {

    private Long id;
    private Quarto quarto;
    private Funcionario funcionario;
    private Hospede hospede;
    private Double valor;
    private Periodo periodo;


    public Hospedagem(Quarto quarto, Funcionario funcionario, Hospede hospede, Double valor, Periodo periodo) {
        this.quarto = quarto;
        this.funcionario = funcionario;
        this.hospede = hospede;
        this.valor = valor;
        this.periodo = periodo;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }


    @Override
    public String toString() {
        return "=== Hospedagens ===\n\n" +
                "Id: " + id + "\n" +
                "Quarto: " + quarto + "\n" +
                "Funcionário: " + funcionario + "\n" +
                "Hospede: " + hospede + "\n" +
                "Valor: " + valor + "\n" +
                "Período: " + periodo + "\n\n";
    }
}

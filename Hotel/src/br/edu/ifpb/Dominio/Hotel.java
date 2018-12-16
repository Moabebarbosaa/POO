package br.edu.ifpb.Dominio;

import br.edu.ifpb.GeradorId.GeradorId;

import java.io.Serializable;
import java.util.ArrayList;

public class Hotel implements Serializable {

    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private ArrayList<Quarto> quartos = new ArrayList<>();
    private ArrayList<Hospede> hospedes = new ArrayList<>();
    private ArrayList<Hospedagem> hospedagens= new ArrayList<>();

    private GeradorId geradorId;

    public Hotel() {
    }

    public Hotel(GeradorId geradorId) {
        this.geradorId = geradorId;
    }


    public void adicionarQuarto(Quarto quarto) {
        Long id = this.geradorId.obterProximoId(this);
        quarto.setId(id);
        this.quartos.add(quarto);
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        Long id = this.geradorId.obterProximoId(this);
        funcionario.setId(id);
        this.funcionarios.add(funcionario);
    }

    public void adicionarHospede(Hospede hospede) {
        Long id = this.geradorId.obterProximoId(this);
        hospede.setId(id);
        this.hospedes.add(hospede);
    }

    public void adicionarHospedagens(Hospedagem hospedagem) {
        Long id = this.geradorId.obterProximoId(this);
        hospedagem.setId(id);
        this.hospedagens.add(hospedagem);
    }

    public void removerQuarto(Quarto quarto) {
        System.out.println("---------------------------------------");
        this.quartos.remove(quarto);
    }

    public void removerFuncionario(Funcionario funcionario) {
        quartos.remove(funcionario);
    }

    public void removerHospede(Hospede hospede) {
        quartos.remove(hospede);
    }




    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public ArrayList<Quarto> getQuartos() {
        return quartos;
    }

    public void setQuartos(ArrayList<Quarto> quartos) {
        this.quartos = quartos;
    }

    public ArrayList<Hospede> getHospedes() {
        return hospedes;
    }

    public void setHospedes(ArrayList<Hospede> hospedes) {
        this.hospedes = hospedes;
    }

    public ArrayList<Hospedagem> getHospedagens() {
        return hospedagens;
    }

    public void setHospedagens(ArrayList<Hospedagem> hospedagens) {
        this.hospedagens = hospedagens;
    }

    public GeradorId getGeradorId() {
        return geradorId;
    }

    public void setGeradorId(GeradorId geradorId) {
        this.geradorId = geradorId;
    }
}

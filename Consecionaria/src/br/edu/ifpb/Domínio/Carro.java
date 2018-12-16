package br.edu.ifpb.Domínio;

import br.edu.ifpb.Exception.ConcesionariaRuntimeException;

public class Carro extends Veículo {

    private Integer quantidadePorta;



    //CONSTRUTOR
    public Carro(String nome, Double preço, Integer quantidadePorta) {
        super(nome, preço);
        this.quantidadePorta = quantidadePorta;
    }



    //GETS AND SETS
    public Integer getQuantidadePorta() {
        return quantidadePorta;
    }
    public void setQuantidadePorta(Integer quantidadePorta) {
        this.quantidadePorta = quantidadePorta;
    }



    // TO STRING
    @Override
    public String toString() {
        return "Carro{" +
                "quantidadePorta=" + quantidadePorta +
                '}';
    }



    // SOBRESCREVENDO MÉTODOS DO PAI
    @Override
    public String obterRepresentacaoTextual() {
        String texto = "";
        texto += "Tipo: CARRO" + LS;
        texto += "Id: " + getId() + LS;
        texto += "Nome: " + getNome() + LS;
        texto += "Preço: " + getPreço() + LS;
        texto += "Quantidade de portas: " + getQuantidadePorta() + LS;
        return texto;
    }



    // TRATAMENTO DE ERRO
    @Override
    public void validarValores() {
        if(quantidadePorta < 2 || quantidadePorta > 4 ) {
            throw new ConcesionariaRuntimeException("Não existe carro com essa quantidade de portas !!!");
        }

    }



}

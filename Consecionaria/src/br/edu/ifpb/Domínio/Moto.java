package br.edu.ifpb.Domínio;

import br.edu.ifpb.Exception.ConcesionariaRuntimeException;

public class Moto extends Veículo {

    private Integer velocidadeMax;


    //CONSTRUTOR
    public Moto(String nome, Double preço, Integer velocidadeMax) {
        super(nome, preço);
        this.velocidadeMax = velocidadeMax;
    }



    // GETS AND SETS
    public Integer getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(Integer velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }





    @Override
    public String toString() {
        return "Moto{" +
                "velocidadeMax=" + velocidadeMax +
                '}';
    }

    @Override
    public String obterRepresentacaoTextual() {
        String texto = "";
        texto += "Tipo: MOTO" + LS;
        texto += "Id: " + getId() + LS;
        texto += "Nome: " + getNome() + LS;
        texto += "Preço: " + getPreço() + LS;
        texto += "Velocidade máxima: " + getVelocidadeMax() + LS;
        return texto;
    }

    @Override
    public void validarValores() {
        if (velocidadeMax < 0) {
            throw new ConcesionariaRuntimeException("Velocidade inválida !");
        }
    }
}

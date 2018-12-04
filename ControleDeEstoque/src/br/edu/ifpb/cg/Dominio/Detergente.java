package br.edu.ifpb.cg.Dominio;

import br.edu.ifpb.cg.Exceptions.EstoqueRuntimeException;

public class Detergente extends Produto{

    private Boolean neutro;

    public Detergente(String marca, Integer quantidade, MinhaData dataValidade, Boolean neutro) {
        super(marca, quantidade, dataValidade);
        this.neutro = neutro;
    }

    public Boolean getNeutro() {
        return neutro;
    }

    public void setNeutro(Boolean neutro) {
        this.neutro = neutro;
    }

    @Override
    public void validarValores() {

    }

    @Override
    public String obterRepresentacaoTextual() {
        String texto = "";
        texto += "Produto: Detergente" + LS;
        texto += "Id: " + getId() + LS;
        texto += "Marca: " + getMarca() + LS;
        texto += "Quantidade: " + getQuantidade() + LS;
        texto += "É neutro? " + getNeutro() + LS;
        texto += "Data de Validade: " + getDataValidade().getDia() + "/" + getDataValidade().getMes() + "/" + getDataValidade().getAno() + LS;
        return texto;
    }


    @Override
    public String toString() {
        return "Detergente{" +
                "neutro=" + neutro +
                '}';
    }
}

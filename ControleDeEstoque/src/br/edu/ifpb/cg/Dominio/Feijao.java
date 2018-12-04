package br.edu.ifpb.cg.Dominio;

import br.edu.ifpb.cg.Exceptions.EstoqueRuntimeException;

public class Feijao extends Produto{

    private Integer kg;

    public Feijao(String marca, Integer quantidade, MinhaData dataValidade, Integer kg) {
        super(marca, quantidade, dataValidade);
        this.kg = kg;
    }

    public Integer getKg() {
        return kg;
    }

    public void setKg(Integer kg) {
        this.kg = kg;
    }

    @Override
    public String obterRepresentacaoTextual() {
        String texto = "";
        texto += "Tipo: Feijão" + LS;
        texto += "Id: " + getId() + LS;
        texto += "Marca: " + getMarca() + LS;
        texto += "Quantidade: " + getQuantidade() + LS;
        texto += "Kg: " + getKg() + LS;
        texto += "Data de Validade: " + getDataValidade().getDia() + "/" + getDataValidade().getMes() + "/" + getDataValidade().getAno();
        return texto;
    }

    @Override
    public void validarValores() {
    }

    @Override
    public String toString() {
        return "Feijao{" +
                "kg=" + kg +
                '}';
    }

}

package br.edu.ifpb.cg.Dominio;

import java.io.Serializable;
import java.util.Objects;

public abstract class Produto implements Serializable, RepresentacaoTextual {

    protected static final String LS = System.lineSeparator();

    private Long id;
    private String marca;
    private Integer quantidade;
    private MinhaData dataValidade;

    public Produto(String marca, Integer quantidade, MinhaData dataValidade) {
        super();
        this.marca = marca;
        this.quantidade = quantidade;
        this.dataValidade = dataValidade;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public MinhaData getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(MinhaData dataValidade) {
        this.dataValidade = dataValidade;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(id, produto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }



    public abstract void validarValores();



    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", quantidade=" + quantidade +
                ", dataValidade=" + dataValidade +
                '}';
    }
}

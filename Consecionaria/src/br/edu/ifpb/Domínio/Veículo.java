package br.edu.ifpb.Domínio;

import java.io.Serializable;
import java.util.Objects;

public abstract class Veículo implements RepresentacaoTextual, Serializable {

    protected static final String LS = System.lineSeparator();

    private String nome;
    private Double preço;
    private Long id;



    public Veículo(String nome, Double preço) {
        super();
        this.nome = nome;
        this.preço = preço;
    }




    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreço() {
        return preço;
    }

    public void setPreço(Double preço) {
        this.preço = preço;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public abstract void validarValores();



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Veículo veículo = (Veículo) o;
        return Objects.equals(id, veículo.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Veículo{" +
                "nome='" + nome + '\'' +
                ", preço=" + preço +
                ", id=" + id +
                '}';
    }
}

package br.edu.ifpb.Dominio;

import java.io.Serializable;

public abstract class Quarto implements Serializable {

    private Long id;
    private Integer numero;
    private Integer andar;
    private Integer quantidadeMaximaPessoas;



    public Quarto(Integer numero, Integer andar, Integer quantidadeMaximaPessoas) {
        this.numero = numero;
        this.andar = andar;
        this.quantidadeMaximaPessoas = quantidadeMaximaPessoas;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getAndar() {
        return andar;
    }

    public void setAndar(Integer andar) {
        this.andar = andar;
    }

    public Integer getQuantidadeMaximaPessoas() {
        return quantidadeMaximaPessoas;
    }

    public void setQuantidadeMaximaPessoas(Integer quantidadeMaximaPessoas) {
        this.quantidadeMaximaPessoas = quantidadeMaximaPessoas;
    }


}

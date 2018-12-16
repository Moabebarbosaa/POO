package br.edu.ifpb.Dominio;

public class QuartoSimples extends Quarto{

    private Boolean ehDuplo;
    private Boolean temArCondicionado;



    public QuartoSimples(Integer numero, Integer andar, Integer quantidadeMaximaPessoas, Boolean ehDuplo, Boolean temArCondicionado) {
        super(numero, andar, quantidadeMaximaPessoas);
        this.ehDuplo = ehDuplo;
        this.temArCondicionado = temArCondicionado;
    }




    public Boolean getEhDuplo() {
        return ehDuplo;
    }

    public void setEhDuplo(Boolean ehDuplo) {
        this.ehDuplo = ehDuplo;
    }

    public Boolean getTemArCondicionado() {
        return temArCondicionado;
    }

    public void setTemArCondicionado(Boolean temArCondicionado) {
        this.temArCondicionado = temArCondicionado;
    }



    @Override
    public String toString() {

        String imprimir = "";
        imprimir += "Tipo: Quarto Master" + "\n";
        imprimir += "ID: " + getId() + "\n";
        imprimir += "Número: " + getNumero() + "\n";
        imprimir += "Andar: " + getAndar() + "\n";
        imprimir += "Quantidade máxima de pessoas: " + getQuantidadeMaximaPessoas() + "\n";
        imprimir += "É duplo? " + getEhDuplo() + "\n";
        imprimir += "Tem ar-condicionado? " + getTemArCondicionado() + "\n";

        return imprimir;
    }
}

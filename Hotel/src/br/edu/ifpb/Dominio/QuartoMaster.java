package br.edu.ifpb.Dominio;

public class QuartoMaster extends Quarto {

    private Boolean temHidromassagem;
    private Boolean temVistaMar;



    public QuartoMaster(Integer numero, Integer andar, Integer quantidadeMaximaPessoas, Boolean temHidromassagem, Boolean temVistaMar) {
        super(numero, andar, quantidadeMaximaPessoas);
        this.temHidromassagem = temHidromassagem;
        this.temVistaMar = temVistaMar;
    }



    public Boolean getTemHidromassagem() {
        return temHidromassagem;
    }

    public void setTemHidromassagem(Boolean temHidromassagem) {
        this.temHidromassagem = temHidromassagem;
    }

    public Boolean getTemVistaMar() {
        return temVistaMar;
    }

    public void setTemVistaMar(Boolean temVistaMar) {
        this.temVistaMar = temVistaMar;
    }



    @Override
    public String toString() {

        String imprimir = "";
        imprimir += "Tipo: Quarto Master" + "\n";
        imprimir += "ID: " + getId() + "\n";
        imprimir += "Número: " + getNumero() + "\n";
        imprimir += "Andar: " + getAndar() + "\n";
        imprimir += "Quantidade máxima de pessoas: " + getQuantidadeMaximaPessoas() + "\n";
        imprimir += "Tem hidromassagem? " + getTemHidromassagem() + "\n";
        imprimir += "Tem vista para o mar? " + getTemVistaMar() + "\n";

        return imprimir;
    }
}

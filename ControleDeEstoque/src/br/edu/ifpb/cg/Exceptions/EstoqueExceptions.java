package br.edu.ifpb.cg.Exceptions;

public class EstoqueExceptions extends Exception{

    public EstoqueExceptions(String mensagem) {
        super(mensagem);
    }

    public EstoqueExceptions(String mensagem, Throwable erro) {
        super(mensagem, erro);
    }

}

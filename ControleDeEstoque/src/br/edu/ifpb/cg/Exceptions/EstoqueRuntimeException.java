package br.edu.ifpb.cg.Exceptions;

public class EstoqueRuntimeException extends RuntimeException{

    public EstoqueRuntimeException(String mensagem) {
        super(mensagem);
    }


    public EstoqueRuntimeException(String mensagem, Throwable erro) {
        super(mensagem, erro);
    }

}

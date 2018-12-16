package br.edu.ifpb.Exception;

public class ConcesionariaException extends Exception {

    public ConcesionariaException(String mensagem) {
        super(mensagem);
    }

    public ConcesionariaException(String mensagem, Throwable erro) {
        super(mensagem, erro);
    }
}

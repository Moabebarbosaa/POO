package br.edu.ifpb.Exception;

public class ConcesionariaRuntimeException extends RuntimeException{

    public ConcesionariaRuntimeException(String mensagem) {
        super(mensagem);
    }

    public ConcesionariaRuntimeException(String mensagem, Throwable erro) {
        super(mensagem, erro);
    }


}

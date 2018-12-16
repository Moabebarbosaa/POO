package br.edu.ifpb.Exception;

public class VeiculoNaoEncontradoException extends ConcesionariaException {

    public VeiculoNaoEncontradoException(Long id) {
        super("Veículo do id " + id + " não encontrado !");
    }
}

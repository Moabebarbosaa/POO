package br.edu.ifpb.cg.Exceptions;

public class ProdutoNaoEncontradoException extends EstoqueExceptions{

    public ProdutoNaoEncontradoException(Long id) {
        super("Produto do id " + id + " não encontrado !");
    }

}

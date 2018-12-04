package br.edu.ifpb.cg.Dominio;

import br.edu.ifpb.cg.Exceptions.EstoqueExceptions;
import br.edu.ifpb.cg.Exceptions.ProdutoNaoEncontradoException;
import br.edu.ifpb.cg.GeradorId.GeradorId;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

public class Estoque implements RepresentacaoTextual, Serializable {

    private Collection<Produto> produtos;

    private GeradorId geradorId;


    public Estoque(GeradorId geradorId) {
        this.produtos = new ArrayList<Produto>();
        this.geradorId = geradorId;
    }


    public Collection<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(Collection<Produto> produtos) {
        this.produtos = produtos;
    }

    public GeradorId getGeradorId() {
        return geradorId;
    }

    public void setGeradorId(GeradorId geradorId) {
        this.geradorId = geradorId;
    }



    public void adicionarProduto(Produto produto) throws EstoqueExceptions {
        produto.validarValores();
        Long id = this.geradorId.obterProximoId(this);
        produto.setId(id);
        this.produtos.add(produto);
    }

    public void removerProduto(Long id) throws EstoqueExceptions {
        Produto produtoASerRemovido = null;

        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                produtoASerRemovido = produto;
                break;
            }
        }

        if (produtoASerRemovido == null) {
            throw new ProdutoNaoEncontradoException(id);
        }
    }



    @Override
    public String obterRepresentacaoTextual() {
        return "ESTOQUE";
    }

}

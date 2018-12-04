package br.edu.ifpb.cg.MenuPrincipal;

import br.edu.ifpb.cg.Dominio.Estoque;
import br.edu.ifpb.cg.Dominio.Produto;
import br.edu.ifpb.cg.Exceptions.EstoqueExceptions;

import java.util.Collection;
import java.util.Scanner;

public class hhMenuRemoverProduto extends MenuAbstrato implements Menu {

    public hhMenuRemoverProduto(Estoque MBA, Scanner sc) {
        super(MBA, sc);
    }

    @Override
    public boolean exibirMenu() throws EstoqueExceptions {
        String texto = "";
        texto += "=================================" + LS;
        texto += "|======= REMOVER PRODUTO =======|" + LS;
        texto += "=================================" + LS;
        System.out.println(texto);

        Long id = obterValorLong("Informe o ID do produto que deseja remover: ");

        Collection<Produto> produtos = this.MBA.getProdutos();

        if (produtos.isEmpty()) {
            System.out.println("Não há produtos !!!");
        }
        else {
            for (Produto produto : produtos) {
                if (produto.getId().equals(id)) {
                    this.MBA.removerProduto(id);
                    return true;
                }
            }
        }
        System.out.println("Id não encontrado !");
        return true;
    }
}

package br.edu.ifpb.cg.MenuPrincipal;

import br.edu.ifpb.cg.Dominio.Estoque;
import br.edu.ifpb.cg.Dominio.Produto;
import br.edu.ifpb.cg.Exceptions.EstoqueExceptions;

import java.util.Collection;
import java.util.Scanner;

public class jjMenuDiminuirQuantidadeProdutosEstoque extends MenuAbstrato implements Menu {

    public jjMenuDiminuirQuantidadeProdutosEstoque(Estoque MBA, Scanner sc) {
        super(MBA, sc);
    }

    @Override
    public boolean exibirMenu() throws EstoqueExceptions {

        String texto = "";
        texto += "============================================================" + LS;
        texto += "|======= DIMINUIR QUANTIDADE DE PRODUTOS NO ESTOQUE =======|" + LS;
        texto += "============================================================" + LS;
        System.out.println(texto);


        Long id = obterValorLong("Informe o ID do produto que deseja decrementar: ");


        Collection<Produto> produtos = this.MBA.getProdutos();

        if (produtos.isEmpty()) {
            System.out.println("Não há produtos !!!");
        }
        else {
            for (Produto produto : produtos) {
                if (produto.getId().equals(id) && produto.getQuantidade() > 0) {
                    Integer qtd = produto.getQuantidade();

                    produto.setQuantidade(qtd - 1);
                    return true;
                }
            }
        }
        System.out.println();
        System.out.println("Operação Inválida !");
        System.out.println();
        return true;
    }
}

package br.edu.ifpb.cg.MenuPrincipal;

import br.edu.ifpb.cg.Dominio.Estoque;
import br.edu.ifpb.cg.Dominio.Produto;
import br.edu.ifpb.cg.Exceptions.EstoqueExceptions;

import java.util.Collection;
import java.util.Scanner;

public class aaMenuListarProdutos extends MenuAbstrato implements Menu {

    public aaMenuListarProdutos(Estoque MBA, Scanner sc) {
        super(MBA, sc);
    }

    @Override
    public boolean exibirMenu() throws EstoqueExceptions {
        String texto = "";
        texto += "================================" + LS;
        texto += "|======= LISTAR PRODUTOS =======|" + LS;
        texto += "================================" + LS;
        System.out.println(texto);

        Collection<Produto> produtos = this.MBA.getProdutos();

        if (produtos.isEmpty()) {
            System.out.println("Não há produtos !!!");
        }
        else {
            for (Produto produto : produtos) {
                imprimir(produto);
                System.out.println();
            }
        }
        System.out.println();
        return true;
    }
}

package br.edu.ifpb.cg.MenuPrincipal;

import br.edu.ifpb.cg.Dominio.Estoque;
import br.edu.ifpb.cg.Dominio.Produto;
import br.edu.ifpb.cg.Exceptions.EstoqueExceptions;
import br.edu.ifpb.cg.Ordenacao.ComparadorAlfabetico;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class bbMenuListarProdutosEmOrdemAlfabetica extends MenuAbstrato implements Menu{

    public bbMenuListarProdutosEmOrdemAlfabetica(Estoque MBA, Scanner sc) {
        super(MBA, sc);
    }

    @Override
    public boolean exibirMenu() throws EstoqueExceptions {
        String menu = "";
        menu += "=========================================================" + LS;
        menu += "|======== Listar Produtos Em Ordem Alfabetica ==========|" + LS;
        menu += "=========================================================" + LS;
        System.out.println(menu);

        Collection<Produto> produtos = this.MBA.getProdutos();

        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto encontrado !");
        } else {
            List<Produto> produtosOrdenados = new ArrayList<>(produtos);
            produtosOrdenados.sort(new ComparadorAlfabetico());

            for (Produto produto : produtosOrdenados) {
                imprimir(produto);
            }
        }
        System.out.println();
        return true;
    }

}

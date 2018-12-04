package br.edu.ifpb.cg.MenuPrincipal;

import br.edu.ifpb.cg.Dominio.Estoque;
import br.edu.ifpb.cg.Dominio.MinhaData;
import br.edu.ifpb.cg.Dominio.Produto;
import br.edu.ifpb.cg.Exceptions.EstoqueExceptions;
import br.edu.ifpb.cg.Ordenacao.ComparadorValidade;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class eeMenuListarProdutosVencidos extends MenuAbstrato implements Menu {

    public eeMenuListarProdutosVencidos(Estoque MBA, Scanner sc) {
        super(MBA, sc);
    }

    @Override
    public boolean exibirMenu() throws EstoqueExceptions {
        String menu = "";
        menu += "=============================================" + LS;
        menu += "|======== Listar Produtos Vencidos =========|" + LS;
        menu += "=============================================" + LS;
        System.out.println(menu);




        Collection<Produto> produtos = this.MBA.getProdutos();

        if (produtos.isEmpty()) {
            System.out.println("Não há produtos!");
            return true;
        }

        ArrayList<Produto> vencidos = new ArrayList<Produto>();

        MinhaData data = obterValorData("Informe a data que deseja saber quais produtos estarão vencidos: ");

        for (Produto produto : produtos) {
            if ((produto.getDataValidade().compareTo(data)) == -1) {
                vencidos.add(produto);}
        }

        for (Produto produto : vencidos) {
            System.out.println();
            imprimir(produto);
            System.out.println();
        }
        return true;
    }
}

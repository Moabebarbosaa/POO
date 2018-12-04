package br.edu.ifpb.cg.MenuPrincipal;

import br.edu.ifpb.cg.Dominio.Estoque;
import br.edu.ifpb.cg.Dominio.Feijao;
import br.edu.ifpb.cg.Dominio.MinhaData;
import br.edu.ifpb.cg.Exceptions.EstoqueExceptions;

import java.util.Scanner;

public class ggMenuAdicionarFeijao extends MenuAbstrato implements Menu{

    public ggMenuAdicionarFeijao(Estoque MBA, Scanner sc) {
        super(MBA, sc);
    }

    @Override
    public boolean exibirMenu() throws EstoqueExceptions {
        String texto = "";
        texto += "=====================================" + LS;
        texto += "|======== ADICIONAR FEIJÂO =========|" + LS;
        texto += "=====================================" + LS;
        System.out.println(texto);

        String marca = obterValorString("Informe a marca: ");
        Integer quantidade = obterValorInteger("Informe a quantidade: ");
        MinhaData data = obterValorData("Informe a data de validade: ");
        Integer kg = obterValorInteger("Informe o kg: ");

        Feijao produto = new Feijao(marca, quantidade, data, kg);

        this.MBA.adicionarProduto(produto);

        System.out.println();
        System.out.println("Feijão adicionado com sucesso!");
        System.out.println();

        return true;
    }
}

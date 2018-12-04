package br.edu.ifpb.cg.MenuPrincipal;

import br.edu.ifpb.cg.Dominio.Detergente;
import br.edu.ifpb.cg.Dominio.Estoque;
import br.edu.ifpb.cg.Dominio.MinhaData;
import br.edu.ifpb.cg.Exceptions.EstoqueExceptions;

import java.util.Scanner;

public class ffMenuAdicionarDetergente extends MenuAbstrato implements Menu{

    public ffMenuAdicionarDetergente(Estoque MBA, Scanner sc) {
        super(MBA, sc);
    }

    @Override
    public boolean exibirMenu() throws EstoqueExceptions {
        String texto = "";
        texto += "==========================================" + LS;
        texto += "|======== ADICIONAR DETERGENTE ==========|" + LS;
        texto += "==========================================" + LS;
        System.out.println(texto);

        String marca = obterValorString("Informe a marca: ");
        Integer quantidade = obterValorInteger("Informe a quantidade: ");
        MinhaData data = obterValorData("Informe a Data de Validade: ");
        Boolean neutro = obterValorBoolean("Informe se é Neutro (Sim ou Não): ");

        Detergente produto = new Detergente(marca, quantidade, data, neutro);

        this.MBA.adicionarProduto(produto);

        System.out.println();
        System.out.println("Detergente adicionado com sucesso!");
        System.out.println();

        return true;
    }

}

package br.edu.ifpb.Menu;

import br.edu.ifpb.Domínio.Carro;
import br.edu.ifpb.Domínio.Concesionaria;
import br.edu.ifpb.Exception.ConcesionariaException;

import java.util.Scanner;

public class MenuAdicionarCarro extends MenuAbstrato implements Menu {

    public MenuAdicionarCarro(Concesionaria MBA, Scanner sc) {
        super(MBA, sc);
    }

    @Override
    public boolean exibirMenu() throws ConcesionariaException {
        String texto = "";
        texto += "=====================================" + LS;
        texto += "|======== ADICIONAR CARRO ==========|" + LS;
        texto += "=====================================" + LS;
        System.out.println(texto);

        String nome = obterValorString("Informe o nome: ");
        Double preco = obterValorDouble("Informe o preço: ");
        Integer quatidadePorta = obterValorInteger("Informe a quantidade de portas: ");
        Carro veiculo = new Carro(nome, preco, quatidadePorta);
        this.MBA.adicionarVeiculo(veiculo);

        System.out.println();
        System.out.println("Carro adicionado com sucesso!");
        System.out.println();

        return true;
    }
}

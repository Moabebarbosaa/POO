package br.edu.ifpb.Menu;

import br.edu.ifpb.Domínio.Concesionaria;
import br.edu.ifpb.Domínio.Moto;
import br.edu.ifpb.Exception.ConcesionariaException;

import java.util.Scanner;

public class MenuAdicionarMoto extends MenuAbstrato implements Menu {

    public MenuAdicionarMoto(Concesionaria MBA, Scanner sc) {
        super(MBA, sc);
    }

    @Override
    public boolean exibirMenu() throws ConcesionariaException {
        String texto = "";
        texto += "==================================" + LS;
        texto += "|======== ADICIONAR MOTO ========|" + LS;
        texto += "==================================" + LS;
        System.out.println(texto);

        String nome = obterValorString("Informe o nome: ");
        Double preço = obterValorDouble("Informe o preço: ");
        Integer velocidadeMax = obterValorInteger("Informe a velocidade máxima: ");
        Moto veiculo = new Moto(nome, preço, velocidadeMax);
        this.MBA.adicionarVeiculo(veiculo);

        System.out.println();
        System.out.println("Moto adicionada com sucesso !!");
        System.out.println();

        return true;
    }
}

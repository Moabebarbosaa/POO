package br.edu.ifpb.Menu;

import br.edu.ifpb.Domínio.Concesionaria;
import br.edu.ifpb.Exception.ConcesionariaException;

import java.util.Scanner;

public class MenuRemoverVeiculo extends MenuAbstrato implements Menu {

    public MenuRemoverVeiculo(Concesionaria MBA, Scanner sc) {
        super(MBA, sc);
    }

    @Override
    public boolean exibirMenu() throws ConcesionariaException {
        String texto = "";
        texto += "=================================" + LS;
        texto += "|======= REMOVER VEÍCULO =======|" + LS;
        texto += "=================================" + LS;
        System.out.println(texto);

        Long id = obterValorLong("Informe o ID do veículo que deseja remover: ");
        this.MBA.removerVeiculo(id);

        return true;
    }
}

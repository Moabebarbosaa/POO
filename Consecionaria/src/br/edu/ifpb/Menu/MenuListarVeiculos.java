package br.edu.ifpb.Menu;

import br.edu.ifpb.Domínio.Concesionaria;
import br.edu.ifpb.Domínio.Veículo;
import br.edu.ifpb.Exception.ConcesionariaException;

import java.util.Collection;
import java.util.Scanner;

public class MenuListarVeiculos extends MenuAbstrato implements Menu {

    public MenuListarVeiculos(Concesionaria MBA, Scanner sc) {
        super(MBA, sc);
    }

    @Override
    public boolean exibirMenu() throws ConcesionariaException {
        String texto = "";
        texto += "================================" + LS;
        texto += "|======= LISTAR VEÍCULOS =======|" + LS;
        texto += "================================" + LS;
        System.out.println(texto);

        Collection<Veículo> veiculos = this.MBA.getVeiculos();

        if (veiculos.isEmpty()) {
            System.out.println("Não há veículos !!!");
        }
        else {
            for (Veículo veiculo : veiculos) {
                imprimir(veiculo);
            }
        }

        return true;
    }
}

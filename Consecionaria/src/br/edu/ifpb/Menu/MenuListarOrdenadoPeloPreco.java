package br.edu.ifpb.Menu;

import br.edu.ifpb.Domínio.Concesionaria;
import br.edu.ifpb.Domínio.Veículo;
import br.edu.ifpb.Exception.ConcesionariaException;
import br.edu.ifpb.Útil.ComparatorVeículo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class MenuListarOrdenadoPeloPreco extends MenuAbstrato implements Menu {

    public MenuListarOrdenadoPeloPreco(Concesionaria MBA, Scanner sc) {
        super(MBA, sc);
    }

    @Override
    public boolean exibirMenu() throws ConcesionariaException {
        String menu = "";
        menu += "=========================================================" + LS;
        menu += "|======== Listar Veículos Ordenados Pelo Preço =========|" + LS;
        menu += "=========================================================" + LS;
        System.out.println(menu);

        Collection<Veículo> veiculos = this.MBA.getVeiculos();

        if (veiculos.isEmpty()) {
            System.out.println("Nenhum veículo encontrado !!");
        } else {
            List<Veículo> veiculosOrdenados = new ArrayList<>(veiculos);
            veiculosOrdenados.sort(new ComparatorVeículo());

            for (Veículo veiculo : veiculosOrdenados) {
                imprimir(veiculo);
            }
        }
        System.out.println();

        return true;
    }
}

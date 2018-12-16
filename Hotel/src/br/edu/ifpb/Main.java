package br.edu.ifpb;

import br.edu.ifpb.Armazenamento.Armazenamento;
import br.edu.ifpb.Armazenamento.ArmazenamentoBinario;
import br.edu.ifpb.Dominio.Hotel;
import br.edu.ifpb.GeradorId.GeradorId;
import br.edu.ifpb.GeradorId.GeradorIdSequencial;
import br.edu.ifpb.Menu.MenuPrincipal;

public class Main {

    public static void main(String[] args) {

        GeradorId geradorId = new GeradorIdSequencial();


        Armazenamento armazenamento = new ArmazenamentoBinario();
        Hotel MBA = armazenamento.recuperar(geradorId);

        MenuPrincipal menu = new MenuPrincipal(MBA);
        menu.exibirMenu();

        armazenamento.armazenar(MBA);

    }
}

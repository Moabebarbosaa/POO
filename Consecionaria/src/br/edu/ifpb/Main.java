package br.edu.ifpb;

import br.edu.ifpb.Armazenamento.Armazenamento;
import br.edu.ifpb.Armazenamento.ArmazenamentoEmArquivoBinario;
import br.edu.ifpb.Domínio.Concesionaria;
import br.edu.ifpb.Exception.ConcesionariaException;
import br.edu.ifpb.GeradorID.GeradorId;
import br.edu.ifpb.GeradorID.GeradorIdSequencial;
import br.edu.ifpb.Menu.MenuPrincipal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ConcesionariaException {

        Armazenamento armazenamento = null;
        armazenamento = new ArmazenamentoEmArquivoBinario("MBA.ser");

        GeradorId geradorId = null;
        geradorId = new GeradorIdSequencial();

        Concesionaria MBA = armazenamento.recuperar(geradorId);
        Scanner sc = new Scanner(System.in);

        MenuPrincipal menu = new MenuPrincipal(MBA, sc);


        boolean continuarExecucao = true;
        while (continuarExecucao) {
            try {
                continuarExecucao = menu.exibirMenu();
            } catch(ConcesionariaException e) {
                System.out.println();
                System.out.println(e.getMessage());
                System.out.println();
            } finally {
                armazenamento.amazenar(MBA);
            }
        }
    }
}

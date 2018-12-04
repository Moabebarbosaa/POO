package br.edu.ifpb.cg;

import br.edu.ifpb.cg.Armazenamento.Armazenamento;
import br.edu.ifpb.cg.Armazenamento.ArmazenamentoBinario;
import br.edu.ifpb.cg.Dominio.Estoque;
import br.edu.ifpb.cg.Exceptions.EstoqueExceptions;
import br.edu.ifpb.cg.GeradorId.GeradorId;
import br.edu.ifpb.cg.GeradorId.GeradorIdNanoTime;
import br.edu.ifpb.cg.GeradorId.GeradorIdSequencial;
import br.edu.ifpb.cg.MenuPrincipal.MenuPrincipal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws EstoqueExceptions {

        Armazenamento armazenamento = null;
        armazenamento = new ArmazenamentoBinario("MBA.ser");

        GeradorId geradorId = null;
//        geradorId = new GeradorIdNanoTime();
        geradorId = new GeradorIdSequencial();

        Estoque MBA = armazenamento.recuperar(geradorId);
        Scanner sc = new Scanner(System.in);

        MenuPrincipal menu = new MenuPrincipal(MBA, sc);

        boolean continuarExecucao = true;
        while (continuarExecucao) {
            try {
                continuarExecucao = menu.exibirMenu();
            } catch(EstoqueExceptions e) {
                System.out.println(e.getMessage());
            } finally {
                armazenamento.amazenar(MBA);
            }
        }
    }
}


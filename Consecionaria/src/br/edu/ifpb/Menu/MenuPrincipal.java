package br.edu.ifpb.Menu;

import br.edu.ifpb.Domínio.Concesionaria;
import br.edu.ifpb.Exception.ConcesionariaException;

import java.util.Scanner;

public class MenuPrincipal extends MenuAbstrato {

    private MenuAdicionarCarro menuAdicionarCarro;
    private MenuAdicionarMoto menuAdicionarMoto;
    private MenuRemoverVeiculo menuRemoverVeiculo;
    private MenuListarVeiculos menuListarVeiculos;
    private MenuSobre menuSobre;
    private MenuListarOrdenadoPeloPreco menuListarOrdenadoPeloPreco;


    public MenuPrincipal(Concesionaria MBA, Scanner sc) {
        super(MBA, sc);
        this.menuAdicionarCarro = new MenuAdicionarCarro(MBA, sc);
        this.menuAdicionarMoto = new MenuAdicionarMoto(MBA, sc);
        this.menuRemoverVeiculo = new MenuRemoverVeiculo(MBA, sc);
        this.menuListarVeiculos = new MenuListarVeiculos(MBA, sc);
        this.menuSobre = new MenuSobre(MBA, sc);
        this.menuListarOrdenadoPeloPreco = new MenuListarOrdenadoPeloPreco(MBA, sc);
    }



    @Override
    public boolean exibirMenu() throws ConcesionariaException {
        int opcao = 0;
        String menu = "";
        menu += "===============================" + LS;
        menu += "|======= Menu Principal =======" + LS;
        menu += "===============================" + LS;
        menu += ++opcao + ". Adicionar Carro" + LS;
        menu += ++opcao + ". Adicionar Moto" + LS;
        menu += ++opcao + ". Remover Veículo" + LS;
        menu += ++opcao + ". Listar Veículo" + LS;
        menu += ++opcao + ". Sobre" + LS;
        menu += ++opcao + ". Sair" + LS;
        menu += ++opcao + ". Listar Ordenado Pelo Preço" + LS;

        while (true) {
            System.out.println(menu);
            int opcaoEscolhida = obterValorInteger("Digite uma opção: ");
            Menu menuSelecionado = null;
            switch (opcaoEscolhida) {
                case 1:
                    menuSelecionado = this.menuAdicionarCarro;
                    break;
                case 2:
                    menuSelecionado = this.menuAdicionarMoto;
                    break;
                case 3:
                    menuSelecionado = this.menuRemoverVeiculo;
                    break;
                case 4:
                    menuSelecionado = this.menuListarVeiculos;
                    break;
                case 5:
                    menuSelecionado = this.menuSobre;
                    break;
                case 6:
                    // Sair do programa
                    return false;
                case 7:
                    menuSelecionado = this.menuListarOrdenadoPeloPreco;
                    break;
                default:
                    System.out.println();
                    System.out.println("Erro! Opção desconhecida: " + opcaoEscolhida);
                    System.out.println();
                    break;
            }
            if (menuSelecionado != null) {
                menuSelecionado.exibirMenu();
            }
        }
    }
}

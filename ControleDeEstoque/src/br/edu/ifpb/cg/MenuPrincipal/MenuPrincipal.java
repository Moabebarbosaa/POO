package br.edu.ifpb.cg.MenuPrincipal;

import br.edu.ifpb.cg.Dominio.Estoque;
import br.edu.ifpb.cg.Exceptions.EstoqueExceptions;

import java.util.Scanner;

public class MenuPrincipal extends MenuAbstrato {


    private aaMenuListarProdutos aaMenuListarProdutos;
    private bbMenuListarProdutosEmOrdemAlfabetica bbMenuListarProdutosEmOrdemAlfabetica;
    private ccMenuListarProdutosEmOrdemCrescenteQuantidade ccMenuListarProdutosEmOrdemCrescenteQuantidade;
    private ddMenuListarProdutosEmOrdemCrescenteDeValidade menuListarProdutosEmOrdemCrescenteDeDataValidade;
    private eeMenuListarProdutosVencidos eeMenuListarProdutosVencidos;
    private ffMenuAdicionarDetergente ffMenuAdicionarDetergente;
    private ggMenuAdicionarFeijao ggMenuAdicionarFeijao;
    private hhMenuRemoverProduto menuRemoveProduto;
    private iiMenuIncrementarQuantidadeProdutosEstoque iiMenuIncrementarQuantidadeProdutosEstoque;
    private jjMenuDiminuirQuantidadeProdutosEstoque jjMenuDiminuirQuantidadeProdutosEstoque;

    public MenuPrincipal(Estoque MBA, Scanner sc) {
        super(MBA, sc);
        this.aaMenuListarProdutos = new aaMenuListarProdutos(MBA, sc);
        this.bbMenuListarProdutosEmOrdemAlfabetica = new bbMenuListarProdutosEmOrdemAlfabetica(MBA, sc);
        this.ccMenuListarProdutosEmOrdemCrescenteQuantidade = new ccMenuListarProdutosEmOrdemCrescenteQuantidade(MBA, sc);
        this.menuListarProdutosEmOrdemCrescenteDeDataValidade = new ddMenuListarProdutosEmOrdemCrescenteDeValidade(MBA, sc);
        this.eeMenuListarProdutosVencidos = new eeMenuListarProdutosVencidos(MBA, sc);
        this.ffMenuAdicionarDetergente = new ffMenuAdicionarDetergente(MBA, sc);
        this.ggMenuAdicionarFeijao = new ggMenuAdicionarFeijao(MBA, sc);
        this.menuRemoveProduto = new hhMenuRemoverProduto(MBA, sc);
        this.iiMenuIncrementarQuantidadeProdutosEstoque = new iiMenuIncrementarQuantidadeProdutosEstoque(MBA, sc);
        this.jjMenuDiminuirQuantidadeProdutosEstoque = new jjMenuDiminuirQuantidadeProdutosEstoque(MBA, sc);
    }



    @Override
    public boolean exibirMenu() throws EstoqueExceptions {
        int opcao = 0;
        String menu = "";
        menu += "===============================" + LS;
        menu += "|======= Menu Principal ======|" + LS;
        menu += "===============================" + LS;
        menu += ++opcao + ". Listar produtos" + LS;
        menu += ++opcao + ". Listar produtos em ordem alfabetica" + LS;
        menu += ++opcao + ". Listar produtos em ordem crescende de quantidade" + LS;
        menu += ++opcao + ". Listar Produtos em ordem crescente de data de validade" + LS;
        menu += ++opcao + ". Listar produtos que estarão vencidos em <data>:" + LS;
        menu += ++opcao + ". Adicionar Detergente" + LS;
        menu += ++opcao + ". Adicionar feijão" + LS;
        menu += ++opcao + ". Remover produto" + LS;
        menu += ++opcao + ". Incrementar quantidade de produtos estoque" + LS;
        menu += ++opcao + ". Diminuir quantidade de produtos estoque" + LS;
        menu += ++opcao + ". Sair" + LS;




        while (true) {
            System.out.println(menu);
            int opcaoEscolhida = obterValorInteger("Digite uma opção: ");
            Menu menuSelecionado = null;
            switch (opcaoEscolhida) {
                case 1:
                    menuSelecionado = this.aaMenuListarProdutos;
                    break;
                case 2:
                    menuSelecionado = this.bbMenuListarProdutosEmOrdemAlfabetica;
                    break;
                case 3:
                    menuSelecionado = this.ccMenuListarProdutosEmOrdemCrescenteQuantidade;
                    break;
                case 4:
                    menuSelecionado = this.menuListarProdutosEmOrdemCrescenteDeDataValidade;
                    break;
                case 5:
                   menuSelecionado = this.eeMenuListarProdutosVencidos;
                    break;
                case 6:
                    menuSelecionado =  this.ffMenuAdicionarDetergente;
                    break;
                case 7:
                    menuSelecionado = this.ggMenuAdicionarFeijao;
                    break;
                case 8:
                    menuSelecionado = this.menuRemoveProduto;
                    break;
                case 9:
                    menuSelecionado = this.iiMenuIncrementarQuantidadeProdutosEstoque;
                    break;
                case 10:
                    menuSelecionado = this.jjMenuDiminuirQuantidadeProdutosEstoque;
                    break;
                case 11:
                    return false;
                default:
                    System.out.println();
                    System.out.println("Erro! Digite uma opção válida: " + opcaoEscolhida);
                    System.out.println();
                    break;
            }
            if (menuSelecionado != null) {
                menuSelecionado.exibirMenu();
            }
        }
    }
}

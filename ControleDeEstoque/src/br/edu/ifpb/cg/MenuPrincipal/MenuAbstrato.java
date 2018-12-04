package br.edu.ifpb.cg.MenuPrincipal;

import br.edu.ifpb.cg.Dominio.Estoque;
import br.edu.ifpb.cg.Dominio.MinhaData;
import br.edu.ifpb.cg.Dominio.RepresentacaoTextual;

import java.util.Scanner;

public abstract class MenuAbstrato implements Menu{

    protected static final String LS = System.lineSeparator();


    protected Estoque MBA;

    protected Scanner sc;



    public MenuAbstrato(Estoque MBA, Scanner sc) {
        this.MBA = MBA;
        this.sc = sc;
    }


    protected void imprimir(RepresentacaoTextual objeto) {
        System.out.println(objeto.obterRepresentacaoTextual());
    }


    protected Integer obterValorInteger(String mensagemProUsuario) {
        Integer valor = null;
        while(valor == null) {
            System.out.print(mensagemProUsuario);
            try {
                String line = this.sc.nextLine();
                valor = Integer.parseInt(line);
            } catch(NumberFormatException e) {
                System.out.println("Erro! Valor inválido. Tente novamente!");
            }
        }
        return valor;
    }

    protected Double obterValorDouble(String mensagemProUsuario) {
        Double valor = null;
        while(valor == null) {
            System.out.println(mensagemProUsuario);
            try {
                String line = this.sc.nextLine();
                valor = Double.parseDouble(line);
            } catch (NumberFormatException e) {
                System.out.println("Erro! Valor inválido. Tente novamente!");
            }
        }
        return valor;
    }

    protected Long obterValorLong(String mensagemProUsuario) {
        Long valor = null;
        while(valor == null) {
            System.out.print(mensagemProUsuario);
            try {
                String line = this.sc.nextLine();
                valor = Long.parseLong(line);
            } catch(NumberFormatException e) {
                System.out.println("Erro! Valor inválido. Tente novamente!");
            }
        }
        return valor;
    }

    protected Boolean obterValorBoolean(String mensagemProUsuario) {
        Boolean valor = null;
        while(valor == null) {
            System.out.print(mensagemProUsuario);
            String line = this.sc.nextLine();
            if ("Sim".equalsIgnoreCase(line)) {
                line = "True";
            }
            valor = Boolean.parseBoolean(line);
        }
        return valor;
    }

    protected String obterValorString(String mensagemProUsuario) {
        String valor = null;
        while (valor == null) {
            System.out.print(mensagemProUsuario);
            String line = this.sc.nextLine();
            valor = line;
        }
        return valor;
    }

    protected MinhaData obterValorData(String mensagem) {
        System.out.println(mensagem);
        Integer dia = 0;
        Integer mes = 0;
        Integer ano = 0;

        while (dia < 1 || dia > 31) {
            dia = obterValorInteger("Dia: ");
        }
        while (mes < 1 || mes > 12) {
            mes = obterValorInteger("Mês: ");
        }
        while (ano < 1) {
            ano = obterValorInteger("Ano: ");
        }

        MinhaData data = new MinhaData(dia, mes, ano);

        return data;
    }
}

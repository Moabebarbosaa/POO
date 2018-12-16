package br.edu.ifpb.Menu;

import br.edu.ifpb.Domínio.Concesionaria;
import br.edu.ifpb.Domínio.RepresentacaoTextual;

import java.util.Scanner;

public abstract class MenuAbstrato implements Menu{

    protected static final String LS = System.lineSeparator();



    protected Concesionaria MBA;

    protected Scanner sc;



    // CONSTRUTOR
    public MenuAbstrato(Concesionaria MBA, Scanner sc) {
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
}

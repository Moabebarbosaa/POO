package br.edu.ifpb.cg.Ordenacao;

import br.edu.ifpb.cg.Dominio.Produto;

import java.util.Comparator;

public class ComparadorAlfabetico implements Comparator<Produto> {

    @Override
    public int compare(Produto o1, Produto o2) {
        String marca1 = o1.getMarca();
        String marca2 = o2.getMarca();

        int compareTo = marca1.compareTo(marca2);
        return compareTo;
    }

}

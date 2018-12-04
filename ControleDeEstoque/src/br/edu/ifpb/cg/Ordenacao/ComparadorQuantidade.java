package br.edu.ifpb.cg.Ordenacao;

import br.edu.ifpb.cg.Dominio.Produto;

import java.util.Comparator;

public class ComparadorQuantidade implements Comparator<Produto> {

    @Override
    public int compare(Produto o1, Produto o2) {
        Integer quantidade1 = o1.getQuantidade();
        Integer quantidade2 = o2.getQuantidade();

        int compareTo = quantidade1.compareTo(quantidade2);
        return compareTo;
    }
}

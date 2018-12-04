package br.edu.ifpb.cg.Ordenacao;

import br.edu.ifpb.cg.Dominio.MinhaData;
import br.edu.ifpb.cg.Dominio.Produto;

import java.util.Comparator;

public class ComparadorValidade implements Comparator<Produto> {


    @Override
    public int compare(Produto o1, Produto o2) {
        MinhaData data1 = o1.getDataValidade();
        MinhaData data2 = o2.getDataValidade();

        int compareTo = data1.compareTo(data2);
        return compareTo;
    }
}

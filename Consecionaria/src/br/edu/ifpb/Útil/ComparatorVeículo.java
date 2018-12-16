package br.edu.ifpb.Útil;

import br.edu.ifpb.Domínio.Veículo;

import java.util.Comparator;

public class ComparatorVeículo implements Comparator<Veículo> {

    @Override
    public int compare(Veículo o1, Veículo o2) {
        Double preco1 = o1.getPreço();
        Double preco2 = o2.getPreço();

        int compareTo = preco1.compareTo(preco2);

        return compareTo;
    }
}

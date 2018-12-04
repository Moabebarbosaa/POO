package br.edu.ifpb.cg.GeradorId;

import br.edu.ifpb.cg.Dominio.Estoque;

import java.io.Serializable;

public class GeradorIdNanoTime implements GeradorId, Serializable {

    @Override
    public Long obterProximoId(Estoque MBA) {
        Long proxId = System.nanoTime();
        return proxId;
    }
}

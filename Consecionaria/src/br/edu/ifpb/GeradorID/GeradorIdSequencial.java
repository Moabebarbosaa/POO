package br.edu.ifpb.GeradorID;

import br.edu.ifpb.Domínio.Concesionaria;

import java.io.Serializable;

public class GeradorIdSequencial implements GeradorId, Serializable {


    @Override
    public Long obterProximoId(Concesionaria MBA) {
        Long proxId = System.nanoTime();
        return proxId;
    }
}

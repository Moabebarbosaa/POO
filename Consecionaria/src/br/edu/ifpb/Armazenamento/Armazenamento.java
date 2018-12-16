package br.edu.ifpb.Armazenamento;

import br.edu.ifpb.Domínio.Concesionaria;
import br.edu.ifpb.Exception.ConcesionariaException;
import br.edu.ifpb.GeradorID.GeradorId;

public interface Armazenamento {

    public Concesionaria recuperar(GeradorId geradorId) throws ConcesionariaException;

    public void amazenar(Concesionaria MBA) throws ConcesionariaException;

}

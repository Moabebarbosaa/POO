package br.edu.ifpb.cg.Armazenamento;

import br.edu.ifpb.cg.Dominio.Estoque;
import br.edu.ifpb.cg.Exceptions.EstoqueExceptions;
import br.edu.ifpb.cg.Exceptions.EstoqueRuntimeException;
import br.edu.ifpb.cg.GeradorId.GeradorId;

public interface Armazenamento {

    public Estoque recuperar(GeradorId geradorId) throws EstoqueExceptions;

    public void amazenar(Estoque MBA) throws EstoqueRuntimeException, EstoqueExceptions;

}

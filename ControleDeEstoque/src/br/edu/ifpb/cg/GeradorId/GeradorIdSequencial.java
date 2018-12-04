package br.edu.ifpb.cg.GeradorId;

import br.edu.ifpb.cg.Dominio.Estoque;
import br.edu.ifpb.cg.Dominio.Produto;

import java.io.Serializable;
import java.util.Collection;

public class GeradorIdSequencial implements GeradorId, Serializable {
    @Override
    public Long obterProximoId(Estoque MBA) {
        Long maiorId = getMaiorId(MBA.getProdutos());
        Long proximoId = maiorId + 1;
        return proximoId;
    }

    private Long getMaiorId(Collection<Produto> produtos) {
        Long maiorId = 1L;

        for (Produto produto : produtos) {
            maiorId = Math.max(maiorId, produto.getId());
        }

        return maiorId;
    }
}

package br.edu.ifpb.Domínio;

import br.edu.ifpb.Exception.ConcesionariaException;
import br.edu.ifpb.Exception.VeiculoNaoEncontradoException;
import br.edu.ifpb.GeradorID.GeradorId;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

public class Concesionaria implements RepresentacaoTextual, Serializable {

    private Collection<Veículo> veiculos;

    private GeradorId geradorId;



    // CONSTRUTOR
    public Concesionaria( GeradorId geradorId) {
        this.veiculos = new ArrayList<Veículo>();
        this.geradorId = geradorId;
    }



    // GETS AND SETS
    public Collection<Veículo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(Collection<Veículo> veiculos) {
        this.veiculos = veiculos;
    }

    public GeradorId getGeradorId() {
        return geradorId;
    }

    public void setGeradorId(GeradorId geradorId) {
        this.geradorId = geradorId;
    }



    // FUNÇÕES MENU
    public void adicionarVeiculo(Veículo veículo) throws ConcesionariaException {
        veículo.validarValores();
        Long id = this.geradorId.obterProximoId(this);
        veículo.setId(id);
        this.veiculos.add(veículo);
    }

    public void removerVeiculo(Long id) throws ConcesionariaException {
        Veículo veiculoASerRemovido = null;

        for (Veículo veiculo : veiculos) {
            if (veiculo.getId() == id) {
                veiculoASerRemovido = veiculo;
                break;
            }
        }

        if (veiculoASerRemovido == null) {
            throw new VeiculoNaoEncontradoException(id);
        }
    }





    @Override
    public String obterRepresentacaoTextual() {
        return "CONCESIONARIA MBA. Venha comprar seu veículo aqui !!!";
    }
}

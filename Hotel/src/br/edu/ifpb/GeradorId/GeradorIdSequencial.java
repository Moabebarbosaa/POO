package br.edu.ifpb.GeradorId;

import br.edu.ifpb.Dominio.*;

import java.io.Serializable;
import java.util.ArrayList;

public class GeradorIdSequencial implements GeradorId, Serializable {

    @Override
    public Long obterProximoId(Hotel MBA) {
        Long maiorId = obterMaiorId(MBA.getFuncionarios(), MBA.getHospedes(), MBA.getHospedagens(), MBA.getQuartos());
        Long proxId = maiorId + 1;
        return proxId;
    }

    public Long obterMaiorId(ArrayList<Funcionario> funcionarios, ArrayList<Hospede> hospedes, ArrayList<Hospedagem> hospedagens, ArrayList<Quarto> quartos) {

        Long maiorIdEspecifico = 0L;

        for (Funcionario funcionario : funcionarios) {
            maiorIdEspecifico = Math.max(maiorIdEspecifico, funcionario.getId());
        }


        for (Hospedagem hospedagem : hospedagens) {
            maiorIdEspecifico = Math.max(maiorIdEspecifico, hospedagem.getId());
        }


        for (Quarto quarto : quartos) {
            maiorIdEspecifico = Math.max(maiorIdEspecifico, quarto.getId());
        }


        for (Hospede hospede : hospedes) {
            maiorIdEspecifico = Math.max(maiorIdEspecifico, hospede.getId());
        }

        return maiorIdEspecifico;
    }
}

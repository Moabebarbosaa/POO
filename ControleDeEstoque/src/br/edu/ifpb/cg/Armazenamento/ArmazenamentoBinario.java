package br.edu.ifpb.cg.Armazenamento;

import br.edu.ifpb.cg.Dominio.Estoque;
import br.edu.ifpb.cg.Exceptions.EstoqueExceptions;
import br.edu.ifpb.cg.GeradorId.GeradorId;

import java.io.*;

public class ArmazenamentoBinario implements Armazenamento{

    private String nomeArquivo;

    public ArmazenamentoBinario(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    @Override
    public Estoque recuperar(GeradorId geradorId) throws EstoqueExceptions {
        Estoque MBA = null;

        try (FileInputStream fis = new FileInputStream(this.nomeArquivo);
             ObjectInputStream ois = new ObjectInputStream(fis);) {
            MBA = (Estoque) ois.readObject();
            MBA.setGeradorId(geradorId);
        } catch (FileNotFoundException e) {
            MBA = new Estoque(geradorId);
        } catch (IOException | ClassNotFoundException e) {
            throw new EstoqueExceptions("Erro ao tentar recuperar os dados do estoque!", e);
        }

        return MBA;
    }

    @Override
    public void amazenar(Estoque MBA) throws EstoqueExceptions {
        try (FileOutputStream fos = new FileOutputStream(this.nomeArquivo);
             ObjectOutputStream oos = new ObjectOutputStream(fos);) {
            oos.writeObject(MBA);
        } catch (IOException e) {
            throw new EstoqueExceptions("Erro ao tentar armazenar os dados do Estoque!", e);
        }
    }
}

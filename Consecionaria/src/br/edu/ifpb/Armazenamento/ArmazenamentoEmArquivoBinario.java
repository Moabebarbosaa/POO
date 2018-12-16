package br.edu.ifpb.Armazenamento;

import br.edu.ifpb.Domínio.Concesionaria;
import br.edu.ifpb.Exception.ConcesionariaException;
import br.edu.ifpb.GeradorID.GeradorId;

import java.io.*;

public class ArmazenamentoEmArquivoBinario implements Armazenamento{

    private String nomeArquivo;

    public ArmazenamentoEmArquivoBinario(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    @Override
    public Concesionaria recuperar(GeradorId geradorId) throws ConcesionariaException {
        Concesionaria MBA = null;

        try (FileInputStream fis = new FileInputStream(this.nomeArquivo);
             ObjectInputStream ois = new ObjectInputStream(fis);) {
            MBA = (Concesionaria) ois.readObject();
            MBA.setGeradorId(geradorId);
        } catch (FileNotFoundException e) {
            // primeira vez que o programa está sendo executado armazenando a base de dados
            // neste arquivo?
            MBA = new Concesionaria(geradorId);
        } catch (IOException | ClassNotFoundException e) {
            throw new ConcesionariaException("Houve algum erro ao tentar recuperar os dados da consecionaria!", e);
        }

        return MBA;
    }

    @Override
    public void amazenar(Concesionaria MBA) throws ConcesionariaException {
        try (FileOutputStream fos = new FileOutputStream(this.nomeArquivo);
             ObjectOutputStream oos = new ObjectOutputStream(fos);) {
            oos.writeObject(MBA);
        } catch (IOException e) {
            throw new ConcesionariaException("Houve algum erro ao tentar armazenar os dados do consecionaria!", e);
        }
    }
}

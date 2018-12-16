package br.edu.ifpb.Armazenamento;

import br.edu.ifpb.Dominio.Hotel;
import br.edu.ifpb.GeradorId.GeradorId;

import java.io.*;

public class ArmazenamentoBinario implements Armazenamento {

    @Override
    public Hotel recuperar(GeradorId geradorId) {
        Hotel MBA = null;
        try (FileInputStream fis = new FileInputStream("MBA");
            ObjectInputStream ois = new ObjectInputStream(fis)){
            MBA = (Hotel ) ois.readObject();
            MBA.setGeradorId(geradorId);
        } catch (FileNotFoundException e){
            MBA = new Hotel(geradorId);
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
        return MBA;
    }

    @Override
    public void armazenar(Hotel MBA) {
        try(FileOutputStream fos = new FileOutputStream("MBA");
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(MBA);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

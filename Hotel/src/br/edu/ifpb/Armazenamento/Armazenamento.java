package br.edu.ifpb.Armazenamento;

import br.edu.ifpb.Dominio.Hotel;
import br.edu.ifpb.GeradorId.GeradorId;

public interface Armazenamento {

    public Hotel recuperar(GeradorId geradorId) ;

    public void armazenar(Hotel hotel);
}

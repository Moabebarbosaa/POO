package br.edu.ifpb.Menu;

import br.edu.ifpb.Domínio.Concesionaria;
import br.edu.ifpb.Exception.ConcesionariaException;

import java.util.Scanner;

public class MenuSobre extends MenuAbstrato implements Menu {

    public MenuSobre(Concesionaria MBA, Scanner sc) {
        super(MBA, sc);
    }


    @Override
    public boolean exibirMenu() throws ConcesionariaException {
        String menu = "";
        menu += "===============================" + LS;
        menu += "|=========== SOBRE ===========|" + LS;
        menu += "===============================" + LS;
        System.out.println(menu);

        imprimir(this.MBA);
        System.out.println();
        return true;
    }
}

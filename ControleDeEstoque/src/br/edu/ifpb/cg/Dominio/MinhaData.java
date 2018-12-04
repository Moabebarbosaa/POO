package br.edu.ifpb.cg.Dominio;

import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;

public class MinhaData implements Serializable, Comparable<MinhaData> {

    private Integer dia;
    private Integer mes;
    private Integer ano;

    public MinhaData(Integer dia, Integer mes, Integer ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    @Override
    public int compareTo(MinhaData o) {

        Integer dia = o.getDia();
        Integer mes = o.getMes();
        Integer ano = o.getAno();


        if (this.ano > ano) {
            return 1;
        }

        else if (this.ano < ano) {
            return -1;
        }


        if (this.mes > mes) {
            return 1;
        }

        else if (this.mes < mes) {
            return -1;
        }

        if (this.dia < dia) {
            return -1;
        }

        else if (this.dia > dia) {
            return 1;
        }

        return 0;
    }

    @Override
    public String toString() {
        return "MinhaData{" +
                "dia=" + dia +
                ", mes=" + mes +
                ", ano=" + ano +
                '}';
    }
}

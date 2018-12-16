package br.edu.ifpb.Menu;

import br.edu.ifpb.Dominio.Funcionario;
import br.edu.ifpb.Dominio.Hospede;
import br.edu.ifpb.Dominio.Hotel;
import br.edu.ifpb.Dominio.Quarto;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Scanner;

public abstract class MenuAbstrato {
    private Scanner sc = new Scanner(System.in);

    protected Long obterLong(String mensagem){
        String numero;
        Long aLong = null;

        while (aLong == null){
            try {
                System.out.print(mensagem);
                numero = sc.next();
                aLong = Long.parseLong(numero);
            }catch (NumberFormatException e){
                System.out.println("Valor inválido");
            }
        }
        return aLong;
    }

    protected String obterString(String mensagem){
        String line = null;

        while (line == null){
            System.out.print(mensagem);
            line = sc.next();
        }
        return line;
    }

    protected Integer obterInteger(String mensagem){
        String numero;
        Integer numeroo = null;

        while (numeroo == null){
            try {
                System.out.print(mensagem);
                numero = sc.next();
                numeroo = Integer.parseInt(numero);
            }catch (NumberFormatException e){
                System.out.println("Valor inválido");
            }
        }
        return numeroo;
    }

    protected Boolean obterBoolean(String mensagem){
        String numero;
        Boolean boleano = null;

        while (boleano == null){
            System.out.print(mensagem);
            numero = sc.next();
            if (numero.equals("sim")) {
                boleano = true;
            }
            else if (numero.equals("nao")) {
                boleano = false;
            }

            else {
                System.out.println("Valor inválido");
            }
        }
        return boleano;
    }

    protected Double obterDouble(String mensagem){
        String numero;
        Double entrada = null;

        while (entrada == null){
            try {
                System.out.print(mensagem);
                numero = sc.next();
                entrada = Double.parseDouble(numero);
            }catch (NumberFormatException e){
                System.out.println("Valor inválido");
            }
        }
        return entrada;
    }

    protected Date obterDate(String mensagem){
        String date;
        DateFormat data = new SimpleDateFormat("dd/MM/yyyy");
        Date dataNascimento = null;
        while (dataNascimento == null){
            try {
                System.out.print(mensagem);
                date = sc.next();
                dataNascimento = data.parse(date);
            } catch (ParseException e) {
                System.out.println("Data inválida");
            }
        }
        return dataNascimento;
    }

    protected Quarto verificacaoQuarto(Hotel MBA){

        Long id = this.obterLong("Digite o id do quarto: ");

        Collection<Quarto> quartos = MBA.getQuartos();

        Quarto quarto = null;

        while (quarto == null){
            for (Quarto q: quartos){
                if(q.getId().equals(id)){
                    quarto = q;
                }
            }
            if (quarto == null){
                System.out.println("Id não encontrado !");
                return verificacaoQuarto(MBA);
            }
        }
        return quarto;
    }

    protected Funcionario verificaoFuncionario(Hotel MBA){

        Long id = this.obterLong("Digite o id do funcionário: ");

        Collection<Funcionario> funcionarios = MBA.getFuncionarios();

        Funcionario funcionario = null;

        while (funcionario == null){
            for (Funcionario funci: funcionarios){
                if(funci.getId().equals(id)){
                    funcionario = funci;
                }
            }
            if (funcionario == null){
                System.out.println("ID não encontrado !");
                return verificaoFuncionario(MBA);
            }
        }
        return funcionario;
    }

    protected Hospede verificacaoHospede(Hotel MBA){

        Long id = this.obterLong("Digite o id do hospede:");

        Collection<Hospede> hospedes = MBA.getHospedes();

        Hospede hospede = null;

        while (hospede == null){
            for (Hospede h: hospedes){
                if(h.getId().equals(id)){
                    hospede = h;
                }
            }
            if (hospede == null){
                System.out.println("Id não encontrado !");
                return verificacaoHospede(MBA);
            }
        }
        return hospede;
    }


}

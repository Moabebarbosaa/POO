package br.edu.ifpb.Menu;

import br.edu.ifpb.Dominio.*;

import java.text.CollationElementIterator;
import java.util.*;

public class MenuPrincipal extends MenuAbstrato{

    private static final String LS = System.lineSeparator();

    private Hotel MBA;

    private Scanner sc = new Scanner(System.in);


    public MenuPrincipal(Hotel MBA) {
        this.MBA = MBA;
    }

    public Hotel getMBA() {
        return MBA;
    }

    public void setMBA(Hotel MBA) {
        this.MBA = MBA;
    }



    public Boolean exibirMenu() {

        String menu = "";
        menu += "MENU PRINCIPAL - APLICAÇÃO HOTEL" + LS + LS;
        menu += "1 - Adicionar Quarto" + LS;
        menu += "2 - Adicionar Funcionário" + LS;
        menu += "3 - Adicionar Hóspede" + LS;
        menu += "4 - Adicionar Hospedagem" + LS;
        menu += "5 - Listar Quartos" + LS;
        menu += "6 - Listar Funcionários" + LS;
        menu += "7 - Listar Hóspedes" + LS;
        menu += "8 - Listar Hospedagens" + LS;
        menu += "9 - Relatório de Funcionários (renda/hospedagens)" + LS;
        menu += "10 - Relatório de Hóspedes (quantidade/hospedagens)" + LS;
        menu += "11 - Relatório de Hóspedes (valores/hospedagens)" + LS;
        menu += "12 - Remover" + LS;
        menu += "13 - Sair" + LS;

        while (true) {

            System.out.println(menu);

            Integer opcaoEscolhida = obterInteger("Digite uma opção: ");

            switch (opcaoEscolhida) {
                case 1:
                    adicionarQuartos();
                    break;
                case 2:
                    adicionarFuncionario();
                    break;
                case 3:
                    adicionarHospede();
                    break;
                case 4:
                    adicionarHospedagens();
                    break;
                case 5:
                    listarQuartos();
                    break;
                case 6:
                    listarFuncionarios();
                    break;
                case 7:
                    listarHospedes();
                    break;
                case 8:
                    listarHospedagem();
                    break;
                case 9:
                    relatorioFuncionario();
                    break;
                case 10:
                    relatorioHospedeQuantidade();
                     break;
                case 11:
                    relatorioHospedeValores();
                    break;
                case 12:
                    remover();
                    break;
                case 13:
                    return false;

                default:
                    System.out.println("Opção Inválida! Digite novamente.");
            }

        }
    }



    private void adicionarQuartos() {
        String menuAdicionarQuarto = "";
        menuAdicionarQuarto += LS;
        menuAdicionarQuarto += LS;
        menuAdicionarQuarto += "=== ADICIONAR QUARTO ===" + LS;
        menuAdicionarQuarto += LS;
        menuAdicionarQuarto += "1 - Adicionar Quarto Master" + LS;
        menuAdicionarQuarto += "2 - Adicionar Quarto Simples" + LS;
        menuAdicionarQuarto += "3 - Voltar" + LS;

        while (true) {
            System.out.println(menuAdicionarQuarto);
            int opcao = obterInteger("Digite uma opção: ");
            switch (opcao) {
                case 1:
                    System.out.println();
                    System.out.println("==== Quarto Master ====");
                    Integer numero = obterInteger("Digite o número do quarto: ");
                    Integer andar = obterInteger("Digite o número do andar: ");
                    Integer quantidadeMaxima = obterInteger("Digite a quantidade máxima de pessoas: ");
                    Boolean temHidromassagem = obterBoolean("Tem hidromassagem (sim ou não): ");
                    Boolean temVistaMar = obterBoolean("Tem vista para o mar (sim ou não): ");

                    QuartoMaster quarto = new QuartoMaster(numero, andar, quantidadeMaxima, temHidromassagem, temVistaMar);
                    this.MBA.adicionarQuarto(quarto);
                    break;

                case 2:
                    System.out.println();
                    System.out.println("==== Quarto Simples ====");
                    Integer numero2 = obterInteger("Digite o número do quarto: ");
                    Integer andar2 = obterInteger("Digite o número do andar: ");
                    Integer quantidadeMaxima2 = obterInteger("Digite a quantidade máxima de pessoas: ");
                    Boolean ehDuplo = obterBoolean("Tem hidromassagem (sim ou não): ");
                    Boolean temArCondicionado = obterBoolean("Tem vista para o mar (sim ou não): ");

                    QuartoMaster quarto2 = new QuartoMaster(numero2, andar2, quantidadeMaxima2, ehDuplo, temArCondicionado);
                    this.MBA.adicionarQuarto(quarto2);
                    break;
                case 3:
                    return;
            }
        }
    }

    private void adicionarFuncionario() {
        String menuFuncionario = "";
        menuFuncionario += LS;
        menuFuncionario += LS;
        menuFuncionario += "=== ADICIONAR FUNCIONÁRIO ===" + LS;

        System.out.println(menuFuncionario);

        String nome = obterString("Digine o nome: ");
        Long cpf = obterLong("Digite o cpf: ");
        Double salario = obterDouble("Digite o salário: ");

        System.out.println();

        Funcionario funcionario = new Funcionario(nome, cpf, salario);
        this.MBA.adicionarFuncionario(funcionario);
    }

    private void adicionarHospede() {
        String menu = "";
        menu += LS;
        menu += LS;
        menu += "=== ADICIONAR HOSPEDE ===" + LS;

        System.out.println(menu);

        String nome = obterString("Digine o nome: ");
        Long cpf = obterLong("Digite o cpf: ");
        Date dataNascimento = obterDate("Digite a data de nascimento: ");

        Hospede hospede = new Hospede(nome, cpf, dataNascimento);
        this.MBA.adicionarHospede(hospede);
    }

    private void adicionarHospedagens() {
        String menu = "";
        menu += LS;
        menu += LS;
        menu += "=== ADICIONAR HOSPEDAGENS ===" + LS;

        System.out.println(menu);

        listarQuartos();
        Quarto quarto = this.verificacaoQuarto(MBA);

        listarFuncionarios();
        Funcionario funcionario = this.verificaoFuncionario(MBA);

        listarHospedes();
        Hospede hospede = this.verificacaoHospede(MBA);

        Double valor = obterDouble("Digite o valor: ");

        Date dataInicial = obterDate("Digite a data inicial: ");
        Date dataFinal = obterDate("Digite a data final: ");

        if (dataInicial.after(dataFinal)) {
            System.out.println("Data inválida !");
        }

        else {
            Periodo periodo = new Periodo(dataInicial, dataFinal);
            Collection<Hospedagem> hospedagens = this.MBA.getHospedagens();
            for (Hospedagem hospedagem: hospedagens){
                if(hospedagem.getQuarto().getId() == (quarto.getId()) &&
                        hospedagem.getPeriodo().getDataInicial().equals(periodo.getDataInicial())){
                    System.out.println("Hospedagem inválida !");
                    return;
                }
            }
            Hospedagem hospedagem = new Hospedagem(quarto,funcionario,hospede,valor,periodo);
            this.MBA.adicionarHospedagens(hospedagem);
        }
    }

    private void listarQuartos() {
        Collection<Quarto> quartos = this.MBA.getQuartos();

        if (quartos.isEmpty()) {
            System.out.println("Não há quartos");
        }
        else {

            for (Quarto quarto : quartos) {
                System.out.println(quarto);
            }
        }
    }

    private void listarFuncionarios() {
        Collection<Funcionario> funcionarios = this.MBA.getFuncionarios();

        if (funcionarios.isEmpty()) {
            System.out.println("Não há funcionários !");
        }

        else {
            for (Funcionario funcionario : funcionarios) {
                System.out.println(funcionario);
            }
        }
    }

    private void listarHospedes() {
        Collection<Hospede> hospedes = this.MBA.getHospedes();

        if (hospedes.isEmpty()) {
            System.out.println("Não há hospedes !");
        }
        else {
            for(Hospede hospede : hospedes) {
                System.out.println(hospede);
            }
        }
    }

    private void listarHospedagem() {
        Collection<Hospedagem> hospedagens = this.MBA.getHospedagens();

        if(hospedagens.isEmpty()) {
            System.out.println("Não há hospedagens !");
        }

        else {
            for(Hospedagem hospedagem : hospedagens) {
                System.out.println(hospedagem);
            }
        }
    }

    private void relatorioFuncionario() {
        Collection<Funcionario> funcionarios = this.MBA.getFuncionarios();
        Collection<Hospedagem> hospedagens = this.MBA.getHospedagens();

        Map<Funcionario, Double> relatorio = new HashMap<>();

        for(Funcionario funcionario : funcionarios){
            Double rendaTotal = 0D;
            for (Hospedagem hospedagem : hospedagens) {
                if(hospedagem.getFuncionario().getId().equals(funcionario.getId())) {
                    rendaTotal += hospedagem.getValor();
                }
            }

            relatorio.put(funcionario, rendaTotal);

        }

        for (Funcionario funcionario : funcionarios){
            System.out.println(funcionario + "\n" + "Renda gerada: " + relatorio.get(funcionario) + "\n\n");

        }
    }

    private void relatorioHospedeQuantidade() {
        Collection<Hospede> hospedes = this.MBA.getHospedes();
        Collection<Hospedagem> hospedagens = this.MBA.getHospedagens();
        Map<Hospede, Integer> relatorio = new HashMap<>();

        for (Hospede hospede : hospedes) {
            int quantidade = 0;
            for(Hospedagem hospedagem : hospedagens) {
                if (hospede.getId().equals(hospedagem.getHospede().getId())) {
                    quantidade += 1;
                }
            }
            relatorio.put(hospede, quantidade);
        }

        for(Hospede hospede : hospedes) {
            System.out.println();
            System.out.println("O(a) hospede " + hospede.getNome() + " se hospedou " + relatorio.get(hospede) + " vezes.");
        }

        System.out.println();
    }

    private void relatorioHospedeValores() {
        Collection<Hospede> hospedes = this.MBA.getHospedes();
        Collection<Hospedagem> hospedagens = this.MBA.getHospedagens();
        Map<Hospede, Double> relatorio = new HashMap<>();

        for(Hospede hospede : hospedes) {
            Double valorTotal = 0D;
            for(Hospedagem hospedagem : hospedagens) {
                if (hospede.getId().equals(hospedagem.getHospede().getId())) {
                    valorTotal += hospedagem.getValor();
                }
            }

            relatorio.put(hospede, valorTotal);
        }

        for (Hospede hospede : hospedes) {
            System.out.println();
            System.out.println("O hospede " + hospede.getNome() + " somou " + relatorio.get(hospede) + " em despesas no Hotel");
        }
        System.out.println();
    }

    private void remover() {
        String menu = "";
        menu += "1 - Remover Quarto" + LS;
        menu += "2 - Remover Funcionário" + LS;
        menu += "3 - Remover Hóspede" + LS;
        menu += "4 - Voltar" + LS;

        while (true) {
            System.out.println(menu);
            int opcao = obterInteger("Digite um valor: ");

            switch (opcao) {
                case 1:
                    Collection<Quarto> quartos = this.MBA.getQuartos();

                    listarQuartos();
                    Long id = obterLong("Digite o ID do quarto que deseja remover: ");

                    Quarto quartoRemovido = null;
                    for (Quarto quarto : quartos) {
                        if (id.equals(quarto.getId())) {
                            quartoRemovido = quarto;
                            break;
                        }
                    }

                    this.MBA.removerQuarto(quartoRemovido);
                break;

                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Valor inválido !");
            }
        }
    }
}

package br.com.hotel.visao;

import br.com.hotel.controle.Controle;
import br.com.hotel.controle.Hotel;
import br.com.hotel.pagamento.Pagamento;
import br.com.hotel.pagamento.PagamentoCartao;
import br.com.hotel.pagamento.PagamentoDinheiro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Controle controle = new Controle();
        Hotel hotel = new Hotel();

        String nome, cpf, telefone, email, tipoQuarto, tipoPagamento;
        int numero, dias;

        int opcao = 0;

        do {
            try {
                System.out.println("SELECIONE UMA OPÇÃO:");
                System.out.println("1 - Realizar Cadastro de um Hospede");
                System.out.println("2 - Listar Todos os Hospedes Cadastrados");
                System.out.println("3 - Realizar Check-In");
                System.out.println("4 - Realizar Check-Out");
                System.out.println("------------------------------");
                System.out.println("5 - Adicionar um Quarto");
                System.out.println("6 - Remover um Quarto");
                System.out.println("7 - Buscar Quarto pelo Número");
                System.out.println("8 - Listar Quartos Disponíveis");
                System.out.println("------------------------------");
                System.out.println("9 - Finalizar Sistema");
                opcao = teclado.nextInt();
                teclado.nextLine();

                switch (opcao) {
                    case 1:
                        try {
                            System.out.print("Digite o seu nome: ");
                            nome = teclado.nextLine();

                            System.out.println("Digite o seu CPF: ");
                            cpf = teclado.nextLine();

                            System.out.println("Digite o seu telefone: ");
                            telefone = teclado.nextLine();

                            System.out.println("Digite o seu e-mail: ");
                            email = teclado.nextLine();

                            controle.cadastrarHospede(nome, cpf, email, telefone);
                        } catch (IllegalArgumentException e){
                            System.out.println("Erro: " + e.getMessage());
                        }
                        break;

                    case 2:
                        System.out.println(controle.listarHospede());
                        break;

                    case 3:
                        System.out.println("Digite o número do quarto que deseja para reservar: ");
                        numero = teclado.nextInt();

                        System.out.println("Digite a quantidade de dias que deseja ficar hospedado:");
                        dias = teclado.nextInt();
                        teclado.nextLine();

                        hotel.realizarCheckIn(numero, dias);
                        break;

                    case 4:
                        System.out.println("Digite o número do quarto que deseja realizar Check-Out: ");
                        numero = teclado.nextInt();

                        System.out.println("Digite a quantidade de dias que ficou hospedado: ");
                        dias = teclado.nextInt();
                        teclado.nextLine();

                        double valor = hotel.realizarCheckOut(numero, dias);

                        System.out.println("De que forma deseja realizar o pagamento (Dinheiro ou Cartão):");
                        tipoPagamento = teclado.nextLine();

                        if (tipoPagamento.equalsIgnoreCase("Dinheiro")){
                            Pagamento pagamento = new PagamentoDinheiro();
                            System.out.println(pagamento.realizarPagamento(valor));
                        } else if (tipoPagamento.equalsIgnoreCase("Cartao")) {
                            Pagamento pagamento = new PagamentoCartao();
                            System.out.println(pagamento.realizarPagamento(valor));
                        }
                        break;

                    case 5:
                        try {
                            System.out.println("Insira o tipo do quarto (Simples, Luxo ou Presidente):");
                            tipoQuarto = teclado.nextLine();

                            System.out.println("Insira o número do quarto:");
                            numero = teclado.nextInt();

                            hotel.adicionarQuarto(tipoQuarto, numero);
                        } catch (InputMismatchException e){
                            System.out.println("Erro: o número do quarto precisa ser uma valor numérico.");
                            teclado.nextLine();
                        }
                        break;

                    case 6:
                        try {
                            System.out.println("Insira o número do quarto que deseja remover:");
                            numero = teclado.nextInt();

                            hotel.removerQuarto(numero);
                        } catch (InputMismatchException e){
                            System.out.println("Erro: o número do quarto precisa ser uma valor numérico.");
                            teclado.nextLine();
                        }
                        break;

                    case 7:
                        try {
                            System.out.println("Insira o número do quarto que deseja buscar:");
                            numero = teclado.nextInt();

                            System.out.println(hotel.buscarQuarto(numero));
                        } catch (InputMismatchException e){
                            System.out.println("Erro: o número do quarto precisa ser uma valor numérico.");
                            teclado.nextLine();
                        }
                        break;

                    case 8:
                        System.out.println(hotel.listarQuartosDisponiveis());
                        break;

                    case 9:
                        System.out.println("Sistema Finalizado com sucesso!");
                        break;

                    default:
                        System.out.println("Número inserido é inválido, tente novamente");
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: entra inválida, insira um número:");
                teclado.nextLine();
            }
        } while (opcao != 9);
    }
}
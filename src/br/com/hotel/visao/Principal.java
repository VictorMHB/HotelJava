package br.com.hotel.visao;

import br.com.hotel.controle.Controle;
import br.com.hotel.controle.Hotel;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Controle controle = new Controle();
        Hotel hotel = new Hotel();

        int opcao = 0;

        System.out.println("SELECIONE UMA OPÇÃO:");
        System.out.println("1 - Realizar cadastro de um Hospede");
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

        try {
            switch (opcao) {
                case 1:
                //Hospede hospede = new Hospede();
                    System.out.print("Digite o seu nome: ");
                    String nome = teclado.nextLine();
                    //hospede.setNome(nome);

                    System.out.println("Digite o seu CPF: ");
                    String cpf = teclado.nextLine();
                    //hospede.setCpf(cpf);

                    System.out.println("Digite o seu telefone: ");
                    String telefone = teclado.nextLine();
                    //hospede.setTelefone(telefone);

                    System.out.println("Digite o seu e-mail: ");
                    String email = teclado.nextLine();
                    //hospede.setEmail(email);
                break;
                case 2:

                break;
                case 3:

                break;
            }
        } catch (Exception e) {
            System.out.println("Erro! Opção inválida.");
        }
    }
}

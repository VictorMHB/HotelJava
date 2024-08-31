import br.com.hotel.modelo.Hospede;

import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int opcao = 0;

        System.out.println("Selecione uma opção:");
        System.out.println("Fazer cadastro:");
        System.out.println("Fazer check-in:");
        System.out.println("Fazer check-out:");
        opcao = teclado.nextInt();
        teclado.nextLine();

        try {
            switch (opcao) {
                case 1:
                Hospede hospede = new Hospede();
                    System.out.print("Digite o seu nome: ");
                    String nome = teclado.nextLine();
                    hospede.setNome(nome);

                    System.out.println("Digite o seu CPF: ");
                    String cpf = teclado.nextLine();
                    hospede.setCpf(cpf);

                    System.out.println("Digite o seu telefone: ");
                    String telefone = teclado.nextLine();
                    hospede.setTelefone(telefone);

                    System.out.println("Digite o seu e-mail: ");
                    String email = teclado.nextLine();
                    hospede.setEmail(email);
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

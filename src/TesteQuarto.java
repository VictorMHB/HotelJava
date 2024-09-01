import br.com.hotel.modelo.Quarto;
import br.com.hotel.modelo.QuartoLuxo;
import br.com.hotel.modelo.QuartoPresidente;
import br.com.hotel.modelo.QuartoSimples;

import java.util.Scanner;

public class TesteQuarto {
    public static void main(String[] args) {
        int numero;

        Scanner sc = new Scanner(System.in);
        Hotel hotel = new Hotel();
        Quarto quarto1 = new QuartoPresidente(201);
        Quarto quarto2 = new QuartoSimples(301);

        hotel.adicionarQuarto("simples", 101);

        System.out.println("Número:");
        numero = sc.nextInt();

        System.out.println(hotel.buscarQuarto(numero));
    }
}

package br.com.hotel.visao;

import br.com.hotel.controle.Hotel;

import java.util.Scanner;

public class TesteQuarto {
    public static void main(String[] args) {
        int numero = 301;

        Scanner sc = new Scanner(System.in);
        Hotel hotel = new Hotel();

        hotel.adicionarQuarto("simples", 101);
        hotel.adicionarQuarto("luxo", 201);
        hotel.adicionarQuarto("presidente", 301);

        System.out.println(hotel.listarQuartosDisponiveis());

        hotel.removerQuarto(101);

        System.out.println(hotel.listarQuartosDisponiveis());

        System.out.println(hotel.buscarQuarto(numero));
    }
}

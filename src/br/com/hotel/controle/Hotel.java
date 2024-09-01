package br.com.hotel.controle;

import br.com.hotel.quartos.Quarto;
import br.com.hotel.quartos.QuartoLuxo;
import br.com.hotel.quartos.QuartoPresidente;
import br.com.hotel.quartos.QuartoSimples;

import java.util.ArrayList;

public class Hotel {
    private ArrayList<Quarto> listaQuartos;

    public Hotel() {
        listaQuartos = new ArrayList<>(50);
    }

    public void adicionarQuarto(String tipoQuarto, int numero) {
        if (tipoQuarto.equalsIgnoreCase("Simples")){
            listaQuartos.add(new QuartoSimples(numero));
        } else if (tipoQuarto.equalsIgnoreCase("Luxo")) {
            listaQuartos.add(new QuartoLuxo(numero));
        } else if (tipoQuarto.equalsIgnoreCase("Presidente")) {
            listaQuartos.add(new QuartoPresidente(numero));
        } else {
            System.out.println("O tipo de quarto inserido não existe, tente novamente");
        }
    }

    public void removerQuarto(int numero) {
        Quarto quartoAux;

        for (int i = 0; i < listaQuartos.size(); i++) {
            quartoAux = listaQuartos.get(i);
            if (quartoAux.getNumero() == numero) {
                listaQuartos.remove(quartoAux);
            }
        }
    }

    public String listarQuartosDisponiveis() {
        Quarto quartoAux;
        String saida = "LISTA DOS QUARTOS QUE ESTÃO DISPONÍVEIS PARA HOSPEDAGEM:" +
                "\n---------------\n";

        for (int i = 0; i < listaQuartos.size(); i++) {
            quartoAux = listaQuartos.get(i);
            if (quartoAux.isDisponibilidade()){
                saida += "Número do Quarto: " + quartoAux.getNumero() + "\n";
                saida += "Tipo do Quarto: " + quartoAux.getClass().getSimpleName() + "\n";
                saida += "Preço da Diária: " + quartoAux.getPrecoDiaria() + "\n";
                saida += "---------------\n";
            }
        }

        return saida;
    }

    public String buscarQuarto(int numero) {
        Quarto quartoAux;
        String saida = "O quarto com o número " + numero +  " foi encontrado:\n";

        for (int i = 0; i < listaQuartos.size(); i++) {
            quartoAux = listaQuartos.get(i);
            if (quartoAux.getNumero() == numero) {
                saida += "Disponibilidade: " + quartoAux.isDisponibilidade() + "\n";
                saida += "Preço da Diária: " + quartoAux.getPrecoDiaria() + "\n";
                saida += "Tipo do Quarto: " + quartoAux.getClass().getSimpleName();
            }
        }

        return saida;
    }
}

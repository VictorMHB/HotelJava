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
        try {
            if (tipoQuarto.equalsIgnoreCase("Simples")) {
                listaQuartos.add(new QuartoSimples(numero));
            } else if (tipoQuarto.equalsIgnoreCase("Luxo")) {
                listaQuartos.add(new QuartoLuxo(numero));
            } else if (tipoQuarto.equalsIgnoreCase("Presidente")) {
                listaQuartos.add(new QuartoPresidente(numero));
            } else {
                System.out.println("O tipo de quarto inserido não existe, tente novamente");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao adicionar o quarto: " + e.getMessage());
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
        String saida = "LISTA DOS QUARTOS QUE ESTÃO DISPONÍVEIS PARA HOSPEDAGEM:" +
                "\n---------------\n";

        for (Quarto quartoAux : listaQuartos) {
            if (quartoAux.isDisponivel()){
                saida += "Número do Quarto: " + quartoAux.getNumero() + "\n";
                saida += "Tipo do Quarto: " + quartoAux.getClass().getSimpleName() + "\n";
                saida += "Preço da Diária: " + quartoAux.getPrecoDiaria() + "\n";
                saida += "---------------\n";
            }
        }
        return saida;
    }

    public String buscarQuarto(int numero) {
        String saida = "O quarto com o número " + numero +  " foi encontrado:\n";

        for (Quarto quartoAux : listaQuartos) {
            if (quartoAux.getNumero() == numero) {
                saida += "Disponibilidade: " + quartoAux.isDisponivel() + "\n";
                saida += "Preço da Diária: " + quartoAux.getPrecoDiaria() + "\n";
                saida += "Tipo do Quarto: " + quartoAux.getClass().getSimpleName() + "\n";
            }
        }
        return saida;
    }

    public void realizarCheckIn(int numero, int dias){
        for(Quarto quartoAux : listaQuartos){
            if (quartoAux.getNumero() == numero) {
                if (quartoAux.isDisponivel()){
                    quartoAux.setDisponibilidade(false);
                    System.out.println("Check-in realizado com sucesso para o quarto de número " + numero);
                    System.out.println("O valor total que será pago é de " + quartoAux.calcularValorTotal(dias) + "\n");
                } else {
                    System.out.println("O quarto solicitado para Check-in já está ocupado");
                }
            }
        }
    }

    public double realizarCheckOut(int numero, int dias){
        double valorTotal = 0.0;

        for(Quarto quartoAux : listaQuartos) {
            if (quartoAux.getNumero() == numero) {
                if (!quartoAux.isDisponivel()) {
                    quartoAux.setDisponibilidade(true);
                    valorTotal = quartoAux.calcularValorTotal(dias);
                    System.out.println("Check-out realizado com sucesso para o quarto de número " + numero);
                    System.out.println("O valor total a ser pago é de " + valorTotal);
                } else {
                    System.out.println("O quarto solicitado para Check-out não possui nenhum hóspede");
                }
            }
        }
        return valorTotal;
    }

}

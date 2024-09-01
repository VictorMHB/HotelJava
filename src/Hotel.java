import br.com.hotel.modelo.Quarto;
import br.com.hotel.modelo.QuartoLuxo;
import br.com.hotel.modelo.QuartoPresidente;
import br.com.hotel.modelo.QuartoSimples;

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

    }

    public void listarQuartosDisponiveis() {
        for (int i = 0; i < listaQuartos.size(); i++) {
            Quarto quartoAux = listaQuartos.get(i);
            System.out.println("Número do Quarto: " + quartoAux.getNumero());
            System.out.println("Disponibilidade do Quarto: " + quartoAux.isDisponibilidade());
            System.out.println("Tipo do Quarto: " + quartoAux.getClass().getName());
            System.out.println("Preço da Diária: " + quartoAux.getPrecoDiaria());
        }
    }

    public String buscarQuarto(int numero) {
        Quarto quartoAux;
        String saida = "O quarto com o número " + numero +  " foi encontrado:\n";

            for (int i = 0; i < listaQuartos.size(); i++) {
                quartoAux = listaQuartos.get(i);
                if (quartoAux.getNumero() == numero) {
                    saida += "Disponibilidade: " + quartoAux.isDisponibilidade() + "\n";
                    saida += "Preço da Diária: " + quartoAux.getPrecoDiaria() + "\n";
                    saida += "Tipo do Quarto: " + quartoAux.getClass().getName() + "\n";

                } else {
                    saida = "Número não encontrado, tente novamente";
                }
            }
            return saida;
    }
}

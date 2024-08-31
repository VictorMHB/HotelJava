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
}

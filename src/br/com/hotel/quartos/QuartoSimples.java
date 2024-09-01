package br.com.hotel.quartos;

public class QuartoSimples extends Quarto{
    public QuartoSimples(int numero) {
        super(numero);
    }

    @Override
    public double calcularValorTotal(int dias) {
        return getPrecoDiaria() * dias;
    }

    @Override
    public double getPrecoDiaria() {
        return super.getPrecoDiaria();
    }

}

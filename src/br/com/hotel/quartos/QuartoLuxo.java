package br.com.hotel.quartos;

public class QuartoLuxo extends Quarto{
    public QuartoLuxo(int numero) {
        super(numero);
    }

    @Override
    public double calcularValorTotal(int dias) {
        return getPrecoDiaria() * dias;
    }

    @Override
    public double getPrecoDiaria() {
        return super.getPrecoDiaria() * 2;
    }

}

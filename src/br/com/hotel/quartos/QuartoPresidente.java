package br.com.hotel.quartos;

public class QuartoPresidente extends Quarto{
    public QuartoPresidente(int numero) {
        super(numero);
    }

    @Override
    public double calcularValorTotal(int dias) {
        return getPrecoDiaria() * dias;
    }

    @Override
    public double getPrecoDiaria() {
        return super.getPrecoDiaria() * 5;
    }

}

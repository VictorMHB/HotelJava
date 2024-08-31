package br.com.hotel.modelo;

public class QuartoLuxo extends Quarto{
    public QuartoLuxo(int numero) {
        super(numero);
    }

    @Override
    public double getPrecoDiaria() {
        return super.getPrecoDiaria() * 2;
    }
}

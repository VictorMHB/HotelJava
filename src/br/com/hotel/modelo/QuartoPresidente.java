package br.com.hotel.modelo;

public class QuartoPresidente extends Quarto{
    public QuartoPresidente(int numero) {
        super(numero);
    }

    @Override
    public double getPrecoDiaria() {
        return super.getPrecoDiaria() * 4;
    }
}

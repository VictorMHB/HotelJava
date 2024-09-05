package br.com.hotel.quartos;

public abstract class Quarto {
    private int numero;
    private double precoDiaria;
    private boolean disponibilidade;

    public Quarto(int numero) {
        setNumero(numero);
        this.precoDiaria = 120;
        this.disponibilidade = true;
    }

    public abstract double calcularValorTotal(int dias);

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0){
            throw new IllegalArgumentException("O número do quarto não pode ser negativo");
        }

        this.numero = numero;
    }

    public double getPrecoDiaria() {
        return precoDiaria;
    }

    public void setPrecoDiaria(double precoDiaria) {
        this.precoDiaria = precoDiaria;
    }

    public boolean isDisponivel() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
}

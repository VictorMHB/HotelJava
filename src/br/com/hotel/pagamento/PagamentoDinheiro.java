package br.com.hotel.pagamento;

public class PagamentoDinheiro implements Pagamento {

    @Override
    public String realizarPagamento(double valor) {
        return  "O pagamento de R$" + valor + " foi realizado com Dinheiro.";
    }
}

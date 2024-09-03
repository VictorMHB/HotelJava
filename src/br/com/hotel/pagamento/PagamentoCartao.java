package br.com.hotel.pagamento;

public class PagamentoCartao implements Pagamento {

    @Override
    public String realizarPagamento(double valor) {
        return  "O pagamento de R$" + valor + " foi realizado com Cartão.\n" +
                "Gerando um total de " + (valor * 0.1) + " milhas.";
    }
}

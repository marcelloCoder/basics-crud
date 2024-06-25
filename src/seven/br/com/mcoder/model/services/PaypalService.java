package seven.br.com.mcoder.model.services;

public class PaypalService implements PagamentoOnlineService{
    @Override
    public Double taxaPagamento(Double quantia) {
        return quantia * 0.02;
    }

    @Override
    public Double juros(Double quantia, Integer meses) {
        return quantia * 0.01 * meses;
    }
}

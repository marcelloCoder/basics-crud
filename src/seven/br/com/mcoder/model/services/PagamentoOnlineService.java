package seven.br.com.mcoder.model.services;

public interface PagamentoOnlineService {

    Double taxaPagamento(Double quantia);
    Double juros(Double quantia, Integer meses);
}

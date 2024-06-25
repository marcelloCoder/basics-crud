package seven.br.com.mcoder.model.services;

import seven.br.com.mcoder.model.entities.Contrato;
import seven.br.com.mcoder.model.entities.Prestacao;

import java.time.LocalDate;

public class ContratoService {

    private PagamentoOnlineService pagamentoOnlineService;

    public ContratoService() {
    }

    public ContratoService(PagamentoOnlineService pagamentoOnlineService) {
        this.pagamentoOnlineService = pagamentoOnlineService;
    }

    public void processoContrato(Contrato contrato, Integer meses){

        double parcelaBasica = contrato.getValorTotal() / meses;

        for (int i = 1; i <= meses ; i++) {
            LocalDate dataVencimento = contrato.getData().plusMonths(i);

            double jurosCadaMes = pagamentoOnlineService.juros(parcelaBasica, i);
            double taxa = pagamentoOnlineService.taxaPagamento(parcelaBasica + jurosCadaMes);
            double parcelaTotal = parcelaBasica + jurosCadaMes + taxa;

            contrato.getListaPrestacao().add(new Prestacao(dataVencimento, parcelaTotal));
        }

    }
}

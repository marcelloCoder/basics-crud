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
        contrato.getListaPrestacao().add(new Prestacao(LocalDate.of(2001,3,1),200.5));
        contrato.getListaPrestacao().add(new Prestacao(LocalDate.of(2015,6,29),230.0));

    }
}

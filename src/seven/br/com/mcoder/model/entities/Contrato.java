package seven.br.com.mcoder.model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contrato {

    private Long numero;
    private LocalDate data;
    private Double valorTotal;

    private List<Prestacao> listaPrestacao = new ArrayList<>();

    public Contrato() {
    }

    public Contrato(Long numero, LocalDate data, Double valorTotal) {
        this.numero = numero;
        this.data = data;
        this.valorTotal = valorTotal;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<Prestacao> getListaPrestacao() {
        return listaPrestacao;
    }
}

package seven.br.com.mcoder.model.entities;

import java.time.LocalDate;

public class Prestacao {

    private LocalDate dataVencimento;

    private Double quantia;

    public Prestacao() {
    }

    public Prestacao(LocalDate dataVencimento, Double quantia) {
        this.dataVencimento = dataVencimento;
        this.quantia = quantia;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Double getQuantia() {
        return quantia;
    }

    public void setQuantia(Double quantia) {
        this.quantia = quantia;
    }
}

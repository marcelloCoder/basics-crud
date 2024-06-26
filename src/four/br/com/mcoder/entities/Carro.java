package four.br.com.mcoder.entities;

import java.time.LocalDate;
import java.util.Date;

public abstract class Carro {

    private Long id;
    private String marca;
    private String modelo;
    private Double valor;
    private LocalDate data_fabricado;

    public Carro() {
    }

    public Carro(Long id, String marca, String modelo, Double valor, LocalDate data_fabricado) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.valor = valor;
        this.data_fabricado = data_fabricado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public LocalDate getData_fabricado() {
        return data_fabricado;
    }

    public void setData_fabricado(LocalDate data_fabricado) {
        this.data_fabricado = data_fabricado;
    }

    @Override
    public String toString() {
        return "\n\nCarro\n" +
                "id=" + id +
                "\nmarca=" + marca +
                "\nmodelo='" + modelo +
                "\nvalor=" + valor +
                "\ndata_fabricado=" + data_fabricado;
    }
}

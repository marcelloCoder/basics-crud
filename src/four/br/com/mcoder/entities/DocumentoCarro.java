package four.br.com.mcoder.entities;

import java.time.LocalDate;
import java.util.Date;

public class DocumentoCarro extends Carro{
    private String dono;
    private Boolean ipva;

    public DocumentoCarro() {
        super();
    }

    public DocumentoCarro(Long id, String marca, String modelo, Double valor, LocalDate data_fabricado, String dono, Boolean ipva) {
        super(id, marca, modelo, valor, data_fabricado);
        this.dono = dono;
        this.ipva = ipva;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public Boolean getIpva() {
        return ipva;
    }

    public void setIpva(Boolean ipva) {
        this.ipva = ipva;
    }

    public void novo_Dono(String novoDono){
        dono = novoDono;
    }

    @Override
    public String toString() {
        return "\n\nDocumentoCarro \n" +
                "dono=" + dono +
                ", \nipva=" + ipva + super.toString();
    }
}

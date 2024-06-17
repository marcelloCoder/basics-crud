package four.br.com.mcoder.entities;

import java.util.Date;

public class DocumentoCarro extends Carro{
    private String dono;
    private String ipva;

    public DocumentoCarro() {
        super();
    }

    public DocumentoCarro(Long id, String marca, String modelo, Double valor, Date data_fabricado, String dono, String ipva) {
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

    public String getIpva() {
        return ipva;
    }

    public void setIpva(String ipva) {
        this.ipva = ipva;
    }
}

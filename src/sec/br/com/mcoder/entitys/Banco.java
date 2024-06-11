package sec.br.com.mcoder.entitys;

public class Banco {


    private Double saque;
    private Double deposito;
    public Banco() {
    }

    public void saque(Double saldo, Double valor){
        saldo =- valor;
        System.out.println(saldo);
    }

    public void deposito(Double saldo, Double valor){
        saldo =+ valor;
        System.out.println(saldo);
    }


}

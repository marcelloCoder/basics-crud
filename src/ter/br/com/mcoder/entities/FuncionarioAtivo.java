package ter.br.com.mcoder.entities;

public class FuncionarioAtivo extends Funcionario {

    private String status;
    private String depoimento;

    public FuncionarioAtivo() {
        super();
    }

    public FuncionarioAtivo(Integer id, String nome, Double salario, String status, String depoimento) {
        super(id, nome, salario);
        this.status = status;
        this.depoimento = depoimento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDepoimento() {
        return depoimento;
    }

    public void setDepoimento(String depoimento) {
        this.depoimento = depoimento;
    }


    @Override
    public void aumentarSalario(Double porcentagem) {
        Double salario = getSalario();
        if (status.equals("online")) {
            salario += (salario * porcentagem) / 100;
        }
    }
}

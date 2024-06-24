package ter.br.com.mcoder.entities;

public class FuncionarioParticular extends Funcionario{

    private String classificacao;

    public FuncionarioParticular() {
       super();
    }

    public FuncionarioParticular(Integer id, String nome, Double salario, String classificacao) {
        super(id, nome, salario);
        this.classificacao = classificacao;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    @Override
    public String toString() {
        return "FuncionarioParticular{" +
                "classificacao='" + classificacao + '\'' +
                "} " + super.toString();
    }

    @Override
    public Double aumentarSalario(Double porcentagem) {
        Double salario = getSalario();
        if (classificacao.equals("alto")){
            salario = salario * porcentagem / 100;
        }
        return salario;
    }
}

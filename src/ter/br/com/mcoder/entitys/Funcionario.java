package ter.br.com.mcoder.entitys;

public class Funcionario {

    private Integer id;
    private String nome;
    private Double salario;

    public Funcionario() {
    }

    public Funcionario(Integer id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", salário=" + salario +
                '}';
    }

    public void aumentarSalario(Double porcentagem){
        salario += salario * porcentagem /  100;
    }
}

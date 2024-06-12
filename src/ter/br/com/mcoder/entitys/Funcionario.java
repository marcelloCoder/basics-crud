package ter.br.com.mcoder.entitys;

public class Funcionario {

    private Integer id;
    private String nome;
    private Double salário;

    public Funcionario() {
    }

    public Funcionario(Integer id, String nome, Double salário) {
        this.id = id;
        this.nome = nome;
        this.salário = salário;
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

    public Double getSalário() {
        return salário;
    }

    public void setSalário(Double salário) {
        this.salário = salário;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", salário=" + salário +
                '}';
    }
}

package instituicao.instituicao;

public class Funcionario extends Pessoa {
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cpf, String email, String cargo, double salario) {
        super(nome, cpf, email);
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCargo() { 
        return cargo; 
    }
    
    public void setCargo(String cargo) { 
        this.cargo = cargo; 
    }

    public double getSalario() { 
        return salario; 
    }
    public void setSalario(double salario) { 
        this.salario = salario; 
    }

    public String toString() {
        return super.toString() + "\nCargo: " + cargo + "\nSalário: R$" + salario;
    }
}
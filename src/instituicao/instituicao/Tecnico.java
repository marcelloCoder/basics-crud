package instituicao.instituicao;


public class Tecnico extends Funcionario {
    private String setor;
    private String turno;

    public Tecnico(String nome, String cpf, String email, String cargo, double salario, String setor, String turno) {
        super(nome, cpf, email, cargo, salario);
        this.setor = setor;
        this.turno = turno;
    }

    public String getSetor() { 
        return setor; 
    }
    
    public void setSetor(String setor) { 
        this.setor = setor; 
    }

    public String getTurno() { 
        return turno;
    }
    public void setTurno(String turno) { 
        this.turno = turno; 
    }

    public String toString() {
        return super.toString() + "\nSetor: " + setor + "\nTurno: " + turno;
    }
}
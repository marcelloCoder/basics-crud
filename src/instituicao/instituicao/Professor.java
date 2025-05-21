package instituicao.instituicao;


public class Professor extends Funcionario {
    private String disciplina;
    private int cargaHoraria;

    public Professor(String nome, String cpf, String email, String cargo, double salario, String disciplina, int cargaHoraria) {
        super(nome, cpf, email, cargo, salario);
        this.disciplina = disciplina;
        this.cargaHoraria = cargaHoraria;
    }

    public String getDisciplina() { 
        return disciplina; 
    }
    
    public void setDisciplina(String disciplina) { 
        this.disciplina = disciplina; 
    }

    public int getCargaHoraria() { 
        return cargaHoraria; 
    }
    
    public void setCargaHoraria(int cargaHoraria) { 
        this.cargaHoraria = cargaHoraria; 
    }

    public String toString() {
        return super.toString() + "\nDisciplina: " + disciplina + "\nCarga Horária: " + cargaHoraria + "h";
    }
}
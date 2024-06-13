package ter.br.com.mcoder.fuctions;


import ter.br.com.mcoder.entitys.Funcionario;

public class Notas {

    public Funcionario preencher(Integer id, String nome, Double salario){
        Funcionario funcionario = new Funcionario();
        funcionario.setId(id);
        funcionario.setNome(nome);
        funcionario.setSalario(salario);
        return funcionario;
    }
}

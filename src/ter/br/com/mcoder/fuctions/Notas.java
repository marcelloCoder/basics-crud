package ter.br.com.mcoder.fuctions;


import ter.br.com.mcoder.entities.Funcionario;
import ter.br.com.mcoder.entities.FuncionarioAtivo;
import ter.br.com.mcoder.entities.FuncionarioParticular;

public class Notas {

    public FuncionarioParticular preencherParticular(Integer id, String nome, Double salario, String classificacao){
        FuncionarioParticular funcionarioP = new FuncionarioParticular();
        funcionarioP.setId(id);
        funcionarioP.setNome(nome);
        funcionarioP.setSalario(salario);
        funcionarioP.setClassificacao(classificacao);
        return funcionarioP;
    }

    public FuncionarioAtivo preencherAtivo(Integer id, String nome, Double salario, String status, String depoimento){
        FuncionarioAtivo funcionarioAtivo = new FuncionarioAtivo();
        funcionarioAtivo.setId(id);
        funcionarioAtivo.setNome(nome);
        funcionarioAtivo.setSalario(salario);
        funcionarioAtivo.setStatus(status);
        funcionarioAtivo.setDepoimento(depoimento);
        return funcionarioAtivo;
    }
}

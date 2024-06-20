package ter.br.com.mcoder.app;

import ter.br.com.mcoder.entities.Funcionario;
import ter.br.com.mcoder.entities.FuncionarioAtivo;
import ter.br.com.mcoder.entities.FuncionarioParticular;
import ter.br.com.mcoder.fuctions.Notas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class App {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        //Funcionario funcionario = new Funcionario();
        FuncionarioAtivo funcionarioAtivo = new FuncionarioAtivo();
        FuncionarioParticular funcionarioParticular = new FuncionarioParticular();
        Notas notas = new Notas();
        List<Funcionario> funcionarioLista = new ArrayList<>();

        Funcionario marcello = notas.preencherParticular(1,"Marcello", Double.valueOf("309.7"), "alto");
        Funcionario ana = notas.preencherParticular(2,"Ana", Double.valueOf("432.9"), "alto");
        Funcionario pedro = notas.preencherParticular(3,"Pedro", Double.valueOf("565.8"), "alto");

        funcionarioLista.add(marcello);
        funcionarioLista.add(ana);
        funcionarioLista.add(pedro);

        List<Funcionario> funcionarioMenorSalario = new ArrayList<>();
        List<Funcionario> funcionarioMaiorSalario = new ArrayList<>();


        for (Funcionario funcionario1 : funcionarioLista){
            if(funcionario1.getSalario() <= 500.0){
                funcionarioMenorSalario.add(funcionario1);

            }else{
                funcionarioMaiorSalario.add(funcionario1);

            }
        }
        System.out.println(funcionarioMenorSalario);
        System.out.println(funcionarioMaiorSalario);
        //System.out.println(funcionarioLista);

        marcello.aumentarSalario(00.5);

        System.out.println(marcello);


    }
}

package ter.br.com.mcoder.app;

import ter.br.com.mcoder.entitys.Funcionario;
import ter.br.com.mcoder.fuctions.Notas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class App {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Funcionario funcionario = new Funcionario();
        Notas notas = new Notas();
        List<Funcionario> funcionarioLista = new ArrayList<>();

        Funcionario marcello = notas.preencher(1,"Marcello", Double.valueOf("309.7"));
        Funcionario ana = notas.preencher(2,"Ana", Double.valueOf("432.9"));
        Funcionario pedro = notas.preencher(3,"Pedro", Double.valueOf("565.8"));

        funcionarioLista.add(marcello);
        funcionarioLista.add(ana);
        funcionarioLista.add(pedro);
        System.out.println(funcionario);


    }
}

package sec.br.com.mcoder.app;

import sec.br.com.mcoder.entitys.Banco;
import sec.br.com.mcoder.entitys.Cliente;

import java.io.IOException;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Cliente cliente = new Cliente();
        Scanner sc = new Scanner(System.in);

        System.out.println("BEM-VINDO");
        System.out.println("Número da conta");
        Long numero = sc.nextLong();
        System.out.println("Nome: ");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.println("Deseja acessar banco?");
        String resposta = sc.nextLine();

        cliente.setCodigo(numero);
        cliente.setNome(nome);
        cliente.setSaldo(500.0);


        if(resposta.isEmpty()){
            System.out.println("OK, até mais");
        }

            System.out.println("Deseja depositar ou sacar?");
            String resposta2 = sc.nextLine();
            if (resposta2.equals("sacar")) {
                System.out.println("Saldo disponivel: " + cliente.getSaldo());
                System.out.println("Sacar quanto?");
                Double sacar = sc.nextDouble();
                cliente.saque(sacar);

            } else if (resposta2.equals("depositar")) {
                System.out.println("Saldo disponivel: " + cliente.getSaldo());
                System.out.println("Depositar quanto?");
                Double depositar = sc.nextDouble();
                cliente.deposito(depositar);
            }







        System.out.println(cliente);

        sc.close();
    }

}

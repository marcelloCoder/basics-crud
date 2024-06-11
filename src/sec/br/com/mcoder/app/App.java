package sec.br.com.mcoder.app;

import sec.br.com.mcoder.entitys.Banco;
import sec.br.com.mcoder.entitys.Cliente;

import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Scanner sc = new Scanner(System.in);

        System.out.println("BEM-VINDO");
        System.out.println("Número da conta");
        int numero = sc.nextInt();
        System.out.println("Nome: ");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.println("Deseja acessar banco?");
        String resposta = sc.nextLine();

        if(resposta.isEmpty()){
            System.out.println("OK, até mais");
        }

            System.out.println("Deseja depositar ou sacar?");
            String resposta2 = sc.nextLine();
            if (resposta2.equals("sacar")) {
                System.out.println("Sacar quanto?");
            } else if (resposta2.equals("depositar")) {
                System.out.println("Depositar quanto?");
            }







        //System.out.println(cliente);

        sc.close();
    }

}

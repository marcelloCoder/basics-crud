package sec.br.com.mcoder.app;

import sec.br.com.mcoder.entitys.Cliente;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < ; i++) {

        }
        System.out.print("Nome do cliente:");
        String nome = sc.next();
        cliente.setNome(nome);
        System.out.println(cliente);

        sc.close();
    }

}

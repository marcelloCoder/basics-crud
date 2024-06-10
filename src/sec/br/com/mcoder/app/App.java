package sec.br.com.mcoder.app;

import sec.br.com.mcoder.entitys.Cliente;

import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Scanner sc = new Scanner(System.in);

        System.out.println("Cadastrar quantos clientes?");
        System.out.print("Quantidade: ");
        int num_cliente = sc.nextInt();
        for (int i = 0; i < num_cliente; i++) {
            System.out.print("Nome do cliente:");
            String nome = sc.next();
            cliente.setCodigo(i + 1L);
            i++;
        }

        // cliente.setNome(nome);
        System.out.println(cliente);

        sc.close();
    }

}

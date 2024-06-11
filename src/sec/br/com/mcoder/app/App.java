package sec.br.com.mcoder.app;

import sec.br.com.mcoder.entitys.Banco;
import sec.br.com.mcoder.entitys.Cliente;

import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Banco banco = new Banco();

        Scanner sc = new Scanner(System.in);
        cliente.setSaldo(542.3);
        banco.deposito(cliente.getSaldo(), 400.1);
        System.out.println(banco);


        //System.out.println(cliente);

        sc.close();
    }

}

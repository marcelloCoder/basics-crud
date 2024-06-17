package sec.br.com.mcoder.app;

import sec.br.com.mcoder.entitys.Cliente;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Cliente cliente = new Cliente();
        Scanner sc = new Scanner(System.in);
        System.out.println("DIGITE 1 PARA ABRIR INTERFACE : ");
        String teste1 = sc.nextLine();

        while (teste1.equals("1")) {


            try {
                System.out.println("BEM-VINDO");
                System.out.println("Número da conta");
                Long numero = sc.nextLong();
                System.out.println("Nome: ");
                sc.nextLine();
                String nome = sc.nextLine();
                System.out.println("Qual é o seu saldo inicial?");
                Double saldoInicial = sc.nextDouble();
                sc.nextLine();
                System.out.println("Deseja acessar banco?");
                String resposta = sc.nextLine();


                cliente.setCodigo(numero);
                cliente.setNome(nome);
                cliente.setSaldo(saldoInicial);


                if (resposta.isEmpty()) {
                    System.out.println("OK, até mais");
                }else{
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
                    } else {
                        System.out.println("ATÉ MAIS!");

                    }

                }




            }catch (InputMismatchException e){
                System.out.println("DIGITE APENAS NUMEROS");
                e.printStackTrace();
            }


            System.out.println(cliente);
            System.out.println("DIGITE 1 PARA CONTINUAR OU OUTRO PARA SAIR");

            sc.nextLine();
            teste1 = sc.nextLine();
        }


        sc.close();

    }

}

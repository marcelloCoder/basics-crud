package us.br.com.mcoder.studies.poo.ds.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Double price = scanner.nextDouble();


        if (price >= 0){
            if (price < 200){
                price += 1.5;
            }
            System.out.println(price);
        }
    }
}

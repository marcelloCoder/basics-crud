package five.br.com.mcoder.app;

import five.br.com.mcoder.entities.Shape;
import five.br.com.mcoder.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        System.out.println("DIGITE O NUMERO DE DESENHOS(SHAPE): ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("DESENHO #" + i + " dados: ");
            System.out.println("RETANGULO OU CIRCULO (r/c)?");
            char ch = sc.next().charAt(0);
            System.out.println("QUAL A COR? (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());
            if(ch == 'r'){
                System.out.println("LARGURA: ");
                double width = sc.nextDouble();
                System.out.println("ALTURA: ");
                double height = sc.nextDouble();
            }

        }
        sc.close();
    }
}

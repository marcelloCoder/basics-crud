package four.br.com.mcoder.app;

import four.br.com.mcoder.entities.Carro;
import four.br.com.mcoder.entities.DocumentoCarro;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.*;


public class App {
    public static void main(String[] args) {

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<DocumentoCarro> carro = new ArrayList<>();
        String data = "20/03/2001";
        System.out.println("Insira data (dd/MM/yyyy)");
        LocalDate str = LocalDate.parse(data, fmt);
        carro.add(new DocumentoCarro(1L, "hyundai", "hb20", 20000.00, str, "Marcello", true));
        //carro.add(new DocumentoCarro(2L, "ford", "fiesta", 43000.00, data1, "Ana", false));
        //carro.add(new DocumentoCarro(3L, "fiat", "uno", 15000.00, data2, "Maicon", true));


        for (DocumentoCarro list : carro){
            System.out.println(list);
        }



    }
}

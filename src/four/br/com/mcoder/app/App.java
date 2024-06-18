package four.br.com.mcoder.app;

import four.br.com.mcoder.entities.Carro;
import four.br.com.mcoder.entities.DocumentoCarro;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;


public class App {
    public static void main(String[] args) {

        Date data = new Date(103, 9, 10);
        Date data1 = new Date(98, 7, 21);
        Date data2 = new Date(90, 6, 5);
        Locale.setDefault(Locale.US);
        List<DocumentoCarro> carro = new ArrayList<>();

        carro.add(new DocumentoCarro(1L, "hyundai", "hb20", 20000.00, data, "Marcello", true));
        carro.add(new DocumentoCarro(2L, "ford", "fiesta", 43000.00, data1, "Ana", false));
        carro.add(new DocumentoCarro(3L, "fiat", "uno", 15000.00, data2, "Maicon", true));


        for (DocumentoCarro list : carro){
            System.out.println(list);
        }



    }
}

package four.br.com.mcoder.app;

import four.br.com.mcoder.entities.Carro;
import four.br.com.mcoder.entities.DocumentoCarro;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;
import java.util.Locale;


public class App {
    public static void main(String[] args) {

        Date data = new Date(103, 9, 10);
        Locale.setDefault(Locale.US);
        Carro carro = new Carro();
        DocumentoCarro dCarro = new DocumentoCarro();
        dCarro.setId(1L);
        dCarro.setData_fabricado(data);
        System.out.println(dCarro.getData_fabricado());
        dCarro.setDono("Marcello");
        System.out.println(dCarro.getDono());
        dCarro.novo_Dono("Teles");
        System.out.println(dCarro.getDono());
        carro = dCarro;

        System.out.println(carro);

    }
}

package seven.br.com.mcoder.app;

import seven.br.com.mcoder.model.entities.Contrato;
import seven.br.com.mcoder.model.services.ContratoService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println(" - Entre com os dados do contrato - ");
        System.out.println("Numero(Long): ");
        Long numero = sc.nextLong();
        System.out.println("Data(dd/MM/yyyy): ");
        LocalDate data = LocalDate.parse(sc.next(), fmt);
        System.out.println("Valor do contrato: ");
        Double valorTotalContrato = sc.nextDouble();

        Contrato obj = new Contrato(numero, data, valorTotalContrato);

        System.out.println("Entre com o numero de parcelas");
        int n = sc.nextInt();

        ContratoService contratoService = new ContratoService(null);


        sc.close();

    }
}

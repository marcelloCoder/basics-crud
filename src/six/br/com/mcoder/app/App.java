package six.br.com.mcoder.app;

import six.br.com.mcoder.model.entities.CarRental;
import six.br.com.mcoder.model.entities.Vehicle;
import six.br.com.mcoder.model.services.BrazilTaxServices;
import six.br.com.mcoder.model.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel");
        System.out.println("Modelo do carro:");
        String carModel = sc.nextLine();
        System.out.println("Retirada (dd/MM/yyy HH:mm: ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.println("Retorno (dd/MM/yyy HH:mm: ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

        System.out.println("Entre com o preço por hora: ");
        double pricePerHour = sc.nextDouble();
        System.out.println("Entre com o preço por dia: ");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxServices());
        rentalService.processInvoice(cr);

        System.out.println("FATURA: ");
        System.out.println("Pagamento basico: " + cr.getInvoice().getBasicPayment());
        System.out.println("IMPOSTO: " + cr.getInvoice().getTax());
        System.out.println("PAGAMENTO TOTAL: " + cr.getInvoice().getTotalPayment());
        sc.close();
    }
}

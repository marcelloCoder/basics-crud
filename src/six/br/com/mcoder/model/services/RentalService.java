package six.br.com.mcoder.model.services;

import six.br.com.mcoder.model.entities.CarRental;
import six.br.com.mcoder.model.entities.Invoice;

public class RentalService {

    private Double pricePerHour;
    private Double pricePerDay;

    private BrazilTaxServices taxService;

    public RentalService(Double pricePerHour, Double pricePerDay, BrazilTaxServices taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental){
        carRental.setInvoice(new Invoice(50.0,10.0));
    }
}

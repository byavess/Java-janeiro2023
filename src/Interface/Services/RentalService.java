package Interface.Services;

import Interface.TaxService;
import Interface.entities.CarRental;
import Interface.entities.Invoice;

import java.time.Duration;

public class RentalService {
    private Double pricePerHour;
    private Double pricePerDay;
    private TaxService taxService;

//sem construtor vazio para poder obrigar a pegar todos os metodos

    public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public void processInvoice (CarRental carRental){

       double minutes =  Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
       double hours = minutes /60.0;
       double basicPayment;


       if (hours <=12.0){
           basicPayment = pricePerHour * Math.ceil(hours); //ceill arredonda o numero pra cima

       }
       else{
           basicPayment = pricePerDay * Math.ceil(hours/24.0);
       }

       double tax = taxService.tax(basicPayment);
        carRental.setInvoice(new Invoice(basicPayment, tax));
    }


}

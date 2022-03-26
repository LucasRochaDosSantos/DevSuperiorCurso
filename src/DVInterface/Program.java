package DVInterface;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import DVInterface.entities.CarRental;
import DVInterface.entities.Vehicle;
import DVInterface.service.BrazilTaxService;
import DVInterface.service.RentalService;

public class Program {
	public static void main(String[] args) throws ParseException{
     Locale.setDefault(Locale.US);
     Scanner entrada = new Scanner(System.in);
     SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");
     
     System.out.println("Enter rental data: ");
     System.out.print("Car Model: ");
     String carModel = entrada.nextLine();
     System.out.print("Pickup (dd/MM/yyyy hh:ss): ");
     Date start = sdf.parse(entrada.nextLine());
     System.out.print("Return (dd/MM/yyyy hh:ss): ");
     Date finish = sdf.parse(entrada.nextLine());
    
     CarRental carRental = new CarRental(start, finish, new Vehicle(carModel));
    
     System.out.print("Enter price per hour: ");
     double hour = entrada.nextDouble();
     System.out.printf("Enter price per day: ");
     double day = entrada.nextDouble();
     
     RentalService rentalService = new RentalService(day, hour, new BrazilTaxService());
     
     rentalService.processInvoice(carRental);
     
     System.out.println("INVOICE:");
     System.out.print("Basic Payment: " + String.format("%.2f\n", carRental.getInvoice().getBasicPayment()));
     System.out.print("Basic Tax: " + String.format("%.2f\n", carRental.getInvoice().getTax()));
     System.out.print("Basic Total Payment: " + String.format("%.2f\n", carRental.getInvoice().getTotalPayment()));
  
     entrada.close();
	}
}

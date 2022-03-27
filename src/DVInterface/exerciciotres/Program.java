package DVInterface.exerciciotres;

import java.util.Locale;
import java.util.Scanner;

import DVInterface.exerciciotres.entities.InterestService;
import DVInterface.exerciciotres.entities.UsaInterestService;
import DVInterface.exerciciotres.entities.BrazilInterestService;

public class Program {
	public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       Scanner entrada = new Scanner(System.in);
       
       System.out.print("Enter Amount: ");
       double amount = entrada.nextDouble();
       System.out.print("Enter Months: ");
       int months = entrada.nextInt();
       

       InterestService is1 = new BrazilInterestService(2.5);
       double payment = is1.payment(amount, months);
       System.out.printf("Brazil Interest total payment  %.2f\n", payment);
       
       InterestService is2 = new UsaInterestService(1.0);
       payment = is2.payment(amount, months);
       System.out.printf("Usa interest total payment %.2f\n", payment);
       entrada.close();
	}
}

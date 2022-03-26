package DVInterface.exercicio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import DVInterface.exercicio.entites.Contract;
import DVInterface.exercicio.entites.Installment;
import DVInterface.exercicio.service.ContractService;
import DVInterface.exercicio.service.PayPalService;

public class Program {
	public static void main(String[] args) throws ParseException{
      Locale.setDefault(Locale.US);
      Scanner entrada = new Scanner(System.in);
      
      SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
      System.out.println("Enter contract data");
      System.out.print("Number: ");
      Integer number = entrada.nextInt();
      entrada.nextLine();
      System.out.print("Date (dd/MM/yyyy): ");
      Date data = sdf.parse(entrada.nextLine());
      System.out.print("Contract Value: $ ");
      double value = entrada.nextDouble();
      System.out.print("Enter Number of installments: ");
      int installmentsN = entrada.nextInt();
      
      Contract contract = new Contract(number, data, value);
      
      ContractService contractService = new ContractService(new PayPalService());
      contractService.processContract(contract, installmentsN);
      
      for(Installment installment : contract.getInstallments()) {
    	  System.out.println(installment);
      }
      
      entrada.close();
	}
}

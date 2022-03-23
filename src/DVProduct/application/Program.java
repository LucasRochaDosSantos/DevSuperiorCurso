package DVProduct.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import DVProduct.entities.ImportedProduct;
import DVProduct.entities.Product;
import DVProduct.entities.UsedProduct;

public class Program {
	
	  public static void main(String[] args) throws ParseException {
		  Locale.setDefault(Locale.US);
		  Scanner entrada = new Scanner(System.in);
		    SimpleDateFormat simpleDate = new SimpleDateFormat("dd/MM/yyyy");
			List<Product> lista = new ArrayList<>();
			System.out.print("Enther the numbher of Products: ");
			int n = entrada.nextInt();
			entrada.nextLine();
			for (int x = 1; x <= n; x++) {
				System.out.println("Product #" + x + " data: ");
				System.out.print("Outsourced (c/u/i)? ");
				char ch = entrada.next().charAt(0);
				entrada.nextLine();
				System.out.print("Name: ");
				String name = entrada.nextLine();
				System.out.print("Price: ");
				double price = entrada.nextDouble();
				entrada.nextLine();
				if (ch == 'i' || ch == 'I') {
					System.out.println("Customs fee: ");
					double customsFee = entrada.nextDouble();
					lista.add(new ImportedProduct(name, price, customsFee));
				} else if(ch == 'u' || ch =='U'){
					System.out.print("Manufacture Date (DD/MM/YYYY):");
					String dataInfo = entrada.nextLine();
					lista.add(new UsedProduct(name, price, simpleDate.parse(dataInfo)));
				} else {
					lista.add(new Product(name, price));
				}
			}
			for(Product emp : lista) {
				System.out.println(emp.priceTag());
			}
			
			entrada.close();
		}
}

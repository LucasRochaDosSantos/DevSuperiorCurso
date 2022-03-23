package DVEmploye.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import DVEmploye.entites.Employe;
import DVEmploye.entites.OutSourcedEmployee;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		List<Employe> lista = new ArrayList<>();
		System.out.print("Enther the numbher of employee: ");
		int n = entrada.nextInt();
		entrada.nextLine();
		for (int x = 1; x <= n; x++) {
			System.out.println("Employee #" + x + " data: ");
			System.out.print("Outsourced (y/n)? ");
			char ch = entrada.next().charAt(0);
			System.out.print("Name: ");
			entrada.nextLine();
			String name = entrada.nextLine();
			System.out.print("Hours: ");
			int hours = entrada.nextInt();
			entrada.nextLine();
			System.out.print("Value per Hour: ");
			double valuePerHour = entrada.nextDouble();
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Additional charge: ");
				double additionalCharce = entrada.nextDouble();
				lista.add(new OutSourcedEmployee(name, hours, valuePerHour, additionalCharce));
			} else {
				lista.add(new Employe(name, hours, valuePerHour));
			}
		}
		for (Employe emp : lista) {
			System.out.printf("%s  $ %.2f \n", emp.getName(), emp.payment());
		}

		entrada.close();
	}
}

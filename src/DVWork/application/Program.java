package DVWork.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import DVWork.entities.Departament;
import DVWork.entities.HourContract;
import DVWork.entities.Worker;
import DVWork.entities.enums.WorkLevel;

public class Program {
	public static void main(String[] args) throws ParseException 
	{
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		SimpleDateFormat simpleDate = new SimpleDateFormat("dd/MM/yyyy");
		System.out.print("Enter department's name: ");
		String departmentName = entrada.nextLine();
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String workName = entrada.nextLine();
		System.out.print("Level: ");
		String workLevel = entrada.nextLine();
		System.out.print("Base Salary: ");
		Double baseSalary = entrada.nextDouble();
		System.out.println();
		Worker worker = new Worker(workName, WorkLevel.valueOf(workLevel), baseSalary, new Departament(departmentName));
		System.out.print("HOW MANY CONTRACTS TO THIS WORKER? ");
		int n = entrada.nextInt();
		for(int i = 1; i <= n; i++) {
			System.out.println("Enter contract #" + i +" data: ");
			System.out.print("(DD/MM/YYY): ");
			Date contractDate = simpleDate.parse(entrada.next());
			System.out.println();
			System.out.print("Vale per Hour: ");
			double valuePerHour = entrada.nextDouble();
			System.out.print("Duration (Hours): ");
			int hour = entrada.nextInt();
			HourContract hourContract = new HourContract(contractDate, valuePerHour, hour);
			worker.addContract(hourContract);
		}
		entrada.nextLine();
		System.out.println("Enter month and year to calculate income(MM/YYYY)");
		String monthAndYear = entrada.nextLine();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income For "+ monthAndYear+" : " + String.format("%.2f", worker.income(year, month)));
		entrada.close();
	}
}

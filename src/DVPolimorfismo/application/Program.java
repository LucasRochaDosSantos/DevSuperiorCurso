package DVPolimorfismo.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import DVPolimorfismo.entities.Circle;
import DVPolimorfismo.entities.Rectangle;
import DVPolimorfismo.entities.Shape;
import DVPolimorfismo.enums.Color;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		List<Shape> lista = new ArrayList<>();
		System.out.print("Enter the number of shape: ");
		int n = entrada.nextInt();
		entrada.nextLine();
		for (int x = 1; x <= n; x++) {
			System.out.print("Rectangle or Circle (r/c) ?: ");
			char ch = entrada.next().charAt(0);
			entrada.nextLine();
			System.out.print("Color (BLACK, BLUE, RED)?: ");
			String color = entrada.nextLine();
			if (ch == 'r' || ch == 'R') {
				System.out.print("Width: ");
				double width = entrada.nextDouble();
				System.out.print("Height: ");
				double height = entrada.nextDouble();
				lista.add(new Rectangle(Color.valueOf(color), width, height));
			} else {
				System.out.print("Radius: ");
				double radius = entrada.nextDouble();
				lista.add(new Circle(Color.valueOf(color), radius));
			}

		}
		System.out.println("Shape Areas: ");
		for (Shape sp : lista) {
			System.out.printf("%.2f\n", sp.area());
		}
		entrada.close();
	}
}

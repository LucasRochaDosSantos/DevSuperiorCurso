package DVInterface.exerciciodois;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import DVInterface.exerciciodois.entities.Funcionario;

public class Program {
	public static void main(String[] args) {
		
		List<Funcionario> lista = new ArrayList<>();
		String path = "C:\\Users\\Lucas Rocha\\Documents\\in.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String employeeCSV = br.readLine();
			while (employeeCSV != null) {
				String[] fields = employeeCSV.split(",");
				lista.add(new Funcionario(fields[0], Double.parseDouble(fields[1])));
				employeeCSV = br.readLine();
			}
			Collections.sort(lista);
			for (Funcionario s : lista) {
				System.out.printf("%s %.2f\n", s.getName(), s.getSalary());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

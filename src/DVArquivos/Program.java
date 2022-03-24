package DVArquivos;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entrada = null;

		File caminhoArquivo = new File("c:\\LucasTexto.txt");
		try {
			entrada = new Scanner(caminhoArquivo);
			while (entrada.hasNextLine()) {
				System.out.println(entrada.nextLine());
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if (entrada != null) {
				entrada.close();
			}
		}
	}
}

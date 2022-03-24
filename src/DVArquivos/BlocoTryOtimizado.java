package DVArquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

public class BlocoTryOtimizado {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		String path = "c:\\LucasTexto.txt";
	
		try( BufferedReader arquivoDois = new BufferedReader(new FileReader(path)) ){

			String linha = arquivoDois.readLine();
			while (linha != null) {
				System.out.println(linha);
				linha = arquivoDois.readLine();
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		} 
	}
}

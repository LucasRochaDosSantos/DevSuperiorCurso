package DVArquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;

public class LeituraStream {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		String[] linhas = new String[] { "Lucas Rocha", "lucasrocharsx@outlook.com" , "MatrixDev" };
		String path = "C:\\Users\\Lucas Rocha\\Documents\\aulaJavaArquivos.txt";

		// param FileWrite(path, true) preserva o arquivo caso ele exista
		try (BufferedWriter arquivoIO = new BufferedWriter(new FileWriter(path))) {
			for (String linha : linhas) {
				arquivoIO.write(linha);
				arquivoIO.newLine();

			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

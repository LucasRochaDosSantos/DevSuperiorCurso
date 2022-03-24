package DVArquivos;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class ManipulandoPasta {
	public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      Scanner entrada = new Scanner (System.in);
      System.out.println("Enter a folder path: ");
      String arquivoPath = entrada.nextLine();
      File path = new File(arquivoPath);
      
      File[] folder = path.listFiles(File::isDirectory);
      
      System.out.println("Folder: ");
      for(File nome : folder) {
    	   System.out.println(nome);
      }
      File[] arquivos = path.listFiles(File::isFile);
      for(File arq : arquivos) {
         System.out.println(arq);    	  
      }
      boolean sucess = new File(arquivoPath + "\\subDir").mkdir();
      System.out.println("Directory Created Sucessfully: " + sucess);
      entrada.close();
      
	}
}

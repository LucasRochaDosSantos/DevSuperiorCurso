package DVArquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

public class LeituraArquivo {
	public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       
       String path = "c:\\LucasTexto.txt";
       FileReader arquivo = null;
       BufferedReader arquivoDois = null;
       
       try{
    	   arquivo = new FileReader(path);
    	   arquivoDois = new BufferedReader(arquivo);
    	   
    	   String linha = arquivoDois.readLine();
    	   while(linha != null) {
    		   System.out.println(linha);
    		   linha = arquivoDois.readLine();
    	   }
    	   
       }catch(IOException e){
    	   System.out.println(e.getMessage());
       }finally {
    	   
    	   try {
    	   if(arquivoDois != null ){
    		   arquivoDois.close();
    	   }
    	   if(arquivo != null){
    		   arquivo.close();
    	   }
    	   }catch(IOException e) {
    		   System.out.println("Erro");
    		   e.printStackTrace();
    	   }
       }
	}
}

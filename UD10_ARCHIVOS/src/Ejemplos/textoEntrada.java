package Ejemplos;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class textoEntrada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombreFichero="c:/archivos/ejemplo01.txt";
		
		//crear el objeto
		File f=new File(nombreFichero);
		
		try {
			BufferedReader file = new BufferedReader (new FileReader(f));
		
			int caracter=file.read();//leemos un caracter
			while (caracter!=-1) {//mientras no lleguemos al final del archivo
				System.out.print((char) caracter);
				caracter=file.read();
				
			}
		
			file.close();
		
		}catch(IOException ex) {
			System.out.println("El archivo no se puede abrir");
			
		}
	}

}

package Ejemplos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class textoSalida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		File f=new File(nombreFichero);
		
		try {
			BufferedWriter file = new BufferedWriter (new FileWriter(f));
		
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

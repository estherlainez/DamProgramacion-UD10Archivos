package Ejemplos;
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class textoEntrada2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombreFichero= "c:\\Programación\\ejemplo01.txt";
		
		//crear el objeto file
		File f=new File(nombreFichero);
		
		try {
		BufferedReader file = new BufferedReader (new FileReader(f));
		String caracter=file.readLine();//leemos un caracter
		while (caracter!=null) { //mientras no lleguemos al final del archivo
			System.out.println(caracter);
			caracter=file.readLine();
		}
		file.close();
		}catch(IOException ex) {
			System.out.println("el archivo no se puede abrir");
		}

	}

}

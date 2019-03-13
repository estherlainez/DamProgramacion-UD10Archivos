package Ejercicios;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduzca el nombre del archivo: ");
		String nombreFichero=teclado.nextLine();
		
		File f=new File(nombreFichero);
		
		try {
			BufferedReader file = new BufferedReader (new FileReader(f));
			String caracter=file.readLine();
			while (caracter!=null) { 
				System.out.println(caracter);
				caracter=file.readLine();
			}
			file.close();
			}catch(IOException ex) {
				System.out.println("el archivo no se puede abrir");
			}
		
	}

}

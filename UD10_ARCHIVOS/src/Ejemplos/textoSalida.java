package Ejemplos;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

public class textoSalida {

	public static void main(String[] args) {
		String nombreFichero="C:\\archivos\\prueba3.txt";
		
		Scanner teclado=new Scanner (System.in);
		System.out.println("Escribe un texto: ");
		String texto=teclado.nextLine();
		
		try {
			BufferedWriter f=new BufferedWriter (new FileWriter(nombreFichero));
			f.write("ESTE ES EL TEXTO INTRODUCIDO \n"+texto);
			f.close();
		}catch (IOException e) {
			System.out.println("El fichero no se pudo abrir");
		}
		
	}
		
	

}

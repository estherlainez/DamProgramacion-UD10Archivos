package Ejercicios;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*5)En Linux disponemos del comando more, al que se le pasa un fichero
		 *  y lo muestra poco a poco: cada 24 lineas.
		 *  Implementar un programa que funcione de forma similar.
		 */
		Scanner teclado=new Scanner(System.in);
		int cadaLineas=24,contador=0;
		String ruta= "c:\\archivos\\documentoLinux.txt";
		File documentoLinux =new File(ruta);
		try {
			BufferedReader file = new BufferedReader (new FileReader(documentoLinux));

			String linea=file.readLine();
			
			while (linea!=null) {
				System.out.println(linea);				
				contador++;
				if(contador==cadaLineas) {
					System.out.println();
					System.out.println("Presione enter");
					teclado.nextLine();
					contador=0;
				}
				linea=file.readLine();
			}
			file.close();
			
			}catch(IOException ex) {
				System.out.println("el archivo no se puede abrir");
			}

	}

}

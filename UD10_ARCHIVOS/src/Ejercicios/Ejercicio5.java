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
		Scanner teclado=new Scanner(System.in);
		int cadaLineas=24,contador=0;
		String ruta= "c:\\archivos\\original.txt";
		File original =new File(ruta);
		try {
			BufferedReader file = new BufferedReader (new FileReader(original));

			String linea=file.readLine();
			
			file.readLine();
			int caracter=file.read();
			while (linea!=null) {
				System.out.print(linea);
				file.readLine();
				contador++;
				
				if(contador==cadaLineas) {
					
					
				}
				
			}
			
				
			
			
			
			}catch(IOException ex) {
				System.out.println("el archivo no se puede abrir");
			}

	}

}
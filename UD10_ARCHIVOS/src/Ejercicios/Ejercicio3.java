package Ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String ruta= "c:\\archivos\\original.txt";
		File original =new File(ruta);
		String ruta1="c:\\archivos\\copia.txt";
		File copia =new File(ruta1);
		if(original.exists()) {
			try {
				BufferedReader file = new BufferedReader (new FileReader(original));
				BufferedWriter f=new BufferedWriter (new FileWriter(copia));

				String caracter=file.readLine();
				f.write("sobreescribo: "+caracter);
				f.newLine();
				
				while (caracter!=null) { 
					System.out.println(caracter);
					caracter=file.readLine();
					f.write("sobreescribo: "+caracter);
					f.newLine();
				}
					
				
				file.close();
				f.close();
				}catch(IOException ex) {
					System.out.println("el archivo no se puede abrir");
				}
			
		}
		
		
	}

}

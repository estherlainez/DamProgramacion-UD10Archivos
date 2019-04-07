package repaso;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RepasoEjercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String caracter="";
		String texto="";
		File f=new File("c:\\archivos\\pruebaoriginal.txt");
		File f1=new File("c:\\archivos\\pruebaCopia.txt");
		if(f.exists()) {
			try {
				BufferedReader file = new BufferedReader (new FileReader(f));
				BufferedWriter bw=new BufferedWriter (new FileWriter(f1));
				caracter=file.readLine();
				bw.write("escribo "+caracter);
				bw.newLine();
				
				while (caracter!=null) { 
					System.out.println(caracter);
					caracter=file.readLine();
					bw.write("escribo "+caracter);
					bw.newLine();
				}
				file.close();
				bw.close();
				}catch(IOException ex) {
					System.out.println("el archivo no se puede abrir");
				}
			
			}
	
		
		
	}

}

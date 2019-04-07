package repaso;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class RepasoEjercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduzca la ruta del fichero");
		String ruta=teclado.nextLine();
		File f1=new File("ruta");
		
		if(f1.exists()) {
			System.out.println("El fichero ya existe");
		}else {
			try {
				f1.createNewFile();
			}catch(IOException e){
				System.out.println(e.getMessage());
			}			
		}
		
		try {
			BufferedReader file = new BufferedReader (new FileReader(f1));
		
			String caracter=file.readLine();
			while (caracter!=null) {
				System.out.print( caracter);
				caracter=file.readLine();
				
			}
		
			file.close();
		
		}catch(IOException ex) {
			System.out.println("El archivo no se puede abrir");
			
		}

		
	}

}

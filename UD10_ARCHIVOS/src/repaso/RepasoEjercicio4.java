package repaso;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class RepasoEjercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		/*
		 * 5)En Linux disponemos del comando more, al que se le pasa un fichero y lo muestra poco a poco: cada 24 lineas. 
		 * Implementar un programa que funcione de forma similar.
		 */
		String ruta="c:\\archivos\\linux.txt";
		File f4= new File(ruta);
		String linea="";
		int separacionLineas=24,contador=0;
		try {
			BufferedReader br = new BufferedReader (new FileReader(f4));
		
			linea=br.readLine();
			
			while (linea!=null) {
				System.out.print( linea);
				contador++;
				if(contador==separacionLineas) {
					System.out.println();
					System.out.println("pulse enter");
					teclado.nextLine();
					contador=0;
				}
				linea=br.readLine();
				
			}
		
			br.close();
			
		
		}catch(IOException ex) {
			System.out.println("El archivo no se puede abrir");
			
		}

	}

}

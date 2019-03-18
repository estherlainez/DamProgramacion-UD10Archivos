/*Clase que escribe l�neas completas en un fichero de texto*/

package Ficheros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class EJ_5_EscribirLinea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			File f = new File("c:\\archivos\\ej_5_escribir_linea.txt");	
			FileWriter fw = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(fw);
			
			int nLineas=10;
			
			for(int i=0;i<=nLineas;i++) {
				bw.write("Fila numero: "+i);
				bw.newLine();
			}
			bw.close();
		}catch (FileNotFoundException fn) {
			System.out.println("El fichero no se encuentra...");
		}catch (IOException io) {
			System.out.println("Error de E/S");
		}	
	}
}

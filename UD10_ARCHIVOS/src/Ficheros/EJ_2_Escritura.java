/*Clase que escribe caracteres, uno a uno, en un fichero de texto*/

package Ficheros;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EJ_2_Escritura {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File f1 = new File("c:\\archivos\\ej_2_fichero_escritura.txt");	
		
		FileWriter fichero_escribir = new FileWriter(f1);
		String cadena = "Tarazona Mo-La";
		char cadena_array[] = cadena.toCharArray();
		
		for(int i=0; i<cadena_array.length;i++) {			
			fichero_escribir.write(cadena_array[i]);
		}
		
		fichero_escribir.append("***");//Este metodo escribe al final del fichero
		
		fichero_escribir.close();
	}
}

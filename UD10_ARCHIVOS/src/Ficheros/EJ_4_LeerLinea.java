/*Clase que lee las líneas completas que contiene un fichero de texto*/

package Ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class EJ_4_LeerLinea {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File f = new File("c:\\archivos\\ej_4_leer_linea.txt");	
		
		FileReader fr = new FileReader(f);
		
		BufferedReader bf = new BufferedReader(fr);
		
		String tmp;
		
		while((tmp = bf.readLine())!=null) {
			System.out.println(tmp);
		}
		bf.close();		
	}
}
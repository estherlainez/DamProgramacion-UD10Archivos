package Ficheros;
/*Clase que escribe 5 objetos Persona en un fichero.
 * Los atributos son pasados por teclado.*/


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class EJ_3_2_Escritura_de_objetos {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File f = new File("c:\\archivos\\ej_3_personas.dat");
		f.createNewFile();
		FileOutputStream fileout = new FileOutputStream(f);
		ObjectOutputStream objectout = new ObjectOutputStream(fileout);
		
		EJ_3_1_Persona p;
		
		
		Scanner teclado = new Scanner (System.in);				
		String[] nombres = new String[5];
		int[] edades = new int[5];
				
		for (int i=0;i<5;i++) {		
			System.out.println("Introduce el nombre de la persona");			
			nombres[i]=teclado.next();
			System.out.println("Introduce la edad de la persona");
			edades[i]=teclado.nextInt();
		}		
		
		for(int i=0;i<5;i++) {
			//inicializar persona
			p = new EJ_3_1_Persona(edades[i],nombres[i]);
			//escribir un objeto en un fichero
			objectout.writeObject(p);
		}
		objectout.close();	
		teclado.close();
	}
}

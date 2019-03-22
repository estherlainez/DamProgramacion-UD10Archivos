package Ejercicios;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
public class Ejercicio6_ConCaracteres {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		// TODO Auto-generated method stub
		/*
		1)Generar numero aleatorio de palabaras que guardamos para el archivo 1
			//limite 10 palabras	
				
		2)Creamos el array de cadenas y lo rellenamos		
		
		 * for(int i=0;i<limite;i++){
		 * System.out.println("Introduzca la palabra");
		 * arrayPalabras[i]=teclado.nextLine;
		 * }
		 * 
		 3)Ordenamos el array de palabras con array.sort()
		 * 
		 4)Leer el nombre de archivo donde vamos a guardar el array
		 * 
		 5)Crear un nuevo flujo de escritura
		 * 
		 6)Escribir el array
		 * 
		 * Para  generar 2 archivos de cadenas solo tendremos que ejecutar este
		 * programa 2 veces
		 * 
		 */
				
				
				int num= (int)(Math.random()*10);
				System.out.println("el numero de palabras sera de: "+num);
				
				String arrayPalabras[]= new String [num];
				for(int i=0;i<num;i++) {
					System.out.println("Introduzca la palabra");
					arrayPalabras[i]=teclado.nextLine();
				}
				
				
				Arrays.sort(arrayPalabras);
				for(String e: arrayPalabras) {
					System.out.print(" "+e);
				}
				System.out.println();
				
				//Leer el nombre del archivo
				System.out.println("Introduzca la ruta de su archivo: ");
				String ruta= teclado.nextLine();   //ruta= c:\\archivos\\misPalabras.dat
				
				File misPalabras =new File(ruta);
				if(!misPalabras.isAbsolute()) {
					System.out.println("No es una ruta absoluta");
				}
			

				
					try {
						DataOutputStream d=new 	DataOutputStream
								(new FileOutputStream(ruta));
							for(int i=0;i<num;i++) {
								d.writeUTF(arrayPalabras[i]);

							}

						d.close();
						
					}catch(IOException ex) {
						ex.printStackTrace();
						System.out.println("el archivo no se puede escribrir el archivo");
					}

				
				

				String valor="";
				try {
					DataInputStream stream= new DataInputStream(new FileInputStream(ruta));
					while(true) {
						valor=stream.readUTF();
						System.out.print(valor+" | ");
						}
					
				}catch(EOFException e) {
					System.out.println("Fin del fichero");
				}catch(IOException e) {
					System.out.println(e.getMessage());
				}
				
				
	}

}

package Ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		//Generar numero aleatorio
		//Generar n numeros aleatorios. Usaremos un array para guardar
		//Ordenar de forma creciente
		//Leer el nombre del archivo
		//Guardar en el archivo y cerrar
		
		
		
		//generar numero alatorio
		int numAleatorio= (int)(Math.random()*100);
		System.out.println("el numero total aleatorio para la cantidad de numeros sera de: "+numAleatorio);
		
		int array[]= new int [numAleatorio];
		for(int i=0;i<numAleatorio;i++) {
			array[i]=(int)(Math.random()*100);
		}
		
		//Ordenar el array
		Arrays.sort(array);
		for(int e: array) {
			System.out.print(" "+e);
		}
		System.out.println();
		
		//Leer el nombre del archivo
		System.out.println("Introduzca la ruta de su archivo: ");
		String ruta= teclado.nextLine();   //ruta= c:\\archivos\\miArchivo.dat
		
		File miArchivo =new File(ruta);
		if(!miArchivo.isAbsolute()) {
			System.out.println("No es una ruta absoluta");
		}
	
		//Guardar en el archivo
		if(miArchivo.exists()) {
			try {
				DataOutputStream d=new 	DataOutputStream
						(new FileOutputStream(ruta));
					for(int i=0;i<numAleatorio;i++) {
						//escribo en el archivo leido por teclado el numero
						//que he introducido en el array
						d.writeInt(array[i]);
					}

				d.close();
				
			}catch(IOException ex) {
				ex.printStackTrace();//imprimimos el error
				System.out.println("el archivo no se puede escribrir el archivo");
			}

		}
		
		//ADICIONAL: Vamos a comprobar que se han guardado los datos
		//Creamos una variable para imprimir el valor del archivo binario
		int i=0;
		int valor;
		try {
			DataInputStream stream= new DataInputStream(new FileInputStream(ruta));
			while(true) {
				//Provocamos bucle infinito para leer el archivo binario
				//hasta el final
				 
				//******MODIFICAR*****//
				//array[i]=stream.readInt();   seria otra opcion
				//i++;
				valor=stream.readInt();
				System.out.print(valor+" ");
				}
			
		}catch(EOFException e) {
			System.out.println("Fin del fichero");
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}


package Ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		int numero=0,contador=1;
		String miNumero="",miCifra="";
		
		
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
			System.out.println(" "+e);
		}
		
		//Leer el nombre del archivo
		System.out.println("Introduzca la ruta de su archivo: ");
		String ruta= teclado.nextLine();   //ruta= c:\\archivos\\miArchivo.txt
		
		File miArchivo =new File(ruta);
		if(!miArchivo.isAbsolute()) {
			System.out.println("No es una ruta absoluta");
		}
	
		//Guardar en el archivo
		if(miArchivo.exists()) {
			try {
				DataOutputStream d=new 	DataOutputStream
						(new FileOutputStream("c:\\archivos\\miArchivo.dat"));
					for(int i=1;i<=numAleatorio;i++) {
						d.writeInt(array[i]);
					
					}
				
				
				d.close();
				
			}catch(IOException ex) {
				System.out.println("el archivo no se puede abrir");
			}
			
			
		}
	}
}


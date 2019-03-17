package Ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
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
		
		int numAleatorio= (int)(Math.random()*20);
		System.out.println("el numero total aleatorio para la cantidad de numeros sera de: "+numAleatorio);
		
		int array[]= new int [numAleatorio];
		
		System.out.println("Introduzca la ruta de su archivo: ");
		String ruta= teclado.nextLine();
		
		//ruta= c:\\archivos\\miArchivo.txt
		File miArchivo =new File(ruta);
		
	
		if(miArchivo.exists()) {
			try {
				BufferedWriter n=new BufferedWriter (new FileWriter(miArchivo));

				do {
					numero=(int)(Math.random()*20);
					System.out.println("el numero "+contador+" sera ---> "+numero);
					miNumero = String.valueOf(numero);
					n.write(miNumero);
					n.newLine();
					contador++;
				}while(contador<=numAleatorio);
				
				n.close();
				
			}catch(IOException ex) {
				System.out.println("el archivo no se puede abrir");
			}
			
			try {
				BufferedReader l = new BufferedReader (new FileReader(miArchivo));
				 miCifra=l.readLine();
				
				for(int j=0;j<numAleatorio;j++) {
					array[j]=Integer.parseInt(miCifra);
					int orden=j+1;
					System.out.println("array  numeros aleatorios " +orden+"-----> "+miCifra);
					miCifra=l.readLine();
					
				}
				l.close();					
			
			}
			catch(IOException ex) {
					System.out.println("el archivo no se puede abrir");
			}

			Arrays.sort(array);
			System.out.println("Numeros ordenados: ");
			System.out.println(Arrays.toString(array));

			
		}
	}
}


package Ejercicios;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero=0,miNumero=0,contador=0;
		String miCifra="";
		Scanner teclado=new Scanner(System.in);
		
		String ruta= teclado.nextLine();
		File miArchivo =new File(ruta);
		
		int i=0;
		if(miArchivo.exists()) {
			try {
				BufferedWriter n=new BufferedWriter (new FileWriter(miArchivo));

				do {
					numero=(int)(Math.random()*10);
					//miNumero = String.valueOf(numero);
					n.write(miCifra);
					n.newLine();
					contador++;
				}while(contador<=50);
				
				n.close();
				
			}catch(IOException ex) {
				System.out.println("el archivo no se puede abrir");
			}
			
			
		}
	}

}

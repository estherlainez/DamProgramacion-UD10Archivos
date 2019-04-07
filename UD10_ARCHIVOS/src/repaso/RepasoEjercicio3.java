package repaso;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Scanner;
public class RepasoEjercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int numero=0,contador=0,minimo=0,maximo=0;
		String cifra="";
		int arrayNumeros[]=new int [50];
		File f = new File("c:\\archivos\\ej_4.repaso.txt");	
		try {
			FileWriter fw = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(fw);

			do {
				numero=(int)(Math.random()*50);
				cifra = String.valueOf(numero);
				bw.write(cifra);
				bw.newLine();
				contador++;
				
			}while(contador<=50);

			bw.close();
			bw.close();
		}catch (FileNotFoundException fn) {
			System.out.println("El fichero no se encuentra...");
		}catch (IOException io) {
			System.out.println("Error de E/S");
		}
		
		try {
			BufferedReader file = new BufferedReader (new FileReader(f));
			int i=0;
			cifra=file.readLine();
			cifra=file.readLine();
				while ((cifra!=null)&&(i<50)) { 
				
					arrayNumeros[i]=Integer.parseInt(cifra);
					System.out.println("array  "+i+"-----> "+cifra);
					cifra=file.readLine();
					i++;
				}
				file.close();		
		
				String tmp;
				
				
		
		}catch(IOException ex) {
			System.out.println("El archivo no se puede abrir");
			
		}
		Arrays.sort(arrayNumeros);
	
		System.out.println("El menor sera "+arrayNumeros[0]);
		System.out.println("El mayor sera "+arrayNumeros[49]);
	}

}

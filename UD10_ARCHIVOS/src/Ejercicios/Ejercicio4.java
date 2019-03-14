package Ejercicios;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int numero=0;
		String cifra="";
		String ruta= "c:\\archivos\\numeros.txt";
		File numeros =new File(ruta);
		int arrayNumeros[]=new int [50];
		if(numeros.exists()) {
			try {
				BufferedWriter n=new BufferedWriter (new FileWriter(numeros));

				do {
					System.out.println("Escribe un numero");
					numero=(int)(Math.random()*10);
					cifra = String.valueOf(numero);
					
					n.write(cifra);
					n.newLine();
				}while(cifra.compareTo("igual")!=-1);
				
				n.close();
				
			}catch(IOException ex) {
				System.out.println("el archivo no se puede abrir");
			}
			
			
			try {
				BufferedReader nu = new BufferedReader (new FileReader(numeros));
				 cifra=nu.readLine();
				while (cifra!=null) { 
					System.out.println(cifra);
					cifra=nu.readLine();
				}
				nu.close();
				}catch(IOException ex) {
					System.out.println("el archivo no se puede abrir");
				}
			
		}
	}


}



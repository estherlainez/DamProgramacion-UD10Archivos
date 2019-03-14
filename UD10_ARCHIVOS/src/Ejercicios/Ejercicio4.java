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
		int numero=0,contador=0,maximo=0,minimo=0;
		String cifra="";
		String ruta= "c:\\archivos\\numeros.txt";
		File numeros =new File(ruta);
		int arrayNumeros[]=new int [50];
		int i=0;
		if(numeros.exists()) {
			try {
				BufferedWriter n=new BufferedWriter (new FileWriter(numeros));

				do {
					numero=(int)(Math.random()*50);
					cifra = String.valueOf(numero);
					n.write(cifra);
					n.newLine();
					contador++;
				}while(contador<=50);
				
				n.close();
				
			}catch(IOException ex) {
				System.out.println("el archivo no se puede abrir");
			}
			
			
			try {
				BufferedReader nu = new BufferedReader (new FileReader(numeros));
				 cifra=nu.readLine();
				while ((cifra!=null)&&(i<50)) { 
				
					arrayNumeros[i]=Integer.parseInt(cifra);
					System.out.println("array  "+i+"-----> "+cifra);
					cifra=nu.readLine();
					i++;
				}
				nu.close();					
			}catch(IOException ex) {
					System.out.println("el archivo no se puede abrir");
			}
			
			Arrays.sort(arrayNumeros);
			System.out.println("El valor minimo sera: "+arrayNumeros[0]);
			System.out.println("El valor maximo sera: "+arrayNumeros[49]);
			
			
		}
	}


}



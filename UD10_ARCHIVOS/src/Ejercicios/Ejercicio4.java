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
		String ruta= "c:\\archivos\\numeros.txt";
		File numeros =new File(ruta);
		int arrayNumeros[]=new int [50];
		if(numeros.exists()) {
			try {
				BufferedWriter n=new BufferedWriter (new FileWriter(numeros));

				BufferedReader num = new BufferedReader (new FileReader(numeros));
				
			
				do {
					//System.out.println("mis numeros");
					
					for(int i=0;i<arrayNumeros.length;i++) {
						arrayNumeros[i]=(int)(Math.random()*50);
						//System.out.print(arrayNumeros[i]+ "\t");
						//String cifra= num.readLine();		
						i=num.read();
						System.out.println(i);
						n.write(i);
						n.newLine();
						
						Arrays.sort(arrayNumeros);
						System.out.print(arrayNumeros[0]+ "\t"+arrayNumeros[49]);
					}
					
					//System.out.println(numero);
					//n.write(numero);
					//n.newLine();
				}while(numero!=0);
				
				n.close();
				num.close();
				
				Arrays.sort(arrayNumeros);
				Arrays.toString(arrayNumeros);
				
			}catch(IOException ex) {
				System.out.println("el archivo no se puede abrir");
			}
			
		}
	}


}



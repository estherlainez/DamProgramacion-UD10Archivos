package repaso;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class RepasoEjercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 6)Crear un programa que genere un número aleatorio de números enteros, también aleatorios y, 
		 * ordenados de forma creciente los guarde en un archivo. 
		 * El nombre del archivo debe ser introducido por teclado. 
		 */
		int numero=(int)(Math.random()*51);
		System.out.println("numero de elementos del array--> "+numero);
		int [] arrayNumeros =  new int [numero];
		for(int i=0;i<arrayNumeros.length;i++) {
			arrayNumeros[i]=(int)(Math.random()*51);
			System.out.println("numero -->"+arrayNumeros[i]);
		}
		Arrays.sort(arrayNumeros);
		String ruta="c:\\archivos\\pruebaNumeros.dat";
		File a=new File(ruta);

		try {
			DataOutputStream d=new 	DataOutputStream
					(new FileOutputStream(ruta));
			
			for(int i=0;i<numero;i++) {
				d.writeInt(arrayNumeros[i]);
			}
			
			d.close();
		}catch (IOException e) {
			System.out.println("El fichero no se pudo abrir");
		}
		
		try {
			DataInputStream diu=new 	DataInputStream
					(new FileInputStream(ruta));
			int valor;
			while(true) {
				
				//arrayNumeros[i]=stream.readInt();   seria otra opcion
				//i++;
				valor=diu.readInt();
				System.out.print(valor+" ");
				}
		}catch(EOFException e) {
			System.out.println("Fin del fichero");
		}catch (IOException e) {
			System.out.println("El fichero no se pudo abrir");
		}

	}

}

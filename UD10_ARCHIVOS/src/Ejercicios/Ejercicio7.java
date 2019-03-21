package Ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		/*comprobar si existen los ficheros
			si existen:
			Crear el archivo numeros.dat (Escritura)
			Abrir el archivo numeros1 (Lectura)
			Abrir el archivo numeros2 (Lectura)
			Leemos un valordeA1 de numeros1.dat 
			Leemos un valordeA2 de numeros2.dat
			
			mientras (no finalice un archivo)
			Si (valordeA1<valordeA2) entonces numeros=valordeA1
			   leer siguiente valordeA1
			
			  	si no
			      	numeros=valordeA2
				fin si
			fin mientras
			
			mientras numeros1.dat o numeros2.dat queden datos, escribimos en numeros los restos de informacion
	 
		 */
				int elemento1;
				int elemento2;
				DataInputStream in1=null;
				DataInputStream in2=null;
				DataOutputStream out=null;
	
				
			try {
				 in1=new 	DataInputStream
						(new FileInputStream("c:\\archivos\\numeros1.dat"));
				 in2=new 	DataInputStream
						(new FileInputStream("c:\\archivos\\numeros2.dat"));
				 out=new 	DataOutputStream
						(new FileOutputStream("c:\\archivos\\numeros.dat"));
			
			
				elemento1=in1.readInt();
				elemento2=in2.readInt();
					try {
						while(true) {
							if(elemento1<=elemento2) {
								out.writeInt(elemento1);
								elemento1=in1.readInt();
							}else{
								out.writeInt(elemento2);
								elemento2=in1.readInt();
							}
						}
						
					}catch(EOFException e) {//cuando llegamos al final del archivo y salta una excepcion
											//no sabemos cual de los dos archivos se va a cerrar
						while(in1.available()>0) {
							elemento1=in1.readInt();
							out.writeInt(elemento1);
							
						}
						
						while(in2.available()>0) {
							elemento2=in2.readInt();
							out.writeInt(elemento2);
							
						}
						//una vez aqui, hemos cerrado el archivo mas corto mediante la excepcion
					}
					
				}catch(IOException e) {
						System.out.println(e.getMessage());
				}finally {
					if(in1!=null) {
						try {
							in1.close();
						}catch(IOException ex) {
							System.out.println(ex.getMessage());
						}
					}
					
					if(in2!=null) {
						try {
							in2.close();
						}catch(IOException ex) {
							System.out.println(ex.getMessage());
						}
					}
					
					if(out!=null) {
						try {
							out.close();
						}catch(IOException ex) {
							System.out.println(ex.getMessage());
						}
					}
				}
		
	}
}
				

				
				
			
	

package Ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
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
			//si no existen, varias opciones
			//añdir codigo del ejercicio 6
			//podiamos crear metodos para crear el archivo basandonos en el ejercicio 6(no es el objetivo)
	*/
		
				int a= (int)(Math.random()*100);
				System.out.println("el numero aleatorio para el archivo 1 sera de: "+a);
				
				int array[]= new int [a];
				for(int i=0;i<a;i++) {
					array[i]=(int)(Math.random()*100);
				}
				
				Arrays.sort(array);
				for(int z: array) {
					//System.out.println(" "+z);
				}
				
				
				int b= (int)(Math.random()*100);
				System.out.println("el numero aleatorio para el archivo 2 sera de: "+b);
				
				int array2[]= new int [b];
				for(int i=0;i<b;i++) {                                                                                                 
					array2[i]=(int)(Math.random()*100);
				}
				
				Arrays.sort(array2);
				for(int s: array2) {
					//System.out.println(" "+s);
				}
		
				System.out.println("Introduzca la ruta de su primer archivo: ");
				String ruta1= teclado.nextLine();   //ruta= c:\\archivos\\numeros1.dat
				System.out.println("Introduzca la ruta de su aegundo archivo: ");
				String ruta2= teclado.nextLine();   //ruta= c:\\archivos\\numeros2.dat		
				String ruta3= "c:\\archivos\\numeros3.dat";
				
				File numeros1 =new File(ruta1);
				File numeros2 =new File(ruta2);
				File numeros3 =new File(ruta3);
			
				if(numeros1.exists()) {
					try {
						DataOutputStream d=new 	DataOutputStream
								(new FileOutputStream("c:\\archivos\\numeros1.dat"));
							for(int i=0;i<a;i++) {
								d.writeInt(array[i]);
							}

						d.close();
						
					}catch(IOException ex) {
						System.out.println("el archivo no se puede abrir");
					}
					
					if(numeros2.exists()) {
						try {
							DataOutputStream d=new 	DataOutputStream
									(new FileOutputStream("c:\\archivos\\numeros2.dat"));
								for(int i=0;i<b;i++) {
									d.writeInt(array2[i]);
								
								}
							
							
							d.close();
							
						}catch(IOException ex) {
							System.out.println("el archivo no se puede abrir");
						}
						
					}
					
					int x=0,y=0;
					try {
						DataInputStream d= new DataInputStream
								(new FileInputStream("c:\\archivos\\numeros1.dat"));
							
							while(true) {
							array[x]=d.readInt();
							x++;
							}
						
					}catch(EOFException e) {
						System.out.println("Fin");
					}catch(IOException e) {
						System.out.println(e.getMessage());
					}	
					
					try {
						DataInputStream d= new DataInputStream
								(new FileInputStream("c:\\archivos\\numeros2.dat"));
							
							while(true) {
							array2[y]=d.readInt();
							y++;
							}
						
					}catch(EOFException e) {
						System.out.println("Fin");
					}catch(IOException e) {
						System.out.println(e.getMessage());
					}	
					
					if(numeros3.exists()) {
						try {
							DataOutputStream ds =new 	DataOutputStream
									(new FileOutputStream("c:\\archivos\\numeros3.dat"));
								/*
								for(int j=0;j<a;j++) {
									ds.writeInt(array[x]);
								}
								
								
								for(int j=0;j<b;j++) {
									ds.writeInt(array2[y]);
								}
								*/
								
							ds.close();
							
						}catch(IOException ex) {
							System.out.println("el archivo no se puede abrir");
						}
					}
					
					
					
				}
		}
	}

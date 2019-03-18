package Ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
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
		int numero=0,contador=1,mayorAleatorio=0;
		String miNumero="",miCifra1="",miCifra2="";
		
		
		int numAleatorio1= (int)(Math.random()*20);
		System.out.println("el numero total de numeros del archivo 1 sera de: "+numAleatorio1);
		
		int arrayNumeros1[]=new int [numAleatorio1];
		for(int i=0;i<numAleatorio1;i++) {
			arrayNumeros1[i]=(int)(Math.random()*21);
			System.out.println("numero "+i+"  archivo 1 --->"+arrayNumeros1[i]);
		}
		System.out.println("");
		Arrays.sort(arrayNumeros1);
		System.out.println("Numeros ordenados: ");
		System.out.println(Arrays.toString(arrayNumeros1));
		
		int numAleatorio2= (int)(Math.random()*20);
		System.out.println("el numero total de numeros del archivo 2 sera de: "+numAleatorio2);
		int arrayNumeros2[]=new int [numAleatorio2];
		
		for(int i=0;i<numAleatorio2;i++) {
			arrayNumeros2[i]=(int)(Math.random()*21);
			System.out.println("numero "+i+" archivo 2 --->"+arrayNumeros2[i]);
		}
		
		Arrays.sort(arrayNumeros2);
		System.out.println(Arrays.toString(arrayNumeros2));
		
		
		String ruta1= "c:\\archivos\\numeros1.dat";
		String ruta2= "c:\\archivos\\numeros2.dat";
		String ruta3= "c:\\archivos\\numeros3.dat";
		File numeros1 =new File(ruta1);
		File numeros2 =new File(ruta2);
		File numeros3 =new File(ruta3);
		
		
				try {
					DataOutputStream d=new 	DataOutputStream
					(new FileOutputStream("c:\\archivos\\numeros1.dat"));
			
					for(int i=0;i<numAleatorio1;i++) {
						d.writeInt(arrayNumeros1[i]);
					}
					d.close();
				}catch (IOException e) {
					e.printStackTrace();
				}
			
		
				try {
					DataOutputStream d=new 	DataOutputStream
						(new FileOutputStream("c:\\archivos\\numeros2.dat"));
				
					for(int i=0;i<numAleatorio2;i++) {
						d.writeInt(arrayNumeros2[i]);
					}
					d.close();
				}catch (IOException e) {
					e.printStackTrace();
				}
			
			
		}
	}

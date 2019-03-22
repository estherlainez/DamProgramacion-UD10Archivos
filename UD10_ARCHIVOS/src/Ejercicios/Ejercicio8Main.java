package Ejercicios;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import Ejemplo_Rama_Amigos.Amigo;
public class Ejercicio8Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		
		/*1)Obtener el array de clientes
		 * si es la 1 vez que entramos al programa haremos como sabemos
		 * si es la 2 o posterior que entramos al programa lo haremos accediendo
		 * al archivo
		 * 
		 * 2)Desarrollo del programa
		 * 
		 * 3)Al finalizar el programa, en la opcion 4, debemos
		 * escribir el array en el archivo
		 * 
		 * desarrollamos pasos 1 y 3
		 * 
		 * 1) Si (archivo) existe {significa que ya hemos entrado antesal programa
		 * 		}else{
		 * 				Es la primera vez que entramos
		 * 		}
		 * 
		 * 
		 */
		
		
		int opcion=0,posicion=4,limite=10;
		
		String [] clientes= {"Esther Lainez","Marcos Moreno","Rosa Jimenez","Sara Torrellas"};
		String [] telefonos = {"666555444","654321987","678909876","654321111"};
		
		Clientes c1= new Clientes("EstherLainez","666555444");
		Clientes c2 = new Clientes ("Marcos Moreno","654321987");
		Clientes c3 = new Clientes ("Rosa Jimenez","678909876");
		Clientes c4 = new Clientes ("Sara Torrellas","654321111");
		//Tengo que crear el array obligatoriamente
		Clientes arrayClientes[]= new Clientes[10];
		//tengo que cargar datos a mi array, de donde los voy a sacar?
		/*
		 * Si existe el archivo Datos clientes significa que hemos ejecutado
		 * el programa al menos una vez.
		 * Por tanto ahi tendremos objetos que podremos cargar
		 */
		arrayClientes[0]=c1; arrayClientes[1]=c2; arrayClientes[2]=c3; arrayClientes[3]=c4;
		Clientes p = null;
		File file = new File("c:\\archivos\\DatosClientes.dat");
		int i=0;
		try {
		if(file.exists()) {
			ObjectInputStream stream= new ObjectInputStream(new FileInputStream(file));
			while(true) {
				try {
					p =(Clientes) stream.readObject();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				arrayClientes[i]=p;
				i++;
			}
		}else {
			arrayClientes[0]=new Clientes ("Paqui","666555444");
			arrayClientes[1]=new Clientes ("Pepa","666777987");
			arrayClientes[2]=new Clientes ("Maria","654321234");
		}
		
		
		}catch(IOException e) {
			System.out.println("oooohh");
		}
		
		
		
		if(file.exists()) {
			try {
				FileOutputStream archivo = new 	FileOutputStream("clientes.dat");
				ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("clientes.dat"));
			
				for (int j=0;i<4;j++) {
						Clientes cl = new Clientes(clientes[i],telefonos [i]);
							out.writeObject(cl);
				} 
			
				if (out != null){
						out.close () ;
						archivo.close();
						}
				out.close();
			
			}catch (IOException e) {
				e.printStackTrace();
			}
		
		}
		
		try {
			File fi=null;
			FileInputStream fe = null;
			ObjectInputStream ois = null;
			try {
				file = new File("clientes.dat");
				if (file.exists()){
					fe = new FileInputStream(file);
					ois = new ObjectInputStream(fe);
				while(true) {
					
					Clientes cl = null;
					cl = (Clientes)ois.readObject();
					cl.print();
					System.out.println("");
					}
				}
			}catch (EOFException eof) {
				System.out.println(" --------------------------");
			}catch (FileNotFoundException fnf) {
				System.err.println("Fichero no encontrado " + fnf);
			}catch(IOException e){
				System.err.println("Se ha producido una IOException");
					e .printStackTrace();
			}catch (Throwable e) {
				System.err.println("Error de programa: " + e);
					e .printStackTrace() ;
			}finally{
				if (ois != 	null) {
					ois.close ();
					fe.close () ;
				}
			}
		}catch(IOException e){
			e .printStackTrace();
		}
		
		do {
			System.out.println("MENU");
			System.out.println("1.A�adir nuevo cliente");
			System.out.println("2.Modificar datos");
			System.out.println("3.Dar de baja un cliente");
			System.out.println("4.Listar los clientes");
			System.out.println("5.Salir");
			System.out.println("Elija la opcion que desee realizar");
			opcion=teclado.nextInt();
			
			switch(opcion) {
			case 1:
				System.out.println("A�adir nuevo cliente");
				
				
				System.out.println(arrayClientes[posicion].toString());
				break;
			case 2:
				System.out.println("Modificar datos");
				
				break;
			case 3:
				System.out.println("Dar de baja un cliente");
				
				break;
			case 4:
				System.out.println("Listar los clientes");
			
				
				break;
			case 5:
				System.out.println("Hasta pronto!");
				break;
			
			}
		
		}while(opcion!=5);
	}

}

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

	public static void main(String[] args) throws ClassNotFoundException {
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
		
		
		int opcion=0,posicion=0,limite=10;
		
	
		//Tengo que crear el array obligatoriamente
		Clientes arrayClientes[]= new Clientes[10];
		//tengo que cargar datos a mi array, de donde los voy a sacar?
		/*
		 * Si existe el archivo Datos clientes significa que hemos ejecutado
		 * el programa al menos una vez.
		 * Por tanto ahi tendremos objetos que podremos cargar
		 */
		
		Clientes p = null;
		File file = new File("c:\\archivos\\DatosClientes.dat");
		int i=0;
		
		if(file.exists()) {
			try {
				ObjectInputStream stream= new ObjectInputStream(new FileInputStream(file));
				while(true) {
			
					p =(Clientes) stream.readObject();			
					arrayClientes[posicion]=p;
					posicion++;

				}
			}catch(EOFException e) {
				System.out.println("Fin del fichero. Hemos recuperado "+posicion);
			}catch(IOException ex) {
				System.out.println("Error");
		
			}
		}else {
			arrayClientes[0]=new Clientes ("Paqui","666555444");
			posicion++;
			arrayClientes[1]=new Clientes ("Pepa","666777987");
			posicion++;
			arrayClientes[2]=new Clientes ("Maria","654321234");
			posicion++;
			arrayClientes[3]=new Clientes ("Pilar","609878009");
			posicion++;
		}
	
		
		do {
			System.out.println("MENU");
			System.out.println("1.Añadir nuevo cliente");
			System.out.println("2.Modificar datos");
			System.out.println("3.Dar de baja un cliente");
			System.out.println("4.Listar los clientes");
			System.out.println("5.Salir");
			System.out.println("Elija la opcion que desee realizar");
			opcion=teclado.nextInt();
			
			switch(opcion) {
			case 1:{
				System.out.println("¿Que posicion de cliente va a añadir?");
				int num=teclado.nextInt();
				teclado.nextLine();
				System.out.println("Introduzca nombre:");
				String nombre=teclado.nextLine();
				System.out.println("Introduzca telefono:");
				String telefono=teclado.nextLine();
				
				
				arrayClientes[posicion]=new Clientes(nombre,telefono);
				posicion++;
		
				break;
			}
			case 2:
				System.out.println("Modificar datos");
				
				break;
			case 3:
				System.out.println("Dar de baja un cliente");
				System.out.println("¿Que cliente va a quitar? Introduzca posicion:");
				posicion=teclado.nextInt();
				if(posicion>0) {
					posicion--;
				}
				break;
			case 4:
				System.out.println("Listar los clientes");
				for (i=0;i<posicion;i++) {
					System.out.println(arrayClientes[i].toString());
				}
				
				break;
			case 5:
				
					try {
					
						ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("c:\\archivos\\DatosClientes.dat"));
						
						for (int j=0;j<posicion;j++) {	
								out.writeObject(arrayClientes[j]);
								System.out.println("posicion de escritura"+j);
						} 
					
						
						
						if (out != null){
								out.close () ;	
						}
					
					
					}catch (IOException e) {
						e.printStackTrace();
					}
				
				
				
				System.out.println("Hasta pronto!");
				System.out.println("buscando el error");
				break;
			
			}
		
		}while(opcion!=5);
	}

}

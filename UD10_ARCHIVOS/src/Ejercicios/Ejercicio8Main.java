package Ejercicios;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;
public class Ejercicio8Main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		int opcion=0;
		String [] Clientes= {"Esther Lainez","Marcos Moreno","Rosa Jimenez","Pablo Berges","Lucas Jimenez"};
		String [] telefonos = {"666555444","654321987","678909876","665544332","675432123"};

		//Clientes arrayClientes[]= new Clientes[5];
		FileOutputStream archivo = new 	FileOutputStream("c:\\archivos\\telefonos.dat");
		try {
			ObjectOutputStream c = new ObjectOutputStream(new FileOutputStream("telefonos.dat"));
				
		
			
			c.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		try {
			DataInputStream d= new DataInputStream
					(new FileInputStream("c:\\archivos\\telefonos.dat"));
				
				
			d.close();
		}catch(IOException e) {
			e.printStackTrace();
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
			case 1:
				System.out.println("Añadir nuevo cliente");
				//arrayClientes[5].añadirCliente("Carlos Perez", "676878898");
				//System.out.println(arrayClientes.toString());
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

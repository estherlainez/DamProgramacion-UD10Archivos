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
		int opcion=0,limite=10;
		
		String [] clientes= {"Esther Lainez","Marcos Moreno","Rosa Jimenez"};
		String [] telefonos = {"666555444","654321987","678909876"};
		
		Clientes c1= new Clientes("EstherLainez","666555444");
		Clientes c2 = new Clientes ("Marcos Moreno","654321987");
		Clientes c3 = new Clientes ("Rosa Jimenez","678909876");
		Clientes arrayClientes[]= new Clientes[limite];
		arrayClientes[0]=c1;arrayClientes[1]=c2;arrayClientes[2]=c3;
		
		
		FileOutputStream archivo = new 	FileOutputStream("clientes.dat");
		try {
			ObjectOutputStream c = new ObjectOutputStream(new FileOutputStream("clientes.dat"));
			c.writeObject(clientes);
			c.writeObject(telefonos);
		/*
			for(int i=0;i<limite;i++) {
				c.writeUTF(clientes[i]);
				c.writeUTF(telefonos[i]);
			}
			*/
			c.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		try {
			DataInputStream d= new DataInputStream
					(new FileInputStream("c:\\archivos\\clientes.dat"));
				
				
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

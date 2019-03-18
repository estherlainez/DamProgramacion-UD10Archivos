package Ejemplos;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EjemploBinario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String [] alumnos= {"Andres","Pedro","Juan"};
		double[]notas= {5.32,1.23,9.87};
		try {
			//crear el flujo de datos a nivel de byte
			DataOutputStream d=new 	DataOutputStream
				(new FileOutputStream("c:\\archivos\\notas.dat"));
		
			for(int i=0;i<3;i++) {
				d.writeUTF(alumnos[i]);
				d.writeDouble(notas[i]);
			}
			d.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	//<<<<<AQUI PODEMOS HACER TODAS OPERACIONES QUE QUERAMOS>>>>>>
		
		String []alumnosLeidos= new String[3];
		double[]notasLeidas=new double[3];
		int i=0;
		try {
			DataInputStream d= new DataInputStream
					(new FileInputStream("c:\\archivos\\notas.dat"));
				
				while(true) {
				alumnosLeidos[i]=d.readUTF();
				notasLeidas[i]=d.readDouble();
				i++;
				}
			
		}catch(EOFException e) {
			System.out.println("Fin del fichero");
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		for(String e:alumnosLeidos) {
			System.out.println(e);
		}
		
		for(double e:notasLeidas) {
			System.out.println(e);
		}
		
	}

}

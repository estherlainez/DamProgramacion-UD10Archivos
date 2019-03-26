package Ficheros;
/*Clase que lee los objetos Persona que contiene un fichero.*/



import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EJ_3_3_Lectura_de_objetos {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		// TODO Auto-generated method stub
		File f = new File("c:\\archivos\\ej_3_personas.dat");
		
		FileInputStream filein = new FileInputStream(f);
		ObjectInputStream objectin = new ObjectInputStream(filein);
		
		EJ_3_1_Persona p;
		
		try {
			while(true){
					p=(EJ_3_1_Persona)objectin.readObject();
					System.out.println("Nombre: "+p.getNombre()+", Edad: "+p.getEdad());
			}
		}catch (EOFException eo) {
			System.out.println("");
		}	
		objectin.close();
	}
}
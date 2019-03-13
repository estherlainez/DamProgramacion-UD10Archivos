package Ejercicios;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String nombreFichero="c:\\archivos\\datos.txt";
		String nombre="";
		int edad=0;
		
		
		File f=new File(nombreFichero);
		
		try {
			BufferedReader n = new BufferedReader (new FileReader(f));
			String caracter=n.readLine();
			while (caracter!=null) { 
				System.out.println(caracter);
				caracter=n.readLine();
			}
			nombre=teclado.nextLine();
			edad=teclado.nextInt();
			n.close();
			}catch(IOException ex) {
				System.out.println("el archivo no se puede abrir"+ex.getMessage());
			}
	}

}

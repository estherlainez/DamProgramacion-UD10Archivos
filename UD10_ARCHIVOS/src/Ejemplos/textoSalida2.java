package Ejemplos;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
public class textoSalida2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombreFichero="C:\\archivos\\prueba3.txt";
		String texto="";
		Scanner teclado=new Scanner (System.in);
			
		
		try {
			BufferedWriter f=new BufferedWriter (new FileWriter(nombreFichero));
			
			do {
				System.out.println("Escribe un texto");
				texto=teclado.nextLine();
				//f.newLine();
				f.write(texto);
			}while(texto.compareTo("para")!=0);
			
			f.close();
		}catch (IOException e) {
			System.out.println("El fichero no se pudo abrir");
		}
	}

}

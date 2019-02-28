package Ejemplos;
import java.util.Scanner;
import java.io.File;

public class UsoclaseFile {
//muestra informacion acerca del archivo especificado por el ususario
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado =new Scanner(System.in);
		System.out.println("EScriba el nombre de archivo o directorio"+
		String ruta=teclado.nextLine();

	}
	
	class DemostracionFile {
		public void analizarRuta(String ruta) {
			File nombre = new File (ruta);
			if (nombre.exists()) {//si existe el nombre, muestra informacion del archivo o directorio
				System.out.println("Existe "+nombre.getName());
				System.out.println("Es un archivo "+nombre.isFile());
				System.out.println("Es un directorio "+nombre.isDirectory());
				System.out.println("Ruta absoluta "+nombre.isAbsolute());
				System.out.println("Ultima modificacion "+nombre.lastModified());
				System.out.println("Tamaño "+nombre.length());
				System.out.println("Ruta "+nombre.getPath());
				System.out.println("Ruta absoluta"+nombre.getAbsolutePath());
				System.out.println("Padre "+nombre.getParent());
			}
		}
	}

}

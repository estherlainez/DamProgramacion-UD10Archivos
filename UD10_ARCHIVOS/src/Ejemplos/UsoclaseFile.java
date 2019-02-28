package Ejemplos;
import java.util.Scanner;
import java.io.File;

public class UsoclaseFile {

		public static void main(String[] args) {
			Scanner teclado = new Scanner( System.in );
			 System.out.print( "Escriba aqui el nombre del archivo o directorio: " );
			  String ruta=teclado.nextLine();
			  File nombre = new File( ruta );
			 	if (nombre.exists()) {// si existe el nombre, muestra información sobre él
			 		// muestra información del archivo (o directorio)
			 		System.out.println("Existe "+nombre.getName());	
			 		System.out.println("Es un archivo: "+nombre.isFile()) ;	
			 		System.out.println("es un directorio: "+nombre.isDirectory()); 
			 		System.out.println("Ruta absoluta: "+nombre.isAbsolute());
			 		System.out.println("Ultima modificacion: "+	 nombre.lastModified());
			 		System.out.println( "Tamanio: "+ nombre.length());
			 		System.out.println( "Ruta: "+ nombre.getPath());
			 	    System.out.println(  "Ruta absoluta: "+	 nombre.getAbsolutePath()); 
			 	    System.out.println( "Padre: "+ nombre.getParent());
		
		 
			 	    // muestra el listado del directorio
			 	    if ( nombre.isDirectory()){
			 	    		String directorio[] = nombre.list();
			 	    		System.out.println( "\n\nContenido del directorio:\n" );
			 	    		for ( String nombreDirectorio : directorio )
			 	    			System.out.printf( "%s\n", nombreDirectorio );
			 	    } // fin de else
			 	 // fin de if exterior
			 	}else{ 
			 		// no es archivo o directorio, muestra mensaje de error
		  			System.out.printf( "%s %s", ruta, "no existe." );
			 	} // fin de else
		
		} // fin de main
		 // fin de la clase PruebaDemostracionFile
}

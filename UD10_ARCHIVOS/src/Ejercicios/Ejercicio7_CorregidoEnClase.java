package Ejercicios;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
public class Ejercicio7_CorregidoEnClase {

	public static void main(String[] args) {

        // TODO Apéndice de método generado automáticamente
        /*
        * 7) Disponemos de dos ficheros binarios que guardan números enteros ordenados de forma
         *  creciente (numeros1.dat y numeros2.dat) puedes apoyarte en el programa anterior para
         *  generarlos. Fusionar ambos ficheros en un tercero (números.dat) de forma que todos los datos sigan
         *  ordenados.
         */

/* 1) comprobar que existen los ficheros

*

* 2)si existen:

*

*           2.1) Crear el archivos numeros.dat (Escritura)

*           2.2) Abrir el archivo numeros1.dat (Lectura)

*           2.3) Abrir el archivo numeros2.dat (Lectura)

*          

*           2.4) leemos un valordeA1 de numeros1.dat

*           2.5) leemos un valordeA2 de numeros2.dat

*           2.6) mientras (no finalice un archivo)

        *           2.7) Si (valordeA1<valordeA2) entonces

        *                         2.7.1) numeros=valordeA1

        *                         2.7.2) leer siguiente valordeA1

        *                        

         *                  sino

        *                         2.7.1) numeros=valordeA2

        *                         2.7.2) leer siguiente valordeA2

        *                  fin-si

        *      fin-mientras

        *

         * 2.8) mientras (numeros1.dat o numeros2.dat queden datos){
         * 
         * se comprueba con el metodo available}

        *  escribir en numeros.dat los restos

*/


		 //    2.1) Crear el archivos numeros.dat (Escritura)
		
		 // * 2.2) Abrir el archivo numeros1.dat (Lectura)
		
		 // * 2.3) Abrir el archivo numeros2.dat (Lectura)

		int elemento1;
		
		int elemento2;

		DataInputStream in1=null;
		
		DataInputStream in2=null;
		
		DataOutputStream out=null;

		try {

			in1= new DataInputStream (new FileInputStream("C:\\archivos\\numeros1.dat"));
			
			in2= new DataInputStream (new FileInputStream("C:\\archivos\\numeros2.dat"));
			
			out=new DataOutputStream (new FileOutputStream ("c:\\archivos\\numeros.dat"));

		//2.4) y 2.5) leemos un valordeA1 de numeros1.dat, para meter el primer valor del		
		//archvio en la "cajita" de un entero, para poder comparar cual es el mayor		
		//y asi, poder mantener el orden en la fusión de los 2 archivos

			elemento1=in1.readInt();
			
			elemento2=in2.readInt();

			try {
				
               while (true) { //provocamos un bucle infinito hasta que acabe uno de los archivos

            	   if (elemento1<=elemento2) { //escribimos en el archivo de salida el elemento

                                              //menor, ya sea el que proviene de numeros1.dat o

                                                // el que proviene de numeros2.dat

                             out.writeInt(elemento1);

                             elemento1=in1.readInt(); //una vez escrito en el archivo numeros.dat, leemos el siguiente elemento

                                                       //del archivo de entrada correspondiente

            	   }else {

                             out.writeInt(elemento2);

                             elemento2=in1.readInt();

            	   }

               }

			}catch (EOFException e) {//cuando llegamos al final de archivo, y salta una excepcion

                                     //no sabemos cual de los dos archivos se va a cerrar (porque

                                     //ha llegado al final, y en consecuencia, no sabemos cual de los dos archivos

                                     //aun tiene datos que se deben añadir al final del archivo numeros.dat

                                           

				while (in1.available()>0) { //usamos este while para indicar que, mientras queden

                                            //datos en in1, debe leerlos y escribirlos en el

                                            //archivo resultado.

						elemento1=in1.readInt();

						out.writeInt(elemento1);

				}

              

				while (in2.available()>0) { //Idem al caso anterior

						elemento2=in2.readInt();

						out.writeInt(elemento2);

				}

				//una vez aqui, hemos cerrado el archivo más corto mediante la excepcion.

			}



		}catch (IOException e) {//vamos a cerrar ahora los archvios que queden abiertos,

	        //como no sabemos que nos queda abierto, tenemos que ir comprobando uno a uno
	
	        //lo que queda abierto e ir cerrando.

       
			
			System.out.println(e.getMessage());

		}finally { //usamos la estructura opcional finally para que, una vez

        //hecho todo el proceso anterior, si o si nos haga esto

			if (in1 != null) {

				try {

					in1.close();

				}catch (IOException ex) {

					System.out.println(ex.getMessage());

				}

			}

       

			if (in2 != null) {

				try {

					in2.close();

				}catch (IOException ex) {

						System.out.println(ex.getMessage());

				}

			}

       

       

			if (out != null) {

				try {

						out.close();

				}catch (IOException ex) {

						System.out.println(ex.getMessage());

				}

			}

		}

       



		int valor;

		try {

			DataInputStream stream= new DataInputStream (new FileInputStream("C:\\archivos\\numeros.dat"));

			DataInputStream in= new DataInputStream (new FileInputStream("C:\\archivos\\numeros1.dat"));

			DataInputStream in3= new DataInputStream (new FileInputStream("C:\\archivos\\numeros2.dat"));

			System.out.print("\n");

			while (true) {

               //Provocamos bucle infinito para leer el archvio binario

               //hasta el final

               //valor=stream.readInt();

				//System.out.print(valor+" \n");

               //valor=in.readInt();

               //System.out.print(valor+" \n");

					valor=in3.readInt();

					System.out.print(valor+" \n");
               
              

			}

		}catch (EOFException e) {

				System.out.println("Fin del fichero");



		}catch (IOException e) {

			System.out.println(e.getMessage());



		}

       

	}    

 }

package Ejercicios;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejercicio7_ConCaracteres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String elemento1;
		String elemento2;

		DataInputStream in1=null;
		DataInputStream in2=null;
		DataOutputStream out=null;

		try {

			in1= new DataInputStream
                      (new FileInputStream("C:\\archivos\\misPalabras1.dat"));

			in2= new DataInputStream
                      (new FileInputStream("C:\\archivos\\misPalabras2.dat"));

			out=new DataOutputStream
                      (new FileOutputStream ("c:\\archivos\\palabras.dat"));

	

			elemento1=in1.readUTF();
			elemento2=in2.readUTF();

			try {
				
               while (true) { 
            	   if (!elemento1.equals(elemento2)) { 
                             out.writeUTF(elemento1);
                             elemento1=in1.readUTF(); 
            	   }else {
                             out.writeUTF(elemento2);
                             elemento2=in1.readUTF();
            	   }

               }

			}catch (EOFException e) {
                                           
				while (in1.available()>0) { 					
						elemento1=in1.readUTF();
						out.writeUTF(elemento1);
				}


				while (in2.available()>0) { 
						elemento2=in2.readUTF();
						out.writeUTF(elemento2);
				}

			}

		}catch (IOException e) {
	
			System.out.println(e.getMessage());

		}finally { 

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

       
		String valor;

		try {
			DataInputStream stream= new DataInputStream (new FileInputStream("C:\\archivos\\misPalabras1.dat"));
			DataInputStream in= new DataInputStream (new FileInputStream("C:\\archivos\\misPalabras2.dat"));
			DataInputStream in3= new DataInputStream (new FileInputStream("C:\\archivos\\palabras.dat"));

			System.out.print("\n");

			while (true) {
					valor=in3.readUTF();
					System.out.print(valor+" \n");

			}
		}catch (EOFException e) {
				System.out.println("Fin del fichero");

		}catch (IOException e) {

			System.out.println(e.getMessage());
		}
      
	}

}

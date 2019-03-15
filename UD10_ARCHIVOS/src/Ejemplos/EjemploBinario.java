package Ejemplos;

import java.io.DataOutputStream;
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
	}

}

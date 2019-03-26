package Ficheros;
/*Clase que crea un objeto Persona con sus respectivos atributos, contructor y métodos. 
 * Implementamos Serializable para que el objeto pueda ser leido y escrito en un fichero*/


import java.io.Serializable;

public class EJ_3_1_Persona implements Serializable{
	
	private int edad;
	private String nombre;
	
	public EJ_3_1_Persona(int e, String n) {
		edad=e;
		nombre=n;
	}
	
	public String getNombre() {
		return nombre; 
	}
	public int getEdad() {
		return edad; 
	}
	
	public void setNombre(String n) {
		nombre=n; 
	}
	public void setEdad(int x) {
		edad=x; 
	}
}

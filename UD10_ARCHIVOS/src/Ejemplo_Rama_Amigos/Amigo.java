package Ejemplo_Rama_Amigos;

public class Amigo implements java.io.Serializable{
	protected String nombre;
	protected long telefono;
	public Amigo(String n, long t){
		nombre = n;
		telefono = t;
}
	
	public void print(){
		System.out.println(nombre + " -> " + telefono);
	}
}
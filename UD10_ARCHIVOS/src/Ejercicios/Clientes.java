package Ejercicios;

public class Clientes implements java.io.Serializable{

	int numClientes;
	int limite=20;
	Clientes clientes[];
	String nombre;
	String telefono;
	int id;
	private static int identificador;
	
	Clientes(String n,String tel){
		this.nombre=n;
		this.telefono=tel;
		this.id=identificador;
		identificador ++;
	}
	
	public void añadirCliente(String n,String tel) {
		if(numClientes<limite) {
			Clientes c = new Clientes(n,tel);
			clientes[numClientes]=c;
			numClientes++;
		}else {
			System.out.println("no se puede añadir nuevo cliente");
		}
	}
	
	public boolean bajaCliente() {
		boolean baja=false;
		if(numClientes>0) {
			numClientes=numClientes-1;
			baja=true;
		}else {
			System.out.println("no se puede dar de baja dicho cliente");
		}
		
		
		return baja;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static int getIdentificador() {
		return identificador;
	}

	public static void setIdentificador(int identificador) {
		Clientes.identificador = identificador;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", telefono=" + telefono + ", id=" + id + "]";
	}
}

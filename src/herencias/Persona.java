package herencias;

public class Persona {

	private String nombre;

	
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + "]";
	}
	
	
	
	
	
}

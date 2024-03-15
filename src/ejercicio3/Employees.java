package ejercicio3;

public class Employees {
	private String nombre;
	private int años;
	
	public Employees(String nombre, int an) {
		this.setNombre(nombre);
		this.setAños(an);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAños() {
		return años;
	}

	public void setAños(int años) {
		this.años = años;
	}
}

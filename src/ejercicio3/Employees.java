package ejercicio3;

public class Employees {
	private String nombre;
	private int años;
	
	/**
	 * 
	 * @param nombre NOMBRE DEL EMPLEADO
	 * @param an AÑOS QUE LLEVA EN LA EMPRESA
	 */
	public Employees(String nombre, int an) {
		this.setNombre(nombre);
		this.setAños(an);
	}

	/**
	 * 
	 * @return NOMBRE DEL EMPLEADO
	 */
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * 
	 * @return AÑOS QUE LLEVA EL EMPLEADO EN LA EMPRESA
	 */
	public int getAños() {
		return años;
	}

	public void setAños(int años) {
		this.años = años;
	}
}

package ejercicio3;

import java.util.ArrayList;

public class EmployeeManager {
	/**
	 * @param empleados LISTA DE EMPLEADOS DINAMICA
	 */
	private ArrayList<Employees> empleados = new ArrayList<Employees>();
	
	/**
	 * 
	 * @param name NOMBRE DEL EMPLEADO
	 * @param years AÑOS QUE LLEVA EL EMPLEADO EN LA EMPRESA
	 * @return DEVUELVE QUE EL USUARIO SE HALLA AÑADIDO CORRECTAMENTE
	 * @version 1.0
	 * @author IVÁN NARANJO MARÍN
	 */
	public void addEmployee(String name,int years){ 
			Employees emp1 = new Employees(name, years);
			System.out.println(name+" Added to the system."); 
	} 
	
	/**
	 * @return LISTA DE LOS EMPLEADOS CON SU NOMBRE Y LOS AÑOS QUE LLEVA EN LA EMPRESA
	 * @version 1.0
	 * @author IVÁN NARANJO MARÍN
	 */
	public void printEmployees(){ 
		System.out.println("LISTA DE EMPLEADOS: ");
		for (Employees e : empleados) {
			System.out.println("Nombre: "+e.getNombre()+"   Años en la empresa: "+e.getAños());
		}
	} 
	
	public static void main(String[]args){ 
		EmployeeManager manager = new EmployeeManager();
		manager.addEmployee("JohnDoe",5);
		manager.addEmployee("JaneSmith",2);
		manager.printEmployees(); 
	} 
}


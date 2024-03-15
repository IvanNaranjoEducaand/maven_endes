package ejercicio3;

import java.util.ArrayList;

public class EmployeeManager {
	private ArrayList<Employees> empleados = new ArrayList<Employees>();
	private int numberOfEmployees=0; 
	
	public void addEmployee(String name,int years){ 
			Employees emp1 = new Employees(name, years);
			numberOfEmployees++; 
			System.out.println(name+"added to the system."); 
	} 
	
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


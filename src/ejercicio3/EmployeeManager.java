package ejercicio3;

import java.util.ArrayList;

public class EmployeeManager {
	ArrayList<Employees> empleados = new ArrayList<Employees>();
	int numberOfEmployees=0; 
	
	public void addEmployee(String name,int years){ 
			Employees emp1 = new Employees(name, years);
			numberOfEmployees++; 
			System.out.println(name+"added to the system."); 
	} 
	
	public void printEmployees(){ 
		System.out.println("Listofemployees:"); 
		for(int i=0;i<numberOfEmployees;i++){ 
			System.out.println(employeeNames[i]+",Yearsincompany:"+ employeeYears[i]);
		} 
	} 
	
	public static void main(String[]args){ 
		EmployeeManager manager = new EmployeeManager();
		manager.addEmployee("JohnDoe",5);
		manager.addEmployee("JaneSmith",2);
		manager.printEmployees(); 
	} 
}


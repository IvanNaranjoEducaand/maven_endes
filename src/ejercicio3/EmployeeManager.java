package ejercicio3;

public class EmployeeManager {
	String[] employeeNames=new String[10]; 
	int[] employeeYears=new int[10]; 
	int numberOfEmployees=0; 
	
	public void addEmployee(String name,int years){ 
		if(numberOfEmployees<10){ 
			employeeNames[numberOfEmployees]=name; 
			employeeYears[numberOfEmployees]=years; 
			numberOfEmployees++; 
			System.out.println(name+"addedtothesystem."); 
		}else{ 
			System.out.println("Cannotaddmoreemployees,systemisfull."); 
		} 
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


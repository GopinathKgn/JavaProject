package Org.hcl;

public class EmployeeDetails {
private void employeeName() {
	
	System.out.println("Employee Name: Ram");
	System.out.println("Company Name : HCL");
}
private void employeeId() {
	
	System.out.println("Employee ID: 2880");
	System.out.println("Company ID: 1138");
}
	public static void main(String[] args) {
		
		EmployeeDetails e = new EmployeeDetails();
		e.employeeName();
		e.employeeId();
	}
	
	
}

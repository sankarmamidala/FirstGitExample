package com.sankar;

public class EmployeeBusiness {

	
	public static double caluclateYearlySalary(EmployeeDetails employeedetails)
	{
		double yearlySalary = 0;
		yearlySalary=employeedetails.getMonthlySalary()*12;
		return yearlySalary;
		
	}
	public static double calculateAppraisal(EmployeeDetails employeeDetails) {
	      double appraisal = 0;
			
	      if(employeeDetails.getMonthlySalary() < 10000){
	         appraisal = 500;
	      }else{
	         appraisal = 1000;
	      }
			
	      return appraisal;
	   }
	
	public static void main(String[] args) {
		EmployeeDetails emp = new EmployeeDetails();
		emp.setAge(12);
		emp.setMonthlySalary(8000);
		emp.setName("sankar");
		
		System.out.println(caluclateYearlySalary(emp));
		System.out.println(calculateAppraisal(emp));
		
		
	}
	
}

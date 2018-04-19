package com.sankar.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.sankar.EmployeeBusiness;
import com.sankar.EmployeeDetails;

public class TestEmployeeDetails {
   EmployeeDetails employee = new EmployeeDetails();

   //test to check appraisal
   @Test
   public void testCalculateAppriasal() {
      employee.setName("Rajeev");
      employee.setAge(25);
      employee.setMonthlySalary(8000);
		
      double appraisal = EmployeeBusiness.calculateAppraisal(employee);
      assertEquals(500, appraisal, 0.0);
   }

   // test to check yearly salary
   @Test
   public void testCalculateYearlySalary() {
      employee.setName("Rajeev");
      employee.setAge(25);
      employee.setMonthlySalary(8000);
		
      double salary = EmployeeBusiness.caluclateYearlySalary(employee);
      assertEquals(96000, salary, 0.0);
   }
}
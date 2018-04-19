package com.core;


class Encapuslation
{
   public static void main(String args[])
   {
      System.out.println("Starting EmployeeCount...");
      EmployeeCount employeeCount = new EmployeeCount ();
      employeeCount. setNoOfEmployees (12003);
      System.out.println("NoOfEmployees = " + employeeCount. getNoOfEmployees ());
    }
}

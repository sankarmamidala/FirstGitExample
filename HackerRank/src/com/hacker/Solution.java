package com.hacker;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter MealCost:");
        double mealCost = scan.nextDouble(); // original meal price
        System.out.println("Enter tipCost:");
        double tipPercent = scan.nextInt(); // tip percentage
        tipPercent= mealCost* tipPercent/100;
        System.out.println("Enter taxCost:");
        double taxPercent = scan.nextInt(); // tax percentage
        taxPercent= mealCost* taxPercent/100;
        
      
        // Write your calculation code here.
      
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) ((int) (int)mealCost+tipPercent+taxPercent);
       System.out.println(Math.round(totalCost));
scan.close();        
	}

}

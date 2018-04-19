package com.collectionPr272;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.overloriding.Main;

public class Employee
{
	public static int input() throws FileNotFoundException
	{
		Scanner sc=new Scanner(new FileInputStream("E:\\sankar.txt"));
		int countwords=0;
		while(sc.hasNextLine())
		{
			String next = sc.next();
			countwords++;
		}
		return countwords;
		
	}
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Number of Words: " + input());
	}
}
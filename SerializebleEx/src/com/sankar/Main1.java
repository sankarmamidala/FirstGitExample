package com.sankar;

import java.awt.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Main1 {

	public static void main(String[] args) throws ClassNotFoundException {
		 try {
	         File file = new File("f.txt");
	         if (!file.exists()) {
	            Student user = new Student(100,"sankar",28);
	            System.out.println("success");
	          	
	         }
	         else{
	            FileInputStream fis = new FileInputStream(file);
	            ObjectInputStream ois = new ObjectInputStream(fis);
	            Object s = (Student)ois.readObject();
	            System.out.println("failure");
	            ois.close();
	         }
	      } catch (IOException e) {
	         e.printStackTrace();
	      } 
	   }
	}


package com.sankar;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		Student st=new Student(100,"sankar",28);
		try {
			/*FileOutputStream fout=new FileOutputStream("f.txt");
			ObjectOutputStream out=new ObjectOutputStream(fout);
			out.writeObject(st);
			out.flush();
			System.out.println("success");
			out.close();*/
			FileInputStream fin=new FileInputStream("f.txt"); 
			ObjectInputStream in=new ObjectInputStream(fin);  
			  Student s=(Student)in.readObject();  
			  System.out.println(s.id+" "+s.name+" "+s.age);  
			  
			  in.close();  
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

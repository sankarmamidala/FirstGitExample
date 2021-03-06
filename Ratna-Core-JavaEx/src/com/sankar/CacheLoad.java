package com.sankar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class CacheLoad {
	static Map<String,Student> studentMap= new HashMap<String,Student>();
	static ArrayList<Student> listStudents;
	public static void main(String[] args) {

		 listStudents=	prepareStudentList();
		preparehashMap(listStudents);

	}

	private static void preparehashMap(ArrayList<Student> listStudents) {
		for (Student student : listStudents) {
			studentMap.put(student.getId(), student);
		}

	}

	private static ArrayList<Student> prepareStudentList() {
		ArrayList<Student> stdList= new ArrayList<Student>();
		BufferedReader br;
		String strLine=null;;
		try {
			//File f= new File("abc1.txt");
			br = new BufferedReader(new FileReader(new File("C://Users//sanka//CoreConcepts//Ratna-Core-JavaEx//src//abc.txt")));
			while((strLine=br.readLine())!=null){
				String[] split = strLine.split(",");
				stdList.add(prepareStudent(split));

			}
				

		} catch (IOException e) {
			System.out.println(e);
		}
		
		return stdList;
	}

	private static Student prepareStudent(String[] split) {
		Student st= new Student(split[0],split[1],new Date());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return st;
	}

	public  Student search(String id){
		return 	studentMap.get(studentMap);
	}


	public static void pushStudent(Student st){
		if(studentMap.size()==0){
			main(null);
		}

		if(studentMap.get(st.getId())==null){
			if(studentMap.size()<20)
			studentMap.put(st.getId(), st);
			else{
			//Student student = Collections.min(listStudents, new StudentComparator());
				Student student = listStudents.get(0);
				studentMap.remove(student.getId());
				studentMap.put(st.getId(), st);
			}
		}
		else{
			Student student = studentMap.get(st.getId());
			student.setName(st.getName());
			student.setD(new Date());
			studentMap.put(st.getId(), student);
		}
	}

	

	
	
	
	
}



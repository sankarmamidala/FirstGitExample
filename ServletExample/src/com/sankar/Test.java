package com.sankar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Test{
	
	public static void main(String[] args) {
		Test t = new Test();
		ArrayList<Model> retriveDate = t.retriveDate();
		System.out.println(retriveDate);
	}
	
	ArrayList<Model> list =new ArrayList<Model>();
	
    public ArrayList<Model> retriveDate(){  
		try{  
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		  
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");  
		  
		Statement stmt=con.createStatement();  
		  
		ResultSet rs=stmt.executeQuery("select * from trackvideo");  
		while(rs.next()) {
			
			
	
			String t1 = rs.getString("TOPIC");
		    String filenamee=rs.getString("FILENAME");  
		    
		    
		    Model m =new Model();
		    m.setTopic(t1);
		    m.setFilename(filenamee);
		    list.add(m);
		    
		
		}
		
		
		con.close();  
		  
		}catch(Exception e){ System.out.println(e);}  
		  
		
		return list;
		
		}  
}

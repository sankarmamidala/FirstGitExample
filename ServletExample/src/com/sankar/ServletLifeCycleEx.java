package com.sankar;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletLifeCycleEx
 */
public class ServletLifeCycleEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void service(HttpServletRequest req,HttpServletResponse res)  
			throws ServletException,IOException  
			{  

//		PrintWriter pw=res.getWriter();
//        res.setContentType("text/html");
// 
//        String[] values=req.getParameterValues("habits");
//        pw.println("Selected Values...");    
//        for(int i=0;i<values.length;i++)
//       {
//           pw.println("<li>"+values[i]+"</li>");
//       }
//       pw.close();    
		
		res.setContentType("image/jpeg");  
	    ServletOutputStream out;  
	    out = res.getOutputStream();  
	    FileInputStream fin = new FileInputStream("C:\\Users\\sanka\\Desktop\\kerala pics\\Camera\\IMG_20160720_133418290.jpg");  
	      
	    BufferedInputStream bin = new BufferedInputStream(fin);  
	    BufferedOutputStream bout = new BufferedOutputStream(out);  
//	    int ch =0; ;  
//	    while((ch=bin.read())!=-1)  
//	    {  
//	    bout.write(ch);  
//	    }  
	    
	    byte[] buffer = new byte[1];
	    for (int length = 0; (length = bin.read(buffer)) != -1;) {
	    	bout.write(buffer, 0, length);
	    }
	      
	    bin.close();  
	    fin.close();  
	    bout.close();  
	    out.close();  
			
	
}}
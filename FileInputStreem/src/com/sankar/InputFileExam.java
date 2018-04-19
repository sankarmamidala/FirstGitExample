package com.sankar;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class InputFileExam 
{
	
	public static int wordCounter() throws FileNotFoundException { 
		//inputs the text file
		Scanner input = new Scanner(new FileInputStream("E:\\sankar.txt")); 
		    int countWords = 0;
		    //while there are more lines
		    while (input.hasNextLine()) {
		        //goes to each next word
		        String word = input.next();
		        //counts each word
		        countWords++;
		    }
		    return countWords;
		}
	public static int lineCounter() throws FileNotFoundException {
		//inputs the text file
		Scanner input2 = new Scanner(new File("E:\\sankar.txt"));
		    int countLines = 0;
		    //while there are more lines
		    while (input2.hasNextLine()) {
		        //casts each line as a string
		        String line = input2.nextLine();
		        //counts each line
		        countLines++;
		    }
		    return countLines;
		   } 
	
	//static method that counts characters in the text file 
	public static int charCounter() throws FileNotFoundException {
	//inputs the text file
	Scanner input3 = new Scanner(new File("E:\\sankar.txt"));
	    int countChar = 0;
	    int character = 0;
	    //while there are more lines
	    while(input3.hasNextLine()) {
	       //casts each line as a string
	        String line = input3.nextLine();
	        //goes through each character of the line
	        for(int i=0; i < line.length(); i++){
	            character = line.charAt(i);
	             //if character is not a space (gets rid of whitespace)
	            if (character != 32){
	                //counts each character
	                countChar++;
	            }
	        }}
		return countChar;         
	    }
	public static void main(String[] args) throws IOException {
		
		
		System.out.println("Number of Words: " + wordCounter());
		System.out.println("Number of Lines: " + lineCounter());
		System.out.println("Number of Character: " + charCounter());
		
	}}
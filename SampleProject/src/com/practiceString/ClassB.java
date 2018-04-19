package com.practiceString;

public class ClassB extends ClassA{
 
    public void show(){
        System.out.println("ClassB.show() called");
    }
    
    
 public static void main(String[] args) {
        
        ClassB obj = new ClassB();
        obj.show();
        obj.display();
    }


@Override
public void display() {

	System.out.println("abstract");
	
}
}
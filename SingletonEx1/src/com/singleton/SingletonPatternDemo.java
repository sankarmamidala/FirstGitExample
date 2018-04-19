package com.singleton;

public class SingletonPatternDemo {

	public static void main(String[] args) {
		//illegal construct
	      //Compile Time Error: The constructor SingleObject() is not visible
	     // SingleObject object = new SingleObject();

	      //Get the only object available
	      SingleObject object = SingleObject.getInstance();
	      SingleObject object1 = SingleObject.getInstance();

	      SingleObject object2 = SingleObject.getInstance();

	      SingleObject object3 = SingleObject.getInstance();

	      
System.out.println("object"+object);
System.out.println("object1"+object1);
System.out.println("object2"+object2);
System.out.println("object3"+object3);
	      //show the message
	     object.showMessage();
	   }
	}
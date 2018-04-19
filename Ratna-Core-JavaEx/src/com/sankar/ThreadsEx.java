package com.sankar;

public class ThreadsEx extends Thread{

	public static void main(String[] args) throws InterruptedException {
		ThreadsEx t1= new ThreadsEx();
		ThreadsEx t2= new ThreadsEx();
		t1.setName("ratna");
		t2.setName("senkar");
		t1.start();
		t1.join();
		t2.start();
		//t2.join();
		
		

	}
	@Override
public void run(){
	for (int i = 0; i < 100; i++) {
System.out.println("currentthread:"+Thread.currentThread().getName());		
	}
}
}

package com.newThread;

public class YieldEx
{
public static void main(String[] args) {
	
	
	Producer producer = new Producer();
	Consumer consumer = new Consumer();
	
	/*producer.setPriority( Thread.MIN_PRIORITY);
	consumer.setPriority( Thread.MAX_PRIORITY);*/
	
	producer.start();
	
	consumer.start();
}
}

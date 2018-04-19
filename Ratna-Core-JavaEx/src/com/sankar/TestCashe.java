package com.sankar;

import static org.junit.Assert.fail;

import java.util.Date;

import org.junit.Test;

public class TestCashe {

	
	
	@Test
	public void PushStudent() {
		Student st= new Student("21","ratna21",new Date());
		CacheLoad.pushStudent(st);
	}
	

}

package com.slokam.test.studentDAO;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitExample {

	@Test
	public void test1(){
		System.out.println("I am test1");
	}
	
	@Test
	public void test2(){
		System.out.println("I am test2");
	}
	
	@Before
	public void before(){
		System.out.println("I am before test");
		
	}
	@After
	public void after(){
		System.out.println("I am after test");
	}
	@AfterClass
	public static void af(){
		System.out.println("I am after Class");
	}
	@BeforeClass
	public static void bf(){
		System.out.println("I am before Class");
	}
}

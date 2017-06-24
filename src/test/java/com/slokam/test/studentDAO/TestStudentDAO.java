package com.slokam.test.studentDAO;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.slokam.StudentDAO.StudentDAO;
import com.slokam.stumgt.pojo.StudentPojo;



public class TestStudentDAO {

	@Test
	public void testValidateUser(){
		String username = "syam";
		String password = "123";
		boolean result = true;
		
		boolean acutualResult = StudentDAO.validateUser(username, password);
		Assert.assertEquals(result, acutualResult);
	}
	
	@Test
	public void testValidateUserExceptionScenario(){
		String username = null;
		String password = "123";
		boolean result = true;
		
		boolean acutualResult = StudentDAO.validateUser(username, password);
		Assert.assertEquals(result, acutualResult);
	}
	
	@Test
	public void testGetAllWithPositiveData(){
		
		List<StudentPojo> list  = StudentDAO.getAll();
		
		Assert.assertFalse(list.isEmpty());
		
	}
}

package com.acloudstack.designpatterns.architectural.mvc;

import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

public class ModelTest {
	private static Model m;
	
	@BeforeClass
	public static void setup() {
		m = new Model();
		System.out.println("ModelTest - setup");
	}
	
	@AfterClass
	public static void teardown() {
		m = null;
		System.out.println("ModelTest - teardown");
	}
	
	@Before
	public void beforeEachTest() {
		System.out.println("ModelTest - beforeEachtest");
	}
	
	@After
	public void afterEachTest() {
		System.out.println("ModelTest - afterEachTest");
	}
	
	@Test
	public void testGetData() {
		assertNotNull(m);
		assertEquals(0, m.getData());
	}
	
	@Test 
	public void testSetData() {
		assertNotNull(m);
		m.setData(5);
		assertEquals(5, m.getData());
	}
}

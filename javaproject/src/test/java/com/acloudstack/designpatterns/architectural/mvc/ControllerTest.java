package com.acloudstack.designpatterns.architectural.mvc;

import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

public class ControllerTest {
	public static Controller c;
	
	@BeforeClass
	public static void setup() {
		c = new Controller();
		System.out.println("ControllerTest - setup");
	}
	
	@AfterClass
	public static void teardown() {
		c = null;
		System.out.println("ControllerTest - teardown");
	}
	
	@Before
	public void beforeEachTest() {
		System.out.println("ControllerTest - beforeEachtest");
	}
	
	@After
	public void afterEachTest() {
		System.out.println("ControllerTest - afterEachtest");
	}
	
	@Test
	public void testCreate() {
		assertNotNull(c);
		Controller controller = new Controller();
		assertNotNull(controller);
	}
	
	@Test
	public void testSetModelData() {
		assertNotNull(c);
		assertEquals(0, c.setModelData(5));
	}
	
	@Test
	public void testUpdateView() {
		assertNotNull(c);
		assertEquals(0, c.updateView());
	}

}

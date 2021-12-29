package com.acloudstack.designpatterns.architectural.mvc;

import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ViewTest{
	private static View m = null;
	
	@BeforeClass
	public static void setup() {
		System.out.println("ViewTest - setup");
		m = new View();
	}
	
	@AfterClass
	public static void teardown() {
		System.out.println("ViewTest - teardown");
		m = null;
	}

	@Before
	public void beaforeEachTest() {
		System.out.println("ViewTest - beaforeEachTest");
	}
	
	@After
	public void afterEachTest() {
		System.out.println("ViewTest - afterEachTest");
	}

	@Test
	public void testUpdate() {
		assertNotNull(ViewTest.m);
		assertEquals(0, m.update(1));
	}
}

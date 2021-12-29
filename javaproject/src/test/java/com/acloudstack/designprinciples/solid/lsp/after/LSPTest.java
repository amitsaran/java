package com.acloudstack.designprinciples.solid.lsp.after;

import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

public class LSPTest{
	private static Rectangle r;
	private static Square s;
	
	@BeforeClass
	public static void setup() {
		r = new Rectangle();
		s = new Square();
		System.out.println("LSP - LSPTest - setup");
	}
	
	@AfterClass
	public static void teardown() {
		r = null;
		s = null;
		System.out.println("LSP - LSPTest - teardown");
	}
	
	@Before
	public void beforeEachTest() {
		System.out.println("LSP - LSPTest - beforeEachTest");
	}
	
	@After
	public void afterEachTest() {
		System.out.println("LSP - LSPTest - afterEacTest");
	}
	
	@Test
	public void testSetValuesRectangle() {
		assertNotNull(r);
		r.setWidth(20);
		assertEquals(20, r.getWidth());
		r.setHeight(30);
		assertEquals(30, r.getHeight());
	}
	
	@Test
	public void testSetValuesSquare() {
		assertNotNull(s);
		s.setSide(20);	
		assertEquals(20, s.getSide());
	}
	
	@Test
	public void testComputeAreaRectangle() {
		assertNotNull(r);
		r.setWidth(20);
		r.setHeight(30);
		assertEquals(600, r.computeArea());	
	}
	
	@Test
	public void testComputeAreaSquare() {
		assertNotNull(s);
		s.setSide(30);
		assertEquals(900, s.computeArea());	
	}
}
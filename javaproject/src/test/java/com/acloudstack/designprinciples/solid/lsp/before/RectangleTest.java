package com.acloudstack.designprinciples.solid.lsp.before;

import static org.junit.Assert.assertSame;

import org.junit.Test;

import com.acloudstack.designprinciples.solid.lsp.before.Rectangle;
//import com.acloudstack.designprinciples.solid.lsp.before.Square;

public class RectangleTest {
	
	@Test
	public void testRectangleLength(){
		int length = 30;
		Rectangle r = new Rectangle();
		r.setLength(length);
		assertSame(r.getLength(), length);
	}
	
	public void testRectangleWidth(){
		int width = 20;
		Rectangle r = new Rectangle();
		r.setWidth(width);
		assertSame(r.getWidth(), width);
	}
	
	public void testRectangleWidthAndLength(){
		int length = 30, width = 20;
		Rectangle r = new Rectangle();
		r.setLength(length);
		r.setWidth(width);
		assertSame(r.getLength(), length);
		assertSame(r.getWidth(), width);
	}	
	
	/*@Test
	public void testLSP() {
		int length = 30, width = 20;
		Rectangle r = new Square();		
		r.setLength(length);
		r.setWidth(width);
		assertSame(r.getLength(), length);
		assertSame(r.getWidth(), width);
	}*/
}

// SOLID - Liskov Substitution Principle
//	We should be able to substitute base class objects with derived class object and
//	this should not alter characteristics/behavior of the program

package com.acloudstack.designprinciples.solid.lsp.before;

public class Rectangle{
	private int width;
	private int height;
	
	Rectangle(){
		this.width = 0;
		this.height = 0;
	}
	
	Rectangle(int w, int h){
		this.width = w;
		this.height = h;
	}
	
	public void setWidth(int w) {
		this.width = w;
	}
	
	public void setHeight(int h) {
		this.height = h;
	}
	
	public int getWidth() {
		return this.width;
	}
	
	public int getHeight() {
		return this.height;		
	}
	
	public int computeArea() {
		return (this.width)*(this.height);
	}
}
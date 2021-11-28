package com.acloudstack.designprinciples.solid.lsp.before;

public class Rectangle {
	private int width;
	private int length;
	
	Rectangle(){
		initialize(0, 0);
	}
	
	Rectangle(int width, int length){
		initialize(width, length);
	}
	
	void initialize(int width, int length) {
		width = width;
		length = length;
	}
	
	void setWidth(int width) {
		this.width = width;
	}
	
	int getWidth() {
		return this.width;
	}
	
	void setLength(int length) {
		this.length = length;
	}
	
	int getLength() {
		return this.length;
	}
	
	int getArea() {
		return this.width*this.length;
	}
}

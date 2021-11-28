package com.acloudstack.designprinciples.solid.lsp.before;

public class Square extends Rectangle{
	
	private int side;
	
	Square(){
		initialize(0);
	}
	
	void initialize(int side) {
		this.side = side;
	}
	
	void setWidth(int width) {
		this.side = width;
	}
	
	int getWidth() {
		return this.side;
	}
	
	void setLength(int length) {
		this.side = length;
	}
	
	int getLength() {
		return this.side;
	}
}

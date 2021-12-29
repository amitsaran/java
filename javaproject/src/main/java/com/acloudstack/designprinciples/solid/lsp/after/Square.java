package com.acloudstack.designprinciples.solid.lsp.after;

public class Square implements IShape{
	private int side;
	
	Square(){
		this.side = 0;
	}
	
	Square(int s){
		this.side = s;
	}
	
	public void setSide(int s) {
		this.side = s;
	}	

	public int getSide() {
		return this.side;
	}
	
	public int computeArea() {
		return (this.side)*(this.side);
	}
}
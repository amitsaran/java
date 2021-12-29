package com.acloudstack.designprinciples.solid.lsp.before;

public class Square extends Rectangle{
	
	Square(){
		super();
	}
	
	Square(int s){
		setSide(s);
	}
	
	@Override
	public void setWidth(int w) {
		setSide(w);
	}
	
	@Override
	public void setHeight(int h) {
		setSide(h);
	}
	
	@Override
	public int getWidth() {
		return super.getWidth();
	}
	
	@Override
	public int getHeight() {
		return super.getHeight();
	}
	
	@Override
	public int computeArea() {
		return (super.getWidth())*(super.getHeight());
	}
	
	private void setSide(int s) {
		super.setWidth(s);
		super.setHeight(s);
	}
}
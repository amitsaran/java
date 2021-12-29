package com.acloudstack.designpatterns.architectural.mvc;

public class Model{
	private int data;
	
	Model()	{
		data = 0;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public int getData() {
		return this.data;
	}
	
}
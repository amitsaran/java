package com.acloudstack.designpatterns.architectural.mvc;

public class Main {
	
	public static void main(String[] args) {
		Model m = new Model();
		View v = new View();
		Controller c = new Controller(m, v);
		
		c.updateView();		
		c.setModelData(1);
		c.updateView();
		
	}

}

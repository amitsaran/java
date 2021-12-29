package com.acloudstack.designpatterns.architectural.mvc;

public class View {
	View(){
		
	}
	
	public int update(int data) {
		int retFlag = 0;
		System.out.println("View Updated with data = " + data + ".");
		return retFlag;
	}
}

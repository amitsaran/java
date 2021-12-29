package com.acloudstack.designpatterns.architectural.mvc;

public class Controller {
	private Model m;
	private View v;
	
	Controller(){
		this.m = null;
		this.v = null;
	}
	
	Controller(Model m, View v){
		this.m = m;
		this.v = v;
	}
	
	public int setModelData(int data) {
		int retFlag = 0;
		if(m != null) {
			m.setData(data);
		}
		
		return retFlag;
	}
	
	public int updateView() {
		int retFlag = 0;
		if(v != null) {
			retFlag = v.update(m.getData());
		}		
		return retFlag;
	}

}

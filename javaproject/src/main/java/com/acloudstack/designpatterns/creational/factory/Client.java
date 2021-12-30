package com.acloudstack.designpatterns.creational.factory;

import com.acloudstack.designpatterns.creational.factory.infrastructure.ICompute;
import com.acloudstack.designpatterns.creational.factory.infrastructure.INetwork;
import com.acloudstack.designpatterns.creational.factory.infrastructure.IResourceFactory;
import com.acloudstack.designpatterns.creational.factory.infrastructure.IStorage;

public class Client{
	private IResourceFactory iRF;
	private ICompute iC;
	private INetwork iN;
	private IStorage iS;
	
	Client(IResourceFactory rf){
		setResourceFactory(rf);
		iC = null;
		iN = null;
		iS = null;
	}

	public IResourceFactory getResourceFactory() {
		return iRF;
	}

	public void setResourceFactory(IResourceFactory iRF) {
		this.iRF = iRF;
	}
	
	public ICompute createCompute() {
		if(this.iRF != null) {
			iC = iRF.createCompute();
		}
		return iC;
	}
	
	public INetwork createNetwork() {
		if(this.iRF != null) {
			iN = iRF.createNetwork();
		}
		return iN;
	}
	
	public IStorage createStorage() {
		if(this.iRF != null) {
			iS = iRF.createStorage();
		}
		return iS;
	}
}

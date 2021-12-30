package com.acloudstack.designpatterns.creational.factory.infrastructure.aws;

import com.acloudstack.designpatterns.creational.factory.infrastructure.IResourceFactory;
import com.acloudstack.designpatterns.creational.factory.infrastructure.ICompute;
import com.acloudstack.designpatterns.creational.factory.infrastructure.INetwork;
import com.acloudstack.designpatterns.creational.factory.infrastructure.IStorage;

public class AWSResourceFactory implements IResourceFactory{
			
	@Override
	public ICompute createCompute() {
		ICompute c = null;
		c = new AWSCompute();
		return c;		
	}
	
	@Override 
	public INetwork createNetwork() {
		INetwork n = null;
		n = new AWSNetwork();
		return n;
	}
	
	@Override
	public IStorage createStorage() {
		IStorage s = null;
		s = new AWSStorage();
		return s;
	}
}

package com.acloudstack.designpatterns.creational.factory;

import com.acloudstack.designpatterns.creational.factory.infrastructure.FactoryProvider;
import com.acloudstack.designpatterns.creational.factory.infrastructure.ICompute;
import com.acloudstack.designpatterns.creational.factory.infrastructure.IResourceFactory;

public class Main {
	
	public static void main(String[] args) {		
		IResourceFactory rf = FactoryProvider.getAWSResourceFactory();
		
		Client client = new Client(rf);
		ICompute c1 = client.createCompute();
		c1.start();
		System.out.println("Compute c1 started");
		c1.stop();
		System.out.println("Compute c1 stopped");
	}
}

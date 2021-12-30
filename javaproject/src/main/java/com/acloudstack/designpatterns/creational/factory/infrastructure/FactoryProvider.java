package com.acloudstack.designpatterns.creational.factory.infrastructure;

import com.acloudstack.designpatterns.creational.factory.infrastructure.aws.AWSResourceFactory;

public class FactoryProvider {
	
	public static IResourceFactory getAWSResourceFactory() {
		return new AWSResourceFactory();
	}

}

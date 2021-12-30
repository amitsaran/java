package com.acloudstack.designpatterns.creational.factory.infrastructure;

public interface IResourceFactory {
	public ICompute createCompute();
	public INetwork createNetwork();
	public IStorage createStorage();
}

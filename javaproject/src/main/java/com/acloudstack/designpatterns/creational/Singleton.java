package com.acloudstack.designpatterns.creational;

public class Singleton {
	
	// Singleton
	//  a. Lazy Loading
	//  b. NOT thread safe
	/*static Singleton instance;
	
	private Singleton() {
		System.out.println("Singleton private Constructor called");
	}	
	
	public static Singleton getInstance() {
		
		if (instance == null) {
			instance = new Singleton();
		}
		
		return instance;
	}*/
	
	// Singleton
	//  a. Lazy Loading
	//  b. Thread Safe
	/*private Singleton() {
		System.out.println("Singleton private Constructor");
	}
	
	private static class NestedSingleton{
		static Singleton instance = new Singleton();		
	}
	
	public static Singleton getInstance() {
		return NestedSingleton.instance;		
	}*/
	
	// Singleton
	//  a. Lazy Loading
	//  b. Thread Safe
	static Singleton instance;
	
	private Singleton() {
		//System.out.println("Singleton private constructor");
	}
	
	synchronized public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}

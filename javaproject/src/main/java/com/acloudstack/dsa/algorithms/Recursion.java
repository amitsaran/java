package com.acloudstack.dsa.algorithms;

public class Recursion {
	
	void toh(int n, int pegA, int pegB, int pegC) {
		
		if(n > 0) {
		
			toh(n-1, pegA, pegC, pegB);
			
			System.out.println("(" + pegA + ", " + pegC + ")");
			
			toh(n-1, pegB, pegA, pegC);	
		}
	}
}

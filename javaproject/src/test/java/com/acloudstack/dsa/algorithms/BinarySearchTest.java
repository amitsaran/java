package com.acloudstack.dsa.algorithms;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BinarySearchTest {
	
	@Test
	public void binarySearchArrayTest() {
		BinarySearch bs = new BinarySearch();
		int index = -1;
		int[] arr1 = {9};
		index = bs.binarySearchArray(arr1, 9);
		assertEquals(0, index);
		
		int[] arr2 = {1, 2, 3, 4, 6, 7, 9, 12, 34, 56, 67, 69, 71, 84, 91};		
		index = bs.binarySearchArray(arr2, 3);
		assertEquals(2, index);	
		
		index = bs.binarySearchArray(arr2, 30);
		assertEquals(-1, index, -1);
	}
}

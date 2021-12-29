package com.acloudstack.dsa.algorithms;

public class BinarySearch {
	BinarySearch(){
		
	}
	
	/*public int binarySearchArray(int[] arr, int key){
		int index = -1;
		int low = 0;
		int high = arr.length - 1;		
		while(low <= high) {
			int mid = (low+high)/2;
			if(key == arr[mid]) {
				index = mid;
				return index;
			}else if(key < arr[mid]) {
				high = mid-1;
			}else if(key > arr[mid]) {
				low = mid+1;
			}
		}		
		return index;		
	}*/
	
	// [9, 10, 20, 49, 77, 89, 213, 300]
	// [0]
	// [9]
	// [9, 10]
	// three cases
	// 		no elements, 1 element, more than one element
	public int binarySearchArray(int[] arr, int key) {
		int index = -1;
		if (null == arr)
			return index;
		int low = 0;		
		int high = arr.length - 1;		
		while(low <= high) {
			int mid = (low + high)/2;
			if(arr[mid] == key) {
				index = mid;
				return index;
			} else if(arr[mid] > key) {
				high = mid-1;
			} else if(arr[mid] < key) {
				low = mid+1;
			}
		}		
		return index;
	}
}

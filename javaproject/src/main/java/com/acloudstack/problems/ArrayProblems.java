package com.acloudstack.problems;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class ArrayProblems {
	ArrayProblems(){
		
	}
	
	public Integer getMostFrequentNumber(int[] givenArray) {
		Integer frequentItem = null;
		int frequency = -1;		
		Map<Integer, Integer> mapCounts = new HashMap<>();
		for(int item : givenArray) {
			if(mapCounts.containsKey(item)){
				int currentCount = mapCounts.get(item);
				mapCounts.put(item,  currentCount+1);
				
			} else {
				mapCounts.put(item, 1);
			}
			
			// 
			if(mapCounts.get(item) > frequency) {
				frequency = mapCounts.get(item);
				frequentItem = item;
			}
		}		
		
		return frequentItem;
	}
	
	public List<Integer> getCommonElements(int[] arr1, int[] arr2){
		List<Integer> commonElements = new ArrayList<>();
		
		int p1 = 0; int p2 = 0;
		
		while(p1 < arr1.length && p2 < arr2.length) {
			if(arr1[p1] == arr2[p2]) {
				commonElements.add(arr1[p1]);
				p1 = p1 + 1; 
				p2 = p2 + 1;
			}
			else if(arr1[p1] > arr2[p2]) {
				p2 = p2 + 1;				
			}
			else {
				p1 = p1 + 1;
			}
		}
		
		return commonElements;
	}
}

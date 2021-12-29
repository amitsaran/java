package com.acloudstack.problems;

import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.ArrayList;

public class ArrayProblemsTest {
	private static ArrayProblems a;
	@BeforeClass
	public static void setup() {
		a = new ArrayProblems();
		System.out.println("ArrayProblemsTest - setup");
	}
	
	@AfterClass
	public static void teardown() {
		a = null;
		System.out.println("ArrayProblemsTest - teardown");
	}
	
	@Before
	public void beforeEachTest() {
		System.out.println("ArrayProblemsTest - beforeEachTest");
	}
	
	@After
	public void afterEachTest() {
		System.out.println("ArrayProblemsTest - afterEachTest");
	}
	
	@Test
	public void testGetmostFrequentNumber() {
		assertNotNull(a);
		
		// mostFrequent(array1) should return 1.
        int[] array1 = {1, 3, 1, 3, 2, 1};
        assertEquals(Integer.valueOf(1), a.getMostFrequentNumber(array1));
        
        // mostFrequent(array2) should return 3.
        int[] array2 = {3, 3, 1, 3, 2, 1};
        assertEquals(Integer.valueOf(3), a.getMostFrequentNumber(array2));
        
        // mostFrequent(array3) should return null.
        int[] array3 = {};
        assertEquals(null, a.getMostFrequentNumber(array3));
        
        // mostFrequent(array4) should return 0.
        int[] array4 = {0};
        assertEquals(Integer.valueOf(0), a.getMostFrequentNumber(array4));
        
        // mostFrequent(array5) should return -1.
        int[] array5 = {0, -1, 10, 10, -1, 10, -1, -1, -1, 1};
        assertEquals(Integer.valueOf(-1), a.getMostFrequentNumber(array5));
	}
	
	@Test
	public void testGetCommonElements() {
		assertNotNull(a);
		
		int[] array1A = {1, 3, 4, 6, 7, 9};
        int[] array2A = {1, 2, 4, 5, 9, 10};
        List<Integer> resultA = new ArrayList<>();
        assertNotNull(resultA);
        resultA.add(1); resultA.add(4); resultA.add(9);       
        assertEquals(true, listEquals( resultA, a.getCommonElements(array1A, array2A)));

        int[] array1B = {1, 2, 9, 10, 11, 12};
        int[] array2B = {0, 1, 2, 3, 4, 5, 8, 9, 10, 12, 14, 15};
        // commonElements(array1B, array2B) should return [1, 2, 9, 10, 12] (an array).
        List<Integer> resultB = new ArrayList<>();
        assertNotNull(resultB);
        resultB.add(1); resultB.add(2); resultB.add(9); resultB.add(10); resultB.add(12);       
        assertEquals(true, listEquals( resultB, a.getCommonElements(array1B, array2B)));

        int[] array1C = {0, 1, 2, 3, 4, 5};
        int[] array2C = {6, 7, 8, 9, 10, 11};
        // common_elements(array1C, array2C) should return [] (an empty array).
        List<Integer> resultC = new ArrayList<>();
        assertNotNull(resultB);    
        assertEquals(true, listEquals( resultC, a.getCommonElements(array1C, array2C)));
	}
	
	private boolean listEquals(List<Integer> list1, List<Integer> list2) {
        if(list1.size() != list2.size())
            return false;
        for (int value : list1) {
            if(!list2.contains(value))
                return false;
        }
        return true;
    }
}

package com.acloudstack.dsa.algorithms;

import static org.junit.Assert.assertEquals;

import com.acloudstack.dsa.algorithms.Recursion;
import org.junit.Test;

public class RecursionTest {
	
	@Test
	public void tohTest() {
		Recursion r = new Recursion();
		Recursion r2 = r;
		r.toh(3,  1,  2,  3);
		assertEquals(r, r2);
	}
}

/*
3	0	0
2	0	1
1	1	1
1	2	0
0	2	1
1	1	1
1 	0	2
0	0	3


*/
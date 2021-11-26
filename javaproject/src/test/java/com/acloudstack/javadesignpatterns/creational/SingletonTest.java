package com.acloudstack.javadesignpatterns.creational;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertEquals;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class SingletonTest {
	
	@BeforeClass
    public static void setup() {
        System.out.println("Ran the before");
    }

    @AfterClass
    public static void teardown() {
        System.out.println("Ran the after");
    }
    
	@Test
    public void testSingletonInstance() {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		assertSame(s1, s2);
    }
	
	@Test
    public void testSingletonInstanceThreadSafe() {
		int threadsCount = 50;
		Set<Singleton> singletonSet = Collections.newSetFromMap(new ConcurrentHashMap<Singleton, Boolean>());
		
		try {
			ExecutorService executorService = Executors.newFixedThreadPool(threadsCount);
		    for (int i = 0; i < threadsCount; i++) {
		        executorService.execute(() -> {
		            Singleton singleton = Singleton.getInstance();
		            singletonSet.add(singleton);
		        });
		    }
		    executorService.shutdown();	    
			executorService.awaitTermination(1, TimeUnit.MINUTES);
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	    assertEquals(1, singletonSet.size());
    }
}

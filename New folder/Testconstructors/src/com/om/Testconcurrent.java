package com.om;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class Testconcurrent {
		
			public static void main(String[] args)
			{
				HashMap h1=new HashMap();
				h1.put(100, "Hello");
				h1.put(101, "Geeks");
				h1.put(102, "Geeks");
				h1.put(101, "Hello");
				System.out.println(h1);
				// create an instance of
				// ConcurrentHashMap
	ConcurrentHashMap<Integer, String> m=new ConcurrentHashMap<>();

				// Insert mappings using
				// put method
				m.put(100, "Hello");
				m.put(101, "Geeks");
				m.put(102, "Geeks");

				// Here we cant add Hello because 101 key
				// is already present in ConcurrentHashMap object
				m.put(101, "Hello");

				/*// We can remove entry because 101 key
				// is associated with For value
				m.remove(101, "Geeks");

				// Now we can add Hello
				m.putIfAbsent(103, "Hello");

				// We cant replace Hello with For
				m.replace(101, "Hello", "For");*/
				System.out.println(m);
			}
		}

	

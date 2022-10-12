package com.om;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Testlinkedhashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap h1=new HashMap();
h1.put(10, "abc");
h1.put(11, "xyz");
h1.put(5, "abc");
System.out.println(h1);
LinkedHashMap h2=new LinkedHashMap();

h2.put(10, "abc");
h2.put(11, "xyz");
h2.put(5, "abc");
System.out.println(h2);

	}

}

package com.om;

import java.util.HashMap;
import java.util.WeakHashMap;

public class Testwhm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Temp t1=new Temp();
	t1=null;
	WeakHashMap h1=new WeakHashMap();
	h1.put(t1, "Abc");
	System.out.println(h1);
	System.gc();
	System.out.println(h1);
	
		

	}

}
class Temp
{
	public   void finalize()
	{
		System.out.println("object is dealocate");
	}
	

}

package com.om;

import java.util.HashMap;
import java.util.IdentityHashMap;

class Student
{
	int i=20;
	 Student(int i)
	{
		System.out.println(i);
		
	}
}
class Child extends Student
{
Child()
{
	super(3);
}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
IdentityHashMap h1=new IdentityHashMap();

h1.put(i1, "Abc");
h1.put(i2, "xyz");
System.out.println(h1);



	}

}

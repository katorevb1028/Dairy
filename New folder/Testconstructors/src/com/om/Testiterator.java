package com.om;

import java.util.ArrayList;
import java.util.Iterator;

public class Testiterator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a1=new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(5);
		System.out.println(a1);
		Iterator itr=a1.iterator();
		a1.set(2, 15);
		a1.remove(1);
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}

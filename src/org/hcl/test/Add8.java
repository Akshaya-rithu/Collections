package org.hcl.test;

import java.util.*;

public class Add8 {

	public static void main(String[] args) {
		List<Integer> li=new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(90);
		li.add(10);
		li.add(10);
		li.add(40);
		li.add(50);
		System.out.println(li);
		//System.out.println(li.size());
		//li.add(8,80);
		li.add(li.lastIndexOf(10),100);
		System.out.println("After adding in the last index 10");
		System.out.println(li);
		System.out.println("Clonning done ");
		}

}

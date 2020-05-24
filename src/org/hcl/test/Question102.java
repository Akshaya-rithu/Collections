package org.hcl.test;

import java.util.*;


public class Question102 {
public static void main(String[] args) {
	List<Integer> list1 = new ArrayList<Integer>();
	List<Integer> list2=new ArrayList<Integer>();
	list1.add(10);
	list1.add(20);
	list1.add(30);
	list1.add(40);
	list1.add(90);
	list1.add(10);
	list1.add(10);
	list1.add(40);
	list1.add(50);
	System.out.println(list1);
	
	list2.add(30);
	list2.add(40);
	list2.add(50);
	list2.add(60);
	list2.add(80);
	
	System.out.println(list2);
	list2.removeAll(list1);
	System.out.println("after removing " +list2);
	System.out.println(list1);
	
	List<Integer> list3=new ArrayList<Integer>();
	list3.addAll(list2);
	System.out.println("new list "+list3);
}
}

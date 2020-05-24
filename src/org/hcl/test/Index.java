package org.hcl.test;


import java.util.*;

public class Index {
public static void main(String[] args) {
	List <Integer>l=new ArrayList<Integer>();
	l.add(10);
	l.add(20);
	l.add(30);
	l.add(90);
	System.out.println(l);
	System.out.println("Index of 10");
	int i = l.indexOf(10);
	System.out.println(i);
}
}

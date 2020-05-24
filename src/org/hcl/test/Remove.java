package org.hcl.test;

import java.util.*;

public class Remove {
public static void main(String[] args) {
	List <Integer> l=new ArrayList<Integer>();
	l.add(10);
	l.add(20);
	l.add(30);
	l.add(40);
	l.add(50);
	l.add(60);
	System.out.println(l);
	l.remove(2);
	System.out.println("After removing");
	System.out.println(l);
	
}
}

package org.hcl.test;

import java.util.*;

public class Remove7 {
public static void main(String[] args) {
	List <Integer> l=new ArrayList<Integer>();
	l.add(10);
	l.add(20);
	l.add(30);
	l.add(90);
	l.add(10);
	l.add(10);
	l.add(40);
	System.out.println(l);
	l.remove(l.lastIndexOf(10));
	System.out.println("After removing");
	System.out.println(l);
}
}

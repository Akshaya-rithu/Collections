package org.hcl.test;

import java.util.*;

public class LengthSize2 {
public static void main(String[] args) {
	List<Integer> l=new LinkedList<Integer>();
	l.add(100);
	l.add(200);
	l.add(300);
	l.add(400);
	l.add(500);
	l.add(600);
	l.add(700);
	System.out.println(l);
	int i = l.size();
	System.out.println("Size of linked list");
	System.out.println(i);
	
}
}

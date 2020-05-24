package org.hcl.test;

import java.util.*;

public class Replace9 {
public static void main(String[] args) {
	List<Integer> l=new ArrayList<Integer>();
	l.add(10);
	l.add(20);
	l.add(30);
	l.add(90);
	l.add(10);
	l.add(10);
	l.add(40);
	l.add(50);
	l.add(10);
	System.out.println("Display the list");
	System.out.println(l);
	l.set(l.indexOf(10),100);
	System.out.println("After interchanging 300 to 350");
	//l.set(7, 90);
	//System.out.println();
	System.out.println(l);
}
}

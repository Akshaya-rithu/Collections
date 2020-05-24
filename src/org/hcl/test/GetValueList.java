package org.hcl.test;

import java.util.*;

public class GetValueList {
public static void main(String[] args) {
	List<Integer> l=new ArrayList<Integer>();
	System.out.println("Get number of list value from user");
	Scanner s=new Scanner(System.in);
	int input = s.nextInt();
	System.out.println("Get the values for the list");
	for(int i=0;i<input;i++)
	{
		int j = s.nextInt();
		l.add(j);
	}
	System.out.println("Display the value");
	for (Integer a : l) {
		System.out.println(a);
	}
	s.close();
}
}
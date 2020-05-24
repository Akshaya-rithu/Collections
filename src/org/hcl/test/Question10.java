package org.hcl.test;

import java.util.*;

public class Question10 {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2=new ArrayList<Integer>();
	
		list2.add(30);
		list2.add(40);
		list2.add(50);
		list2.add(60);
		list2.add(30);
		System.out.println(list2);
		System.out.println("GEt input size form user");
		Scanner s = new Scanner(System.in);
		int int1 = s.nextInt();
		System.out.println(int1);
		System.out.println("GEt value for list");
		for (int i = 0; i < int1; i++) {
			int j = s.nextInt();
			list1.add(i, j);
		}
		System.out.println("Display the list");
		for (Integer l : list1) {
			System.out.println(l);
		}
		for(int i=0;i<int1;i++)
		{
			System.out.println(list1.get(i));
		}
		list1.retainAll(list2);
		System.out.println(list1);
				s.close();

	}

}

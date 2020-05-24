package org.hcl.test;

import java.util.*;

public class LengthSize {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		list.add(600);
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		for (Integer integer : list) {
			System.out.println(integer);
		}
		// System.out.println("Length of the List");
		int size = list.size();
		System.out.println(size);
		Integer i = list.get(4);
		System.out.println(i);
	}
}


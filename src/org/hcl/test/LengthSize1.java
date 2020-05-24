package org.hcl.test;

import java.util.*;

public class LengthSize1 {
	public static void main(String[] args) {
		
		List<Integer> li1 = new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of List::");
		int nextInt = sc.nextInt();
		System.out.println(" get the value");
		for(int j=0;j<nextInt;j++)
		{
			int nextInt2 = sc.nextInt();
			li1.add(nextInt2);
		}
		
		System.out.println("Display the value");
		for(int j=0;j<nextInt;j++)
		{
			System.out.println("The Index "+j+" of :: "+li1.get(j));
		}
		
		sc.close();
		
	}
}

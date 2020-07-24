package com.epam;

import java.util.*;

public class Average {
    public static void main(String[] args) {
        
    	//List <Integer> list = Arrays.asList(20, 50, 99, 12, 94);
    	Scanner s = new Scanner(System.in);
    	System.out.print("Enter no. of elements you want in array:");
        int n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        List<Integer> list = new ArrayList<>(a.length);

		for (int i : a) {
			list.add(Integer.valueOf(i));
		}
    	IntSummaryStatistics average = list.stream().mapToInt((numbers) -> numbers).summaryStatistics();
        System.out.println("Average of Numbers: " + average.getAverage());

    }

}

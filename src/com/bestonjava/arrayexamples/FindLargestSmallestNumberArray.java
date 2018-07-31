package com.bestonjava.arrayexamples;

public class FindLargestSmallestNumberArray {
	public static void main(String... args){
		int[] arr = new int[]{10,1,2,8,3,15,3};
		findLargestSmallestNumberArray(arr);
	}
	
	private static void findLargestSmallestNumberArray(int[] arr){
		if(arr == null || arr.length <1){
			return;
		}
		int max = Integer.MAX_VALUE;
		int min= Integer.MIN_VALUE;
		for(int value:arr){
			if(value<min){
				min=value;
			}
			if(value>max){
				max=value;
			}
		}
		System.out.println("Minumum element:" + min);
		System.out.println("Maximum element: " + max);
	}
}

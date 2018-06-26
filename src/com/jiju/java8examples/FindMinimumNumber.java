package com.jiju.java8examples;

import java.util.Scanner;

/**
 * 
 * @author jijukrishnan
 * Problem statement
 * Given a positive integer n, find out smallest integer m such that
 * all digits in m multiply equals to n. For example, n=36 returns 49,
 * n=72 returns 89. 
 * Condition: Assume that there is no overflow 
 *
 */
public class FindMinimumNumber {
	
		public static void main (String[] args) throws java.lang.Exception
		{
			// your code goes here
			Scanner s=new Scanner(System.in);
			int n=s.nextInt();
	                for(int i=n+1;i<2*n;i++){
	                      int result=1;
	                      int t=i;
	                     while(t>0){
	                        result=result*(t%10);
	                        t=t/10;
	                             }
	                       if(result==n){
	                        System.out.println(i);
	                        break;}
	                }
		}
	
}

package com.org;

public class Java {
	public static void main(String[] args) {
		int num =4346;
		int rem = 0;
		int sum = 0;
		while(num>0) {
			rem=num%10;
			sum =sum+rem;
			num=num/10;
			
		}
		System.out.println(sum);
	}

}

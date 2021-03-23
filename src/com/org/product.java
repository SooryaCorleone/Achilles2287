package com.org;

public class product {
public static void main(String[] args) {
	int num=154,res =1,rem=0;
	int n =num;
	while(num>0) {
		rem =num%10;
		res=res*rem;
		num=num/10;
		
	}
	System.out.println(res);
}
}

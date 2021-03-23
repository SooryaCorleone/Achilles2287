package com.org;

import java.util.Scanner;

public class New {
public static void main(String[] args) {
	System.out.println("enter the num");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int count =0;
	while(num>0) {
		num=num/10;
		count++;
	}
	System.out.println(count);
}
}

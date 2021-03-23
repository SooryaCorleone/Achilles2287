package com.org;

import java.util.Scanner;

public class NNew {
	public static void main(String[] args) {
		System.out.println("enter phone number");
		Scanner sc=new Scanner(System.in);
		String A=sc.nextLine();
		boolean aa = A.matches("[0-9]{10}");
	System.out.println(aa);
	}

}

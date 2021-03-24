package com.org;

public class Pal{
	public static void main(String[] args) {
		System.out.println("26516275");
		int num = 121, res = 0, rem = 0;
		int n = num;
		while (num > 0) {
			rem = num % 10;
			res = (res * 10) + rem;
			num = num / 10;

		}
		// reverse
		if (n == res) {
			System.out.println("pali");

		} else {
			System.out.println("not pali");
		}

	}
	
}
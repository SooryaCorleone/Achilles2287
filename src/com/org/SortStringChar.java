package com.org;

import java.util.Arrays;

public class SortStringChar {
public static void main(String[] args) {
	String st ="java";
	char[] charArray = st.toCharArray();
Arrays.sort(charArray);
System.out.println(new String(charArray));
}
}

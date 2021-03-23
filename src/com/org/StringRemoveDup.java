package com.org;

import java.util.HashSet;
import java.util.Set;

public class StringRemoveDup {
public static void main(String[] args) {
	String st="java";
	System.out.println(Java(st));
	
}
public static String Java(String st) {
	Set<Character>set=new HashSet<>();
	StringBuffer sb=new StringBuffer();
	for (int i = 0; i < st.length(); i++) {
		Character c=st.charAt(i);
		if (!set.contains(c))
		{
		set.add(c);
		sb.append(c);
		}
	}
	return sb.toString();
}
}

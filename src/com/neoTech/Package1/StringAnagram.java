package com.neoTech.Package1;

import java.util.Arrays;
import java.util.TreeSet;

public class StringAnagram{
	/*
	 * Write a function that checks if a string is build out of the same letters as
	 * another string. Ex: isSame("abc", "cab"); -> true isSame("abc", "abb"); ->
	 * false:
	 * 
	 * Anagram - strings made up of the same chars
	 */

    //   input ------ output
	// abbbbc, aaaabc true
	// abc, abcc

	public static void main(String[] args) {
		System.out.println(isAnagram("abacdec", "cabbbbdbb"));
		System.out.println(isAnagram2("abacdc", "cabbbbdbb"));
	}
	
	public static boolean isAnagram(String str1, String str2) {
		char[] ca1 = str1.toCharArray();
		char[] ca2 = str2.toCharArray();

		Arrays.sort(ca1);
		Arrays.sort(ca2);

		String s1 = "";
		String s2 = "";
		for (char c : ca1) {
			// lets remove duplicates
			if (!s1.contains(c + "")) {
				s1 += c;
			}
		}

		for (char c : ca2) {
			// lets remove duplicates
			if (!s2.contains(c + "")) {
				s2 += c;
			}
		}

		return s1.equals(s2);
	}

	public static boolean isAnagram2(String str1, String str2) {
//		TreeSet<String> ts1 = new TreeSet<String>();
//		ts1.addAll(Arrays.asList(str1.split("")));
//
//		TreeSet<String> ts2 = new TreeSet<String>();
//		ts2.addAll(Arrays.asList(str2.split("")));
		String s1 = new TreeSet<String>(Arrays.asList(str1.split(""))).toString();	
		String s2 = new TreeSet<String>(Arrays.asList(str2.split(""))).toString();

		return s1.equals(s2);
	}
 }


package com.mypractise.basicregex;

import java.util.regex.Pattern;

public class BasicRegexSplitApp {

	public static void main(String[] args) {
		System.out.println("\n");
		
		String text = "homedtfyjpg.jpg";
		
		String delimiter = "\\.";
		
		Pattern pattern = Pattern.compile(delimiter, Pattern.CASE_INSENSITIVE);
		
		String[] result = pattern.split(text);
		
		System.out.println(pattern.pattern());
		
		for(String t : result) {
			System.out.println(t);
		}
		System.out.println(result[0]);
	}

}

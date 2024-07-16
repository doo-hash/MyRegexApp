package com.mypractise.basicregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BasicRegexName {

	public static void main(String[] args) {
		System.out.println("Regular Expression For Name!!\n");
				
		Pattern pattern = Pattern.compile("[a-zA-Z]{4}");
		
		System.out.println("Pattern : " + pattern.pattern());
		
		
		Matcher matcher = pattern.matcher("geek");
		System.out.println(matcher.matches() + " " + matcher.group());
		
	}

}

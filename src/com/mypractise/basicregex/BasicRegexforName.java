package com.mypractise.basicregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BasicRegexforName {

	public static void main(String[] args) {
		System.out.println("Regular Expression For Name!!\n");
				
		Pattern pattern = Pattern.compile("([a-z] & [A-Z]){4}");
		
		System.out.println("Pattern : " + pattern.pattern());
		Matcher matcher = pattern.matcher("geeks for geeks 1234in Geeks world.");
		
		while(matcher.find()) {
			System.out.println("Patttern found from " + matcher.start() + " " +  matcher.group() + " to " + (matcher.end() - 1));
		}
		
		System.out.println("1 : " + Pattern.matches("[a-z]{4}", "swdd"));
		System.out.println("2 : " + Pattern.matches("[a-z ]{4}", "    "));// "asdf", "a  s","a   ",......
		System.out.println("3 : " + Pattern.matches("[a-zA-Z]{4}", "AAAA"));//"aass", "AAAA", "aaAA",.....
		System.out.println("4 : " + Pattern.matches("[0-9]{4}", "7895"));
	}

}

package com.mypractise.basicregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BasicRegexApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to Regular Expression Practise Session!!\n");
		
		System.out.println(Pattern.matches("ge*ksforge*ks","geeksforgeeks"));
		System.out.println("\n");
		
		System.out.println(Pattern.matches("g*e*ks*", "k"));
		
		Pattern pattern = Pattern.compile("ge*", Pattern.CASE_INSENSITIVE);
		
		Matcher matcher = pattern.matcher("geeks for geeks in Geeks world.");
		
		while(matcher.find()) {
			System.out.println("Patttern found from " + matcher.start() + " to " + (matcher.end() - 1));
		}
	}

}

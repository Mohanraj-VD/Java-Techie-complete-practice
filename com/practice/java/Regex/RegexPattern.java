package com.practice.java.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPattern {
	public static void main(String[] args) {
		//Way 1
		Pattern p = Pattern.compile(".s");
		Matcher m = p.matcher("as");
		boolean b = m.matches();
		
		//Way 2
		boolean b2 = Pattern.compile(".s",1).matcher("as").matches();
		
		//way 3
		boolean b3 = Pattern.matches(".s", "an");
		
		System.out.println(b+" "+b2+" "+b3);
	}
}

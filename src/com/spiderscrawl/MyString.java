package com.spiderscrawl;

public class MyString {

	public static void main(String[] args) {
	
		String s = new String("Delhi");
		System.out.println(s);
		
		String concat = s.concat("is India's part");
		
		System.out.println(concat);
		
		System.out.println(s.charAt(3));
		
		MyString s1 = new MyString();
		System.out.println(s1);
		
		char[] ch = {'a', 'b', 'c', 'd'};
		
		String s2 = new String(ch);
		System.out.println(s2);
		
		byte[] b = {101, 102, 103, 104};
		
		String s3 = new String(b);
		
		String s4 = "   India is great country    ";
		
		
		System.out.println(s3);
		
		

	}

}

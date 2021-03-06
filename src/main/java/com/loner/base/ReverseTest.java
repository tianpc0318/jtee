package com.loner.base;

public class ReverseTest {

	public static void main(String[] args) {
		String str = "Welcome to shenzhen.";
		System.out.println(reverse(str).toString());
		System.out.println(charArray(str));
		System.out.println(chatAt(str));
	}

	public static String reverse(String str) {
		StringBuffer sb = new StringBuffer(str);
		return sb.reverse().toString();
	}

	public static String charArray(String str) {
		String result = "";
		char[] charArray = str.toCharArray();
		for (int i = charArray.length - 1; i >= 0; i--) {
			result += charArray[i];
		}
		return result;
	}

	public static String chatAt(String str) {
		String result = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			result += str.charAt(i);
		}
		return result;
	}

}
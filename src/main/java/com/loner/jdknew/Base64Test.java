package com.loner.jdknew;

import java.util.Base64;
import java.util.UUID;

public class Base64Test {

	public static void main(String[] args) throws Exception {
		// Basic编码：是标准的BASE64编码，用于处理常规的需求
		// 编码
		String asB64 = Base64.getEncoder().encodeToString(
				"some string".getBytes("utf-8"));
		System.out.println(asB64); // 输出为: c29tZSBzdHJpbmc=
		// 解码
		byte[] asBytes = Base64.getDecoder().decode("c29tZSBzdHJpbmc=");
		System.out.println(new String(asBytes, "utf-8")); // 输出为: some string
		// URL编码：使用下划线替换URL里面的反斜线“/”
		String urlEncoded = Base64.getUrlEncoder().encodeToString(
				"subjects?abcd".getBytes("utf-8"));
		System.out.println("Using URL Alphabet: " + urlEncoded);
		// 输出为: Using URL Alphabet: c3ViamVjdHM_YWJjZA==
		// MIME编码：使用基本的字母数字产生BASE64输出，而且对MIME格式友好：每一行输出不超过76个字符，而且每行以“\r\n”符结束。
		StringBuilder sb = new StringBuilder();
		for (int t = 0; t < 10; ++t) {
			sb.append(UUID.randomUUID().toString());
		}
		byte[] toEncode = sb.toString().getBytes("utf-8");
		String mimeEncoded = Base64.getMimeEncoder().encodeToString(toEncode);
		System.out.println(mimeEncoded);
	}
}

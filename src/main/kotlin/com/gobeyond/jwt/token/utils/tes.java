package com.gobeyond.jwt.token.utils;

import java.util.regex.Pattern;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class tes {

	
	public static void main(String a[]) {
		
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String password = "password";
		String encodedPassword = passwordEncoder.encode(password);

		Pattern BCRYPT_PATTERN = Pattern
				.compile("\\A\\$2(a|y|b)?\\$(\\d\\d)\\$[./0-9A-Za-z]{53}");
		
		System.out.println();
		System.out.println("Password is         : " + password);
		System.out.println("Encoded Password is : " + encodedPassword);
		System.out.println("Invalid Password is : " + encodedPassword + "junk");
		System.out.println();

		
		System.out.println(":::::::::"+BCRYPT_PATTERN.matcher(encodedPassword).matches());
		
		boolean isPasswordMatch = passwordEncoder.matches(password, encodedPassword+"junk");
		System.out.println("Password : " + password + "   isPasswordMatch    : " + isPasswordMatch);
		
	}
}

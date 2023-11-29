package com.training.org;

public class MessageUtil {
	private static String message;
	
	public MessageUtil(String message) {
		this.message=message;
	}
	public static String printMessage() {
		return message;
	}
}
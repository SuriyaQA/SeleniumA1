package com.GenericLibrary;

import java.time.LocalDateTime;

public class Java_Utility {

	public static String date() {
		
		LocalDateTime date = LocalDateTime.now();
		String SystemDate = date.toString().replace(":","-");
		
		return SystemDate;
	}
}

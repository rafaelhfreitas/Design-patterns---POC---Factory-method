package com.bigworks.log.console;

import com.bigworks.log.LogPrinter;

public class ConsoleLogPrinter implements LogPrinter {
		
	
	public ConsoleLogPrinter() {
	}
	
	@Override
	public void print(String message) {
		java.util.Date date = new java.util.Date();
		System.out.println(date.toString() + ' ' + message);
	
	}
}

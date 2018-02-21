package com.bigworks.logger;

import com.bigworks.log.LogPrinter;


public abstract class Logger {

	protected abstract LogPrinter createLogger(); 
	
	public boolean log(String message) {
		
	    createLogger().print(message);
				
		return true;
		
	}
	
}

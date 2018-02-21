package com.bigworks.log.console;

import com.bigworks.log.LogPrinter;
import com.bigworks.logger.Logger;

public class ConsoleLogCreator extends Logger{	
	

	public ConsoleLogCreator() {
	}

	@Override
	public LogPrinter createLogger() {
		return new ConsoleLogPrinter();
	}
	

}

package com.bigworks.log.txt;

import com.bigworks.log.LogPrinter;
import com.bigworks.logger.Logger;

public class TXTLogCreator  extends Logger {
	
	
	private String filePath;
	
	public TXTLogCreator(String filePath) {
		this.filePath = filePath;
	}
	
	@Override
	protected LogPrinter createLogger() {
		return new TXTLogPrinter(filePath);
	}

}

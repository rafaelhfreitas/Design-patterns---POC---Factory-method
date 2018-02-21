package com.bigworks.log.xml;

import com.bigworks.log.LogPrinter;
import com.bigworks.logger.Logger;

public class XMLLogCreator extends Logger {
	
	private String filePath;
	
	
	public XMLLogCreator(String filePath) {
		this.filePath = filePath;
	}
	
	@Override
	protected LogPrinter createLogger() {
		return new XMLLogPrinter(filePath);
	}

}


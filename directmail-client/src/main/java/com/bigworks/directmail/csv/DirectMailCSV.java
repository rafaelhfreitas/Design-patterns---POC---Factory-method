package com.bigworks.directmail.csv;

import com.bigworks.contact.Contacts;
import com.bigworks.directmail.DirectMail;

public class DirectMailCSV  extends DirectMail{
	
	
	private String fileName;
	
	public DirectMailCSV(String fileName) {
		this.fileName = fileName;	
	}

	@Override
	protected Contacts createContacts() {
		return new ContactsCSV(fileName);
	}

}

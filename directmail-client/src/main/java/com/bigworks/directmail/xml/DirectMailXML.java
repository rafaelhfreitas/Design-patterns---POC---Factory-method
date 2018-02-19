package com.bigworks.directmail.xml;

import com.bigworks.contact.Contacts;
import com.bigworks.directmail.DirectMail;

public class DirectMailXML extends DirectMail{

	private String fileName;
	
	public DirectMailXML(String fileName) {
		this.fileName = fileName;	
	}

	@Override
	protected Contacts createContacts() {
		return new ContactsXML(fileName);
	}
	
}

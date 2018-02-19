package com.bigworks.directmail.xml;

import java.net.URL;
import java.util.List;

import com.bigworks.contact.Contact;
import com.bigworks.contact.Contacts;
import com.thoughtworks.xstream.XStream;

public class ContactsXML implements Contacts{

	
    private String fileName;
	
	public ContactsXML(String fileName) {
	    this.fileName = fileName;
    }
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Contact> all() {
		
		XStream xstream = new XStream();
	    xstream.alias("contacts", List.class);
	    xstream.alias("contact", Contact.class);
	    
	    URL file = this.getClass().getResource("/" + fileName);
	    return (List<Contact>) xstream.fromXML(file);
	}

}

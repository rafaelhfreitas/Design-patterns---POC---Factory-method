package com.bigworks.directmail;

import java.util.List;

import com.bigworks.contact.Contact;
import com.bigworks.contact.Contacts;

public abstract class DirectMail {
		
	protected abstract Contacts createContacts(); 
			
	public boolean sentEmail(String message) {
				
		List<Contact> contacts = createContacts().all();
					
		System.out.println("Connecting in to the server of SMTP....");
		System.out.println("Message to send " + message);
		System.out.println();
					
		for (Contact contatc: contacts) {
			System.out.println("from <contato@bigworks.com>");
			System.out.printf("To: [%s] <%s>\n", contatc.getName(), contatc.getEmail());
			System.out.println(message);
			System.out.println();
		}
			
		return true;
		
	}

}

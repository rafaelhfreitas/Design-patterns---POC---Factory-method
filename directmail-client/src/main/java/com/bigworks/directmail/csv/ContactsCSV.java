package com.bigworks.directmail.csv;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import com.bigworks.contact.Contact;
import com.bigworks.contact.Contacts;

import au.com.bytecode.opencsv.CSVReader;

public class ContactsCSV implements Contacts{
	
	
	private String fileName;
	
	public ContactsCSV(String fileName) {
		this.fileName = fileName;
	}
	
	@Override
	public List<Contact> all() {
		List<Contact> contacts = new ArrayList<>();
		CSVReader csvReader = null;
		
		try {
			URI uri = this.getClass().getResource("/" + fileName).toURI();
			File fileCsv = new File(uri);
			FileReader fileReader = new FileReader(fileCsv);
			csvReader = new CSVReader(fileReader);
		    String [] nextLine;
		    
		    while ((nextLine = csvReader.readNext()) != null) {
		    	contacts.add(new Contact(nextLine[0].trim(), nextLine[1].trim()));
		    }
		} catch (Exception e) {
			throw new RuntimeException("Error reading file CSV", e);
		} finally {
			try {
	            csvReader.close();
            } catch (IOException e) { }
		}
		
		return contacts;
	}

}

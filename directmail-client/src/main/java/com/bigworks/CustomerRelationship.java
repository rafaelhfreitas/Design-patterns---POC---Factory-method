package com.bigworks;

import javax.swing.JOptionPane;

import com.bigworks.directmail.DirectMail;
import com.bigworks.directmail.csv.DirectMailCSV;
import com.bigworks.directmail.xml.DirectMailXML;

public class CustomerRelationship {
	
	
	public static void main(String[] args) {

		DirectMail directMail = new DirectMailCSV("contacts.csv");
		String message = JOptionPane.showInputDialog(null, "Type your e-mail message:");
		
		boolean status = directMail.sentEmail(message);
		
		JOptionPane.showMessageDialog(null,"E-mails enviados:" + status);
		
		
		DirectMail directMailXML = new DirectMailXML("contacts.xml");
        String messageXML = JOptionPane.showInputDialog(null, "Type your e-mail message:");
		
		boolean statusXML = directMailXML.sentEmail(messageXML);
		
		JOptionPane.showMessageDialog(null,"E-mails enviados:" + statusXML);
		 
	}

}

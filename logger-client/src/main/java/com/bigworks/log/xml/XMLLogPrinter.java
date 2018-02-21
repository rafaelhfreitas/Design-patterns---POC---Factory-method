package com.bigworks.log.xml;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.bigworks.log.LogPrinter;

public class XMLLogPrinter implements LogPrinter{

	
    private String filePath;

    public XMLLogPrinter(String filePath) {
        this.filePath = filePath;
    }
	
	public XMLLogPrinter() {

	}
	
	@Override
	public void print(String message) {
				
     	//criação do arquivo xml para gerar o log
		 try {

				DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

				// root elements
				Document doc = docBuilder.newDocument();
				Element rootElement = doc.createElement("LOG");
				doc.appendChild(rootElement);

				// staff elements
				Element date = doc.createElement("date");
				java.util.Date data = new java.util.Date();
				date.setAttribute("date", data.toString());
				rootElement.appendChild(date);
				
				
				// staff elements
				Element erro = doc.createElement("erro");		
				erro.setAttribute("erro", message);
				rootElement.appendChild(erro);				
				
									

				// write the content into xml file
				TransformerFactory transformerFactory = TransformerFactory.newInstance();
				Transformer transformer = transformerFactory.newTransformer();
				DOMSource source = new DOMSource(doc);
				StreamResult result = new StreamResult(new File(filePath));

				// Output to console for testing
				// StreamResult result = new StreamResult(System.out);

				transformer.transform(source, result);

			  } catch (ParserConfigurationException pce) {
				pce.printStackTrace();
			  } catch (TransformerException tfe) {
				tfe.printStackTrace();
			  }
			}
		
	}
	

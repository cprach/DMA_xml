package edu.computerpower.student.xmlserverdata;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

public class Start {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		
		DeserializeServerDataXML d = new DeserializeServerDataXML();
		try {
			d.deserialize3();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

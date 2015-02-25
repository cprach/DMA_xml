package com.cp.dma.xml;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

public class Start {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		
		DeserializeServerDataXML d = new DeserializeServerDataXML();
		d.deserialize();
		
	}

}

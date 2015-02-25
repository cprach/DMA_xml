package com.cp.dma.xml;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DeserializeServerDataXML {
	
	public void deserialize() throws ParserConfigurationException, SAXException, IOException {

		File f = new File("playerdataxml.xml");
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse(f);

		List<Player> playerList = new ArrayList<Player>();
		NodeList nodeList = document.getDocumentElement().getChildNodes();

		for (int i = 0; i < nodeList.getLength(); i++) {

			Node node = nodeList.item(i);

			if (node.getNodeType() == Node.ELEMENT_NODE) {

				Element topElement = (Element) node;
			
				String server = node.getAttributes().getNamedItem("id").getNodeValue();
				System.out.println("server: " + server);

				String region = topElement.getElementsByTagName("region").item(0).getChildNodes().item(0).getNodeValue();
				System.out.println("region: " + region);
				
				String servername = topElement.getElementsByTagName("servername").item(0).getChildNodes().item(0).getNodeValue();
				System.out.println("servername: " + servername);
				
				//////////////// HERE
								
//				List<Integer> elements = new ArrayList<Integer>();
//			      NodeList children = topElement.getElementsByTagName("previousscore");
//			     
//
//			      for(int j = 0; j < children.getLength(); j++) {
//			    	  Node childNode = children.item(j);
//  	  				  elements.add( Integer.parseInt(childNode.getChildNodes().item(0).getNodeValue()) );
//			      }
//				playerList.add(new Player(player, highScore, elements));

			}

		}

	}

	
	
	
//	public void deserialize() throws ParserConfigurationException, SAXException, IOException {
//
//		File f = new File("playerdataxml.xml");
//		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//		DocumentBuilder builder = factory.newDocumentBuilder();
//		Document document = builder.parse(f);
//
//		List<Player> playerList = new ArrayList<Player>();
//		NodeList nodeList = document.getDocumentElement().getChildNodes();
//
//		for (int i = 0; i < nodeList.getLength(); i++) {
//
//			Node node = nodeList.item(i);
//
//			if (node.getNodeType() == Node.ELEMENT_NODE) {
//
//				Element topElement = (Element) node;
//			
//				String player = node.getAttributes().getNamedItem("username").getNodeValue();
//				System.out.println("player: " + player);
//
//				int highScore = Integer.parseInt(topElement.getElementsByTagName("highScore").item(0).getChildNodes().item(0).getNodeValue());
//				System.out.println("highScore: " + highScore);
//								
//				List<Integer> elements = new ArrayList<Integer>();
//			      NodeList children = topElement.getElementsByTagName("previousscore");
//
//			      for(int j = 0; j < children.getLength(); j++) {
//			    	  Node childNode = children.item(j);
//  	  				  elements.add( Integer.parseInt(childNode.getChildNodes().item(0).getNodeValue()) );
//			      }
//				playerList.add(new Player(player, highScore, elements));
//
//			}
//
//		}
//
//	}

}

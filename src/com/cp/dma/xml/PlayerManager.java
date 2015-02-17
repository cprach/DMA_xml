package com.cp.dma.xml;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class PlayerManager {
	
	public String readData() {
		File f = new File("playerdataxml.txt");
		try {
			Reader r = new FileReader(f);
			StringBuilder sb = new StringBuilder();
			int i = 0;
			while ((i = r.read()) != -1) {
				char c = (char)i;
				sb.append(c);
			}
			r.close();
			return sb.toString();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

	public void myxml() throws ParserConfigurationException, SAXException, IOException {

		//File f = new File("txtPlayerDataXML");
		//String s = readData();
		
		File f = new File("playerdataxml.txt");


		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		DocumentBuilder builder = factory.newDocumentBuilder();



		// Load the input XML document, parse it and return an instance of the

		// Document class.

		Document document = builder.parse(f);



		List<Player> playerList = new ArrayList<Player>();

		NodeList nodeList = document.getDocumentElement().getChildNodes();

		for (int i = 0; i < nodeList.getLength(); i++) {

			Node node = nodeList.item(i);
			
			System.out.println("node name: " + node.getNodeName() + "" + i);



			if (node.getNodeType() == Node.ELEMENT_NODE) {

				Element elem = (Element) node;
				
				System.out.println("elem node name: " + elem.getNodeName());




				// Get the value of the ID attribute.

				String player = node.getAttributes().getNamedItem("player").getNodeValue();



				// Get the value of all sub-elements.

//				String userName = elem.getElementsByTagName("userName")
//
//						.item(0).getChildNodes().item(0).getNodeValue();



				int highScore = Integer.parseInt(elem.getElementsByTagName("highScore").item(0)

						.getChildNodes().item(0).getNodeValue());


//				playerList.add(new Player(userName, highScore));
				playerList.add(new Player(player, highScore));


			}

		}

	}


}

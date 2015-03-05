package edu.computerpower.student.xmlserverdata.serverobjects1;

import java.io.File;
import java.io.IOException;
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

	public void myxml() throws ParserConfigurationException, SAXException, IOException {

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
			
				String player = node.getAttributes().getNamedItem("username").getNodeValue();
				System.out.println("player: " + player);

				int highScore = Integer.parseInt(topElement.getElementsByTagName("highscore").item(0).getChildNodes().item(0).getNodeValue());
				System.out.println("highscore: " + highScore);
								
				List<Integer> elements = new ArrayList<Integer>();
			      NodeList children = topElement.getElementsByTagName("previousscore");

			      for(int j = 0; j < children.getLength(); j++) {
			    	  Node childNode = children.item(j);
  	  				  elements.add( Integer.parseInt(childNode.getChildNodes().item(0).getNodeValue()) );
			      }
				playerList.add(new Player(player, highScore, elements));

			}

		}

	}


}

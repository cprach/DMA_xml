package edu.computerpower.student.xmlserverdata.serverobjects1;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class Server {
    @XmlAttribute(name="id")
	private int id;
	private String region;
	private String servername;
    @XmlElementWrapper(name="players")
    @XmlElement(name="player")
	private List<Player> players = new ArrayList<Player>();

	public Server() {
	}

	public Server(int id, String region, String serverName, List<Player> players) {
		setId(id);
		setRegion(region);
		setServerName(serverName);
		setPlayers(players);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getServerName() {
		return servername;
	}

	public void setServerName(String servername) {
		this.servername = servername;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

}

package com.cp.dma.xml;

import java.util.ArrayList;
import java.util.List;


public class Server {

	private int id;
	private String region;
	private String serverName;
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
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}


}

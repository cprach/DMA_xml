package edu.computerpower.student.xmlserverdata.serverobjects2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name="servers")
@XmlAccessorType(XmlAccessType.FIELD)
public class ServerManager {
	private List<Server> server = new ArrayList<Server>();
	
	public ServerManager() {
		
	}
	
	public ServerManager(List<Server> servers) {
		setServers(servers);
	}

	public List<Server> getServers() {
		return server;
	}

	public void setServers(List<Server> servers) {
		this.server = servers;
	}
}

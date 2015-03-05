package edu.computerpower.student.xmlserverdata.serverobjects1;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class Player {
    @XmlAttribute(name="username")
	private String username;
	private int highScore;
	private List<Integer> previousscore = new ArrayList<Integer>();

    public Player() {
    }

	public Player(String username, int highScore, List<Integer> previousScores) {
		setUsername(username);
		setHighScore(highScore);
		setPreviousScores(previousScores);
	}

	public String getUsername() {
		return username;
	}

    public void setUsername(String username) {
		this.username = username;
	}

    public int getHighScore() {
		return highScore;
	}

    public void setHighScore(int highScore) {
		this.highScore = highScore;
	}

    public List<Integer> getPreviousScores() {
		return previousscore;
	}

    public void setPreviousScores(List<Integer> previousScores) {
		this.previousscore = previousScores;
	}
}
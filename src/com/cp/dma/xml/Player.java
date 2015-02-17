package com.cp.dma.xml;

import java.util.ArrayList;
import java.util.List;

public class Player {

	private String userName;
	private int highScore;
	private List<Integer> previousScores = new ArrayList<Integer>();

	public Player(String userName, int highScore, List<Integer> previousScores) {
		setUserName(userName);
		setHighScore(highScore);
		setPreviousScores(previousScores);
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getHighScore() {
		return highScore;
	}
	public void setHighScore(int highScore) {
		this.highScore = highScore;
	}
	public List<Integer> getPreviousScores() {
		return previousScores;
	}
	public void setPreviousScores(List<Integer> previousScores) {
		this.previousScores = previousScores;
	}
	

}

package com.cp.dma.xml;

public class Player {
	
	private String userName;
	private int highScore;
	
	
	
	public Player(String userName, int highScore) {
		this.userName = userName;
		this.highScore = highScore;
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
	
	

}

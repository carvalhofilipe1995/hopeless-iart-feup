package logic;

import java.awt.Rectangle;

public class Block extends Rectangle {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int positionX;
	private int positionY;
	
	public Block(int x, int y) {
		this.positionX = x;
		this.positionY = y;
	}
	
	
	public int getPositionX() {
		return positionX;
	}


	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}
	
	public int getPositionY() {
		return positionY;
	}


	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}
	
	
}

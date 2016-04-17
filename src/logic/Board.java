package logic;

public class Board {
	
	private int[][] board;
	private int width;
	private int height;
	private int difficulty;
	
	public Board(int dif){
		
		this.width = 20;
		this.height = 10;
		this.board = new int[height][width];
		this.difficulty = dif;
		
	}
	
	public int[][] generateBoard(){
		
		int i,j;
		
		for (i = 0; i < height; i++) {
			int[] row = null;
			for (j = 0; j < width; j++) {
				row[j+1] = (int) (Math.floor(Math.random()*difficulty) + 1);
			}
			board[i+1] = row;
		}
		
		return board;
	}
	
	public void blocksFallDown(){
		
	}
	
	public void moveColumn(){
		
	}

}
package boardgame;

import chess.ChessPiece;

public class Board {
	
	
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	public Board(int row, int columns) {
		super();
		this.rows= row;
		this.columns = columns; 
		pieces = new Piece[rows] [columns];
		
		
		
		
	}

	public int getColumns() {
		// TODO Auto-generated method stub
		return 0;
	}

	public ChessPiece piece(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getRows() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}

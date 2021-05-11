package boardGame;

public class Piece {
	
	//Será apenas posição temporária na matriz; 
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}

	
	
	
	
	
	
	
}

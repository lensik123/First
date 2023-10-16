package HardTasksModuleFive;

public class TicTacToe {
	private boolean turn = false;
	String[][] array = new String[3][3];
	boolean win = false;

	String whosTurn = "x";

	public TicTacToe() {

		newGame();
	}

	public void newGame() {

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				this.array[i][j] = "-";
			}
		}
	}


	public String[][] getField() {
		return this.array;
	}


	public String checkGame() {


		for (int i = 0; i < 3; i++) {

			if (this.array[i][0].equals(whosTurn) && this.array[i][1].equals(whosTurn) && this.array[i][2].equals(whosTurn)){
				win = true;}
			else if (this.array[0][i].equals(whosTurn) && this.array[1][i].equals(whosTurn) && this.array[2][i].equals(whosTurn)){
				win = true;}
			if (win == true) return whosTurn;
		}

		if (this.array[0][2].equals(whosTurn) && this.array[1][1].equals(whosTurn) && this.array[2][0].equals(whosTurn)) {
			win = true;
			return whosTurn;
		} else if (this.array[0][0].equals(whosTurn) && this.array[1][1].equals(whosTurn) && this.array[2][2].equals(whosTurn)) {
			win = true;
			return whosTurn;
		}


		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (array[i][j].equals("-")) return null;
			}
			if (win == true) return whosTurn;
		}

		return "D";
	}



	public String makeMove(int x, int y) {

		turn = !turn;
		if (turn == true) {
			whosTurn = "X";
		}
		else {
			whosTurn = "0";
		}

		if (win == true){
			turn = !turn;
			return "Game was ended";
		}

		if (checkGame() == null) {
				this.array[x - 1][y - 1] = whosTurn;
				if(checkGame() == whosTurn){return "Player " + whosTurn + " won";}
				else if(checkGame() != null && checkGame().equals("D")){return "Draw";}
				else return "Move completed";
		}


		return "Cell " + x + ", " + y + " is already occupied";
	}
}

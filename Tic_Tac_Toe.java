import java.util.Scanner;

public class Tic_Tac_Toe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[][] board = new char[3][3];
		
		for(int row = 0; row<board.length; row++) {
			for(int col=0;col<board[row].length; col++) {
				board[row][col] = ' ';
			}
		}
		
		char player = 'X';
		boolean gameover = false;
			
		Scanner sc = new Scanner(System.in);
		
		while(!gameover) {
			printBoard(board);
			System.out.println("Player" + player + "enter: ");
			int row = sc.nextInt();
			int col = sc.nextInt();
			
			if(board[row][col] == ' ') {
				board[row][col] = player;
				gameover = haveown(board, player);
				if(gameover) {
					System.out.println("player" + player + "has won:");
				}
				else {
					if(player == 'X') {
						player = 'O';
					}
					else {
						player = 'X';
					}
				}
			}
			else {
				System.out.println("Invalid move. try again!...");
				
			}
			
		}
		printBoard(board);
	} 

	private static boolean haveown(char[][] board, char player) {
		// TODO Auto-generated method stub
		for(int row = 0; row<board.length; row++) {
			if(board[row][0] == player && board[row][1] == player && board[row][2] == player ) {
			 return true;
			}
		}
		
		for(int col= 0; col<board.length; col++) {
			if(board[0][col] == player && board[0][col] == player && board[2][col] == player ) {
			 return true;
			}
		}
		
		//Diagonally 
		if(board[0][0] == player && board[1][1] == player && board[2][2] == player ) {
			 return true;
			}
				
		if(board[0][2] == player && board[1][1] == player && board[2][0] == player ) {
			 return true;
			}
			
		
		return false;
	}

	public static void printBoard(char[][] board) {
		// TODO Auto-generated method stub
		for(int row = 0; row<board.length; row++) {
			for(int col=0;col<board[row].length; col++) {
				System.out.print( board[row][col] + " |");
			}
			System.out.println(" ");
		}
		
		
	}

}

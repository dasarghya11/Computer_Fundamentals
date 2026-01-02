
public class NQueens{
	static boolean isSafe(int row, int col, int[][] board, int N){
		int i,j;

		//Check this column on the uppper side
		for(i = 0; i < row; i++){
			if(board[i][col] == 1)
				return false;
		}

		//Check upper diagonal left side
		for(i = row, j = col ; i >= 0 && j >= 0; i--,j--){
			if(board[i][j] == 1)
				return false;
		}

		//Check upper diagonal right side
		for(i = row, j = col; i >= 0 && j < N; i--, j++){
			if(board[i][j] == 1)
				return false;
		}
		return true;
	}

 static boolean solveNQ(int row, int nQueens, int N, int[][] board){
	if(nQueens == 0)
	    return true;
       // return false;

	for(int col = 0; col < N; col++){
		if(isSafe(row,col,board,N)){
			board[row][col] = 1;
			if(solveNQ(row + 1,nQueens - 1, N,board))
				return true;
			board[row][col] = 0; //Backtracking [Put + Recursion + undo]
		}
	}
	return false;
 }
 public static void main(String args[]){

	int N = 4;    // board size 4 * 4

	int[][] board = new int[N][N]; // Creating 2d array;

	solveNQ(0,N,N,board);		// calling the function

	for(int i = 0; i < N; i++){			// Printing the final outcome
		for(int j = 0; j < N; j++){
			System.out.print(board[i][j] + "\t");
		
		}
			System.out.println();
	  }
  }
}
OUTPUT :: 

  0       1       0       0
  0       0       0       1
  1       0       0       0
  0       0       1       0


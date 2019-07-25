package net.mahtabalam.maze2;

public class Maze {

	private int[][] maze;
	private int[][] solutionMatrix;
	private int mazeSize;

	public Maze(int[][] maze) {
		this.maze = maze;
		this.mazeSize = maze.length;
		this.solutionMatrix = new int[this.mazeSize][this.mazeSize];
	}

	public void solveMaze() {
		if (solve(0, 0) ) {
			printResult();
		} else {
			System.out.print("No feasible solution found...");
		}
	}

	public boolean solve(int x, int y) {
		if ( checkBaseCase(x, y)) {
			return true;
		}
		
		if( isValidMove(x, y) && solutionMatrix[x][y] == 1 ) {
			return false;
		}
		
		if ( isValidMove(x, y) && this.maze[x][y] == 1 ) {
			solutionMatrix[x][y] = 1; 

			// Try going Right
			if (solve(x, y+1)){  
				return true;  
			}
			
			// Try going Down
			if (solve(x+1, y)) {
				return true;
			}
			
            // Try going Left
			if(solve(x, y-1)) {
				return true;
			}
			
			// BACKTRACK !!!
			solutionMatrix[x][y] = 0; 
		}

		return false;
	}
	
	

	public boolean checkBaseCase(int x, int y){
		
		if (x == this.mazeSize - 1 && y == this.mazeSize - 1 && this.maze[x][y] == 1) {
			solutionMatrix[x][y] = 1;
			return true;
		}
		return false;
	}
	
	public boolean isValidMove(int x, int y) {
		if( x<0 || x >= this.mazeSize || y<0 || y >= this.mazeSize) {
			return false;
		}
		return true;
	}

	public void printResult() {
		
		for (int i = 0; i < this.mazeSize; i++) {
			for (int j = 0; j < this.mazeSize; j++){
				if( this.solutionMatrix[i][j] == 1 ){
					System.out.print(" * ");
				}else{
					System.out.print(" - ");
				}
			}
				
		  System.out.println();
		}
	}
}

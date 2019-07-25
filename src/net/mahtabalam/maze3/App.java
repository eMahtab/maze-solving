package net.mahtabalam.maze3;

public class App {

	public static void main(String[] args) {
		
		int maze[][] = { { 1, 0, 1, 1, 1}, 
						 { 1, 1, 1, 0 ,1}, 
						 { 0, 0, 0, 0, 1}, 
					     { 0, 0, 0, 0, 1},
					     { 0, 0, 0, 0, 1}
					   };
		
		Maze mazeInstance = new Maze(maze);
		mazeInstance.solveMaze();
		
	}
}
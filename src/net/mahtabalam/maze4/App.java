package net.mahtabalam.maze4;

public class App {

	public static void main(String[] args) {
		
		int maze[][] = { { 1, 0, 1, 1, 1}, 
						 { 1, 1, 1, 0 ,1}, 
					     { 0, 0, 1, 0, 1}, 
					     { 0, 1, 1, 0, 0},
						 { 1, 1, 0, 0, 0}
					   };
		
		int maze2[][] = { { 0, 0, 1, 1, 1}, 
				 		  { 1, 1, 1, 0 ,1}, 
				 		  { 1, 1, 0, 0, 1}, 
				 		  { 0, 1, 1, 0, 0},
				 		  { 1, 1, 1, 0, 0}
			   		    };
		
		Maze mazeInstance = new Maze(maze);
		mazeInstance.solveMaze();	
	}
}
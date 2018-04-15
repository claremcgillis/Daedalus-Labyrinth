  /**
Pre condition: given a text file with a maze and placement of explorer

Post condition: returns a boolean value of whether there is a solution 
to the maze starting at a designated beginning, ending at the treasure
without reaching any stepping stone more than once.

*/
public class MazeSolver {
	private boolean isMazeSolved;
    public Maze inProgress; // explorer moves on this
    private final int[] DIRECTIONS = { inProgress.EAST,inProgress.NORTH, inProgress.SOUTH, inProgress.WEST};
	
	
	public MazeSolver(String sourceFilename, int explorerRank, int explorerFile) throws java.io.FileNotFoundException{ 
  		 
  		inProgress = new Maze(sourceFilename, explorerRank, explorerFile);
	}

	public boolean getIsMazeSolved() {
		return isMazeSolved;
	}
	
	public String toString() {
		return inProgress.toString();
	}

  public boolean pathFinder(Maze inProgress) {
	System.out.println(inProgress);
	if (inProgress.explorerIsOnA() == inProgress.TREASURE)  // Explorer on treasure
      		return true;
  	else if (inProgress.explorerIsOnA() == inProgress.WALL) // Explorer in a wall 
	  {
 	 }
  	else if (inProgress.explorerIsOnA() == inProgress.STEPPING_STONE) // Explorer is on a stepping stone 
         {
  		Maze lastSnap = new Maze(inProgress);
  		for (int numDir : DIRECTIONS) {
			inProgress = new Maze(lastSnap);
    		  	inProgress.dropA(inProgress.WALL); // makes the stepping stone a wall
     		 	inProgress.go(numDir);
      			if (pathFinder(inProgress) == true) return true;
		}
	  }
return false;  
  }

      
      
}
    

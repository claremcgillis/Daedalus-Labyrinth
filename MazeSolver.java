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
	private int numPaths;
	
	public MazeSolver(String sourceFilename, int explorerRank, int explorerFile) throws java.io.FileNotFoundException{ 
  		 
  		inProgress = new Maze(sourceFilename, explorerRank, explorerFile);
		System.out.println(pathFinder(inProgress));
		System.out.println(numPaths);
	}

	public boolean getIsMazeSolved() {
		return isMazeSolved;
	}
	
	public String toString() {
		return inProgress.toString();
	}
	
	public int getNumPaths(){
		return numPaths;
	}

  public boolean pathFinder(Maze inProgress) {
	// outputs true if the explorer is able to find a path to the treasure. In the works of counting the number of paths to the treasure.
	//System.out.println(inProgress);
	if (inProgress.explorerIsOnA() == inProgress.TREASURE)  // Explorer on treasure
		{//System.out.println("Found a treasure!");
		 numPaths++;
		return true;}
  	else if (inProgress.explorerIsOnA() == inProgress.WALL) // Explorer in a wall 
	  {return false;}
  	else if (inProgress.explorerIsOnA() == inProgress.STEPPING_STONE) // Explorer is on a stepping stone 
         {
  		Maze lastSnap = new Maze(inProgress);
  		for (int numDir : DIRECTIONS) {
			inProgress = new Maze(lastSnap);
    		  	inProgress.dropA(inProgress.WALL); // makes the stepping stone a wall
     		 	inProgress.go(numDir);
      			if (pathFinder(inProgress) == true) {
				//System.out.println("incrementing numPaths... ");
				//numPaths++;
				//System.out.println("numPaths after increment: " + numPaths);
			}
		}
	  } 
	 if(numPaths == 0) return false;
	  else{
		return true;
	  }

      
      
	}
    
}

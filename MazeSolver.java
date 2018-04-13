/**
Pre condition: given a text file with a maze and placement of explorer

Post condition: returns a boolean value of whether there is a solution 
to the maze starting at a designated beginning, ending at the treasure
without reaching any stepping stone more than once.

*/
public class MazeSolver {
	private boolean isMazeSolved;
	public Maze inProgress;
	
	
	public MazeSolver(String sourceFilename, int explorerRank, int explorerFile) throws java.io.FileNotFoundException{ 
  		 
  		inProgress = new Maze(sourceFilename, explorerRank, explorerFile);
	}

	public boolean getIsMazeSolved() {
		return isMazeSolved;
	}
	
	public String toString() {
		return inProgress.toString();
	}

  public void pathFinder() {
  	
	if (inProgress.explorerIsOnA() == 0)  // Explorer on treasure
	    {
      isMazeSolved = true;
      break;
      }
  else if (inProgress.explorerIsOnA() == 1) // Explorer in a wall {
  		inProgress = lastSnap;
  }
  else if (inProgress.explorerIsOnA() == 2) // Explorer is on a stepping stone {
  		Maze lastSnap = new Maze(inProgress);
  		for (int i = 0; i < 4; i++) {
      	inProgress.dropA(1); // makes the stepping stone a wall
      	inProgress.go(Math.exp(2,i));
        inProgress.pathFinder();
      }
  }
  }
      
      
    }
    

}

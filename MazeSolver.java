
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
		pathFinder();
	}

	public boolean getIsMazeSolved() {
		return isMazeSolved;
	}
	
	public String toString() {
		return inProgress.toString();
	}

    public void pathFinder() {
	if (inProgress.explorerIsOnA() == 0) { // Explorer on treasure
	    isMazeSolved = true;
		System.out.println(isMazeSolved);
	}
    }
    

}

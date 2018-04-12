[0]/** 
tests MazeSolver
Command line requires the file path of the text file which contains the maze.
*/
public class UserOfMazeSolver {
  public static void main(String[] commandLine) {
              
      MazeSolver testingMaze = new MazeSolver(commandLine[0],
      																				Integer.parseInt( commandLine[1]), 
                                              Integer.parseInt( commandLine[2])
                                              );
      System.out.println( testingMaze + System.lineSeparator());
      }
                                              
}

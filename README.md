# Personnel
   Clare McGillis and Audrey Soo

# Problem:
   To find one path through a maze starting at a designated beginning ending at the treasure without reaching any stepping       
   stone more than once.
   
   [EDIT] Returns a solution that represents a path through the maze starting at a designated beginning, ending at the treasure without reaching any stepping stone more than once.
   
# Recursive Abstraction
   When I am asked to 
   find one path through a maze starting at a designated beginning ending at the treasure without reaching any stepping stone more than once,
      
   The recursive abstraction can
     find one path through a maze starting one step further from the start ending at the treasure without reaching any stepping stone more than once

[EDIT] 
When I am asked to 
   find one path that takes n steps through a maze starting at a designated beginning ending at the treasure without reaching any stepping stone more than once,
      
   The recursive abstraction can
     find one path that takes n - 1 steps through a maze starting one step further from the start ending at the treasure without reaching any stepping stone more than once

# Base Case
   When there is nowhere else to go
   
   [EDIT] When the explorer has reached the treasure or is in a wall.

# English or pseudocode description of algorithm
   if explorer is on a valid stepping stone:
   move in all directions possible (up, down, left, right)
   
   if person is not at a dead end (on a valid stepping stone, but cant make another step)
   
      invoke abstraction
      
   move back

# class(es), with fields and methods
   user class
      moveTest() // moves the explorer and tests the legality of the move
      dropTest() // 
   maze class
      explorer
      treasure
      walls
      directions (north, east, south, west)
      move() // moves explorer
      checkIfLegal() // is move legal?
      changingthepath() // changes the element in the position the explorer is on
   maze solver class
   
   displayer
      
   

# version *n* wish list
   - All possible paths to the treasure
   - The shortest path to the treasure
   - Reach multiple treasures?
# version *0* wishlist
   check for if a move is possible -- boolean
   array of moves represented by integers
   integer representing how many moves done
   
   Types of paths:
   - straight line
   - simple one way path
   - paths that have loops
   

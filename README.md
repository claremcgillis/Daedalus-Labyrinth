# Maze-Runners
# Personnel
   Clare McGillis and Audrey Soo

# Definition of a Maze:
   maze grid with barriers
   
# Problem:
   To find one path through a maze starting at a designated beginning ending at the treasure without reaching any stepping       
   stone more than once.
  
# Recursive Abstraction
   When I am asked to 
   find one path through a maze starting at a designated beginning ending at the treasure without reaching any stepping stone more than once,
      
   The recursive abstraction can
     find one path through a maze starting one step closer to the treasure ending at the treasure without reaching any stepping stone more than once

# Algorithm
   move in all directions possible
   if person is not at a dead end
      invoke abstraction
   move back
   
# version *0* wishlist
   check for if a move is possible -- boolean
   array of moves represented by integers
   integer representing how many moves done

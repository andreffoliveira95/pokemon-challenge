# pokemon-challenge

This is my solution to Premium Minds Pokemon Challenge.

-- FEW CONSIDERATIONS --

1) You need to have at least Java 11 in order for the program to run.

2) Since this is a Maven poject, you need to run the following commands in the terminal on the projects folder:
   
   mvn clean -> in case you want to delete an already existing build.
   mvn package -> this will compile the code and create a packaged JAR.
   java -cp .\target\PokemonApp-1.0-SNAPSHOT.jar org.pokemon.Main -> this will execute the program.
   
   You can copy & paste the commands from down below: 
   
   mvn clean
   mvn package
   java -cp target/PokemonApp-1.0-SNAPSHOT.jar org.pokemon.Main
   


-- IMPORTANT NOTE ABOUT THE PROJECT --   

I was indecisive to choose between using an ArrayList or a LinkedList to store all visited houses/positions but I chose to go with an ArrayList for the following reasons:

1) Usually LinkedList is better to an ArrayList for adding elements in a specific position since an ArrayList is indexed. 
   That means that if we add an element to a specific index in an ArrayList, all of the elements to its right needs to be shifted which can be less performant.
   In this case, every new position is added at the final of the ArrayList. So the above statment doesn't apply.
   
2) The way positions are stored in the the ArrayList is:
   
   -> even numbers, including 0 : x-position
   -> odd numbers, excluding 0 : y-position
   
   Example: 
   
   ArrayList = (3, 2)
   
   Only one position is stored:
   2 -> x-position
   3 -> y-position
   
3) To be more performant, instead of going through every element (i++), we go throught every even numbers (i+=2). 
   Which means for an ArrayList of N size, there are N/2 iterations -> O(n/2)  

4) To store the positions into a LinkedList I would have to create a new Class (e.g. Position) that stored x and y positions which could lead to performance issues if    a lot of positions (and so, class Position instances and going through all of them) are added to LinkedList when compared to adding integer which is a primitive        data type.
   
   
   
 -- THANK YOU! --

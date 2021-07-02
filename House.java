// Constructor Chaining

public class House {

    // instance variables of the class
    private int numOfRooms;
    private int numOfDoors;
    private int numOfWindows;

    // Creating a new parameterless Constructor
    public House(){
        this(1);                // Will call the constructor having single argument
    }
    
    public House(int numOfRooms){
        this(numOfRooms, 10);           // Will call the constructor having 2 arguments
    }

    public House(int numOfRooms, int numOfDoors){
        this(numOfRooms, 10, 100);           // Will call the constructor having 3 arguments
    }

    public House(int numOfRooms, int numOfDoors, int numOfWindows){
        this.numOfRooms = numOfRooms;
        this.numOfDoors = numOfDoors;
        this.numOfWindows = numOfWindows;
    }

    // Override the toString method
    @Override
    public String toString(){
        return "House with parameters : " + this.numOfRooms + "-" + this.numOfDoors + "-" + this.numOfWindows;
    }
}

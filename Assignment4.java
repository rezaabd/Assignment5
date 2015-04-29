/**
* Room class is used for creating a new room object
*
* Example:
* Room anotherRoom = new Room();
* anotherRoom.setWhichRoom("Another room");
* anotherRoom.setColorOfWalls("yellow");
* anotherRoom.setNumberOfWindows(1);
* anotherRoom.setFlooringType("hardwood");
* System.out.println(anotherRoom);
*
* @author Reza Abdollahi
*
*/
public class Assignment4 {
// Attributes
private String colorOfWalls;
private int numberOfWindows;
private String flooringType;
private String whichRoom;
/**
* This is a constructor that does not take any other input argument.
* Initializes the Room values to default.
*/
public Assignment4(){
this.whichRoom = "My room";
this.colorOfWalls = "red";
this.numberOfWindows = 2;
this.flooringType = "carpet";
}
/**
* This constructor takes input argument.
* Initializes the Room values
* @param whichRoom
* @param colorOfWalls
* @param numberOfWindows
* @param flooringType
*/
public Assignment4( String whichRoom, String colorOfWalls, int numberOfWindows, String flooringType){
this.whichRoom= whichRoom;
this.colorOfWalls = colorOfWalls;
this.numberOfWindows = numberOfWindows;
this.flooringType = flooringType;
}
/**
* A method to get a particular room
* @return a specific room in the house
*/
public String getWhichRoom(){
return this.whichRoom;
}
/**
* A method to set a distinct room
* @param a determined room in the house in string type
*/
public void setWhichRoom(String whichRoom){
this.whichRoom = whichRoom;
}
/**
* A method to get the color of the walls
* @return an explicit color for the room walls
*/
public String getColorOfWalls(){
return this.colorOfWalls;
}
/**
* A method to set the color of the walls
* @param a specific color for the room walls in string type
*/
public void setColorOfWalls(String colorOfWalls){
this.colorOfWalls = colorOfWalls;
}
/**
* A method to get the number of windows in the room
* @return the exact number of windows that the room has
*/
public int getNumberOfWindows(){
return this.numberOfWindows;
}
/**
* A method to set the specific number of windows
* @param the precise number of windows for the room in integer type
*/
public void setNumberOfWindows(int numberOfWindows){
this.numberOfWindows = numberOfWindows;
}
/**
* A method to get the floor type for the room
* @return a specific floor type for the room that has been created
*/
public String getFlooringType(){
return this.flooringType;
}
/**
* A method to set the desired floor type in the room
* @param the chosen floor type for the room in string type
*/
public void setFlooringType(String flooringType){
this.flooringType = flooringType;
}
/**
* All getters and setters are combined in this method.
* This method displays all the information for the room in the house
*/
public String toString(){
return this.whichRoom + " has " + this.colorOfWalls + " walls, " + this.numberOfWindows +" windows, and the flooring type is " + this.flooringType+".";
}
}
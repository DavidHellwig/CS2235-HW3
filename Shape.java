//David Hellwig
//Assignment 2
//CS 2235
//Due Date 2/4-2021
public class Shape { // Create a new class called Shape
    protected String name; // Set a protected string, name
    public Shape(){ // Default constructor
        name = "Empty Space";
    };
    public Shape(String username){ // Modular constructor
        name = username;

    }
    //Getter method for name
    public String getName(){return name;}

    //Setter method for name
    public void setName(String newname){this.name = newname;}
}

//David Hellwig
//Assignment 2
//CS 2235
//Due Date 2/4-2021
import javax.naming.Name; // This is a relic of a package conflict
import java.lang.Math; // This lets us do more math
public class Square extends Shape{ // We create a class Square that is a subclass of Shape
    // These are the  protectedvalues that Square will have
    protected Point topLeft;
    protected Point bottomRight;
    public Square(){ // Default constructor
        topLeft.x = 1;
        topLeft.y = 1;
        bottomRight.x = 1;
        bottomRight.y = 1;
    }
    public Square(String userName, Point topLeft, Point bottomRight){ // Modular constructor
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
        this.name = userName;



    }
    // Getter methods for length, height, area and perimeter
    public double getLength(){return Math.abs(Math.sqrt((topLeft.x) * bottomRight.x));}
    public double getHeight(){return Math.abs(Math.sqrt((topLeft.y) * bottomRight.y));}
    public double getArea(){return Math.abs((getHeight()*getHeight())/2);}
    public double getPerimeter(){return Math.abs(getHeight()*2+getLength()*2);}

    }


//David Hellwig
//Assignment 2
//CS 2235
//Due Date 2/4-2021
import java.lang.Math; // Allows more math
public class Circle extends Shape{ // Create a subclass of shape called circle
    protected Point Point;
    protected double Radius;
    public Circle(){ // Default Constructor for circle,the unit circle
        Point.x = 0;
        Point.y = 0;
        Radius = 1;

    }
    public Circle(String userName, Point Point, double Radius){ // Modular Constructor
        this.name = userName;
        this.Point = Point;
        this.Radius = Radius;

    }
    //Getter methods for radius, center,area, circumference and name
    public double getRadius(){return Radius;}
    public int getCenter(){return Point.x + Point.y;}
    public double getArea(){return Math.abs(3.14*(getRadius()*getRadius()));}
    public double getCircumference(){return Math.abs(2*3.14*getRadius());}
    public String getName(){return name;}


}


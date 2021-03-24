//David Hellwig
//Assignment 2
//CS 2235
//Due Date 2/4-2021
public class Point { // Here we create a class called point with protected x and y values as ints
    protected int x;
    protected int y;
    public Point(){ // This is the default constructor
        x = 0;
        y = 0;
    }
    public Point(int a, int b){ // This is the modular constructor
        x = a;
        y = b;
    }
    // These are the getter methods for Points values
    public int getX(){return x;}
    public int getY(){return y;}

    // These are the setter values for the Point values
    public void setX(int NewX){this.x = NewX;}
    public void setY(int NewY){this.y = NewY;}
}

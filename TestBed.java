//David Hellwig
//Assignment 2
//CS 2235
//Due Date 2/4-2021
public class TestBed { // Create a class called TestBed to test the classes
    public static void main(String[] args) { // Creates the program
    Point PointOne = new Point(); // Beginning of tests
    Point PointTwo = new Point(97,-9);
    System.out.print("My first point is "+PointOne.getX() + "\t" + PointOne.getY()+ "\n");

    System.out.print("My second point is "+PointTwo.getX() + "\t" + PointTwo.getY() + "\n");

    PointTwo.setX(2);

    PointTwo.setY(2);

    System.out.print("Point 2 is now "+PointTwo.getX() + "" + PointTwo.getY() + "\n");


    // The point must be changed from default to create productive answers
    PointOne.setX(1);

    PointOne.setY(1);

    //Square Tests
    Square Square1 = new Square("Spaghetti Code",PointOne,PointTwo);

    System.out.print("My square has a length of "+Square1.getLength()+"\n");

    System.out.print("My square has an area of "+Square1.getArea()+"\n");

    System.out.print("My square has a perimeter of "+ Square1.getPerimeter()+"\n");

    //Circle Tests
    Circle Circle1 = new Circle("Meatball",PointOne,10); //Spaghetti code is incomplete without meatball
    System.out.print("We have a circle, " + Circle1.getName()+"\n");

    System.out.print("My circle has a radius of "+Circle1.getRadius()+"\n");

    System.out.print("My circle has an area of "+Circle1.getArea()+"\n");

    System.out.print("My circle has a center at "+Circle1.getCenter()+"\n");

    System.out.print("My circle has a circumference of "+Circle1.getCircumference()+"\n");
    //End of tests
    }
}

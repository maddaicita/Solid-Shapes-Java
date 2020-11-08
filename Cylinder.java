public class Cylinder Extends SolidShape {

    double lenght =1.0; // lenght of the cilinder
    double radius =1.0;// radius of the cilinder

    Cylinder(){} // no-arg constructor that creates a default cube.

    Cylinder(double len, double rad){  // constructor creates a cylinder with the specified data fields

        lenght=len;
        radius=rad;
    }


    // getters and setters for instance variables
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    double getArea(){  // returns the area of this cylinder.


    }

    double getVolume(){ //that returns the volume of this cylinder.


    }


    // toString() // returns a string description for the cylinder.






}

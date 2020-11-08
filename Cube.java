

public class Cube Extends SolidShape{

    double side =1.0; // data field named side with a default value 1.0 to denote one side of the cube

    Cube(){} // no-arg constructor that creates a default cube.

    Cube(double sid){  // constructor that creates a solid shape with the specified color.

        side=sid;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    double getArea(){  // returns the area of this triangle.


    }

    double getVolume(){ //that returns the volume of this cube.


    }


   // toString() // returns a string description for the cube.



}

import java.util.Collection;

//COP2805: Java 2 Programming
//Maday Moya
//Project 1




abstract class SolidShape implements Comparable<Object>{
    String color; //specify the color of the solid shape

    SolidShape(){} // no-arg constructor that creates a default solid shape.

    SolidShape(String col){  // constructor that creates a solid shape with the specified color.

        color=col;
    }

    //The setter and getter methods for the data field.
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    abstract double getArea();
    abstract double getVolume();


    static void max(SolidShape[] shapes){

        if (shapes[0].compareTo(shapes[1]) > 0 && shapes[0].compareTo(shapes[2]) > 0) //cube > cilindro
            System.out.print(" The larger shape is the Cube ");
        else if (shapes[1].compareTo(shapes[0]) > 0 && shapes[1].compareTo(shapes[2]) > 0) //cube < cilindro
            System.out.print(" The larger shape is the Cylinder ");
        else
            System.out.print(" The larger shape is the Sphere ");

    }   //finding the larger of three SolidShape objects.
}


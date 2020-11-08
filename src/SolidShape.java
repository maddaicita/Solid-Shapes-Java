
abstract class SolidShape implements Comparable {
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

    static void max(){    //finding the larger of three SolidShape objects.


    }



}


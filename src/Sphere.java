

//COP2805: Java 2 Programming
//Maday Moya
//Project 1


class Sphere extends SolidShape {

    double radius =1.0; // data field named side with a default value 1.0 to denote one side of the cube

    Sphere(){} // no-arg constructor that creates a default cube.

    Sphere(double rad){  //creates a sphere with the specified radius

        radius=rad;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return 4 * Math.PI * radius * radius;
    }

    double getVolume() {
        return 4.0 / 3 * Math.PI * radius * radius * radius;
    }

    public String toString() {
        return "Radius of Sphere: " + radius;
    }

    public void howToColor() {
    }

    @Override
    public int compareTo(Object o) {
        if (getArea() > ((SolidShape)o).getArea() )
            return 1;
        else if (getArea() < ((SolidShape)o).getArea() )
            return -1;
        else
            return 0;
    }
}

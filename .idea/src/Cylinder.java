class Cylinder extends SolidShape implements Colorable  {

    double length =1.0; // lenght of the cilinder
    double radius =1.0;// radius of the cilinder

    Cylinder(){} // no-arg constructor that creates a default cube.

    Cylinder(double len, double rad){  // constructor creates a cylinder with the specified data fields

        length=len;
        radius=rad;
    }

    // getters and setters for instance variables
        public double getLenght() {
        return length;
    }

    public void setLenght(double lenght) {
        this.length = lenght;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    double getArea() { // returns the area of this cylinder.
        return (2 * Math.PI * radius * length) + (2 * Math.PI * radius * radius);
    }

    double getVolume() {  //that returns the volume of this cylinder.
        return Math.PI * radius * radius * length;
    }

    public String toString() {
        return "Radius of Cylinder: " + radius + "\n" + "Length of Cylinder: " + length;
    }

   public void howToColor()
    {

    }






}

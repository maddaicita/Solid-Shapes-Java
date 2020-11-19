//COP2805: Java 2 Programming
//Maday Moya
//Project 1


class Cube extends SolidShape  implements Colorable {

    double side = 1.0; // data field named side with a default value 1.0 to denote one side of the cube

    Cube() {
    } // no-arg constructor that creates a default cube.

    Cube(double sid) {  // constructor that creates a solid shape with the specified color.

        side = sid;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    double getArea() {
        return 6 * side * side;
    }

    double getVolume() {
        return side * side * side;
    }

    public String toString() {
        return "Side length of the cube: " + side;
    }

    public void howToColor() {

        System.out.println("Color all six sides");
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


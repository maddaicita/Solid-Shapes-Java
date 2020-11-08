import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TestSolidShape {
        public static void main(String[] args) throws IOException {
            // For reading input
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            // Define an SolidShape array of objects of size 3
            SolidShape[] shapes = new SolidShape[3];

            // For Cube call the necessary functions
            System.out.print("Enter side of the cube: ");
            double side = Double.parseDouble(br.readLine());
            System.out.print("Enter color of the cube: ");
            String color = br.readLine();
            shapes[0] = new Cube(side);     // Assign Cube object to array
            shapes[0].setColor(color);
            System.out.println("Area of the cube: " + shapes[0].getArea());
            System.out.println("Volume of the cube: " + shapes[0].getVolume());
            System.out.println("Color of the cube: " + shapes[0].getColor());
            shapes[0].howToColor();
            System.out.println();

            // For Cylinder call the necessary functions
            System.out.print("Enter length of the cylinder: ");
            double length = Double.parseDouble(br.readLine());
            System.out.print("Enter radius of the cylinder: ");
            double radius = Double.parseDouble(br.readLine());
            System.out.print("Enter color of the cylinder: ");
            color = br.readLine();
            shapes[1] = new Cylinder(length, radius);       // Assign Cylinder object to array
            shapes[1].setColor(color);
            System.out.println("Area of the cylinder: " + shapes[1].getArea());
            System.out.println("Volume of the cylinder: " + shapes[1].getVolume());
            System.out.println("Color of the cylinder: " + shapes[1].getColor());
            System.out.println();

            // For Sphere call the necessary functions
            System.out.print("Enter radius of the sphere: ");
            radius = Double.parseDouble(br.readLine());
            System.out.print("Enter color of the sphere: ");
            color = br.readLine();
            shapes[2] = new Sphere(radius);     // Assign Sphere object to array
            shapes[2].setColor(color);
            System.out.println("Area of the sphere: " + shapes[2].getArea());
            System.out.println("Volume of the sphere: " + shapes[2].getVolume());
            System.out.println("Color of the sphere: " + shapes[2].getColor());
            System.out.println();

        }
    }

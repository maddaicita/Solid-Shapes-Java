
//COP2805: Java 2 Programming
//Maday Moya
//Project 1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.util.Collections.max;

class TestSolidShape {
        public static void main(String[] args) throws IOException {
            // For reading input
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

            // Define an SolidShape array of objects of size 3
            SolidShape[] shapes = new SolidShape[3];

            // Prompts the user to enter one side of the cube, and a color
            System.out.print("Enter one side of the cube: ");
            double side = Double.parseDouble(read.readLine());
            System.out.print("Enter the color of the cube: ");
            String color = read.readLine();

            //create a Cube object with this side and set the color property using
            //the input
            shapes[0] = new Cube(side);     // Assign Cube object to array
            shapes[0].setColor(color);

            //display the area, volume, color and the
            //message “Color all six sides”
            System.out.println("Area: " + shapes[0].getArea());
            System.out.println("Volume: " + shapes[0].getVolume());
            System.out.println("Color: " + shapes[0].getColor());
            Cube mycube;
            mycube = (Cube) shapes[0];
            mycube.howToColor();
            System.out.println();

            //Prompts the user to enter length, radius, and a color of the cylinder.
            System.out.print("Enter length of the cylinder: ");
            double length = Double.parseDouble(read.readLine());
            System.out.print("Enter radius of the cylinder: ");
            double radius = Double.parseDouble(read.readLine());
            System.out.print("Enter color of the cylinder: ");
            color = read.readLine();
            //create a Cylinder object with this length and radius and set
            //the color property using the input
            shapes[1] = new Cylinder(length, radius);
            shapes[1].setColor(color);

            //display the area,volume, and color
            System.out.println("Area : " + shapes[1].getArea());
            System.out.println("Volume " + shapes[1].getVolume());
            System.out.println("Color : " + shapes[1].getColor());
            System.out.println();

            // Prompts the user to enter radius of the sphere, and a color.
            System.out.print("Enter radius of the sphere: ");
            radius = Double.parseDouble(read.readLine());
            System.out.print("Enter color of the sphere: ");
            color = read.readLine();

            //create a Sphere object with this radius and set the color property
            //using the input.
            shapes[2] = new Sphere(radius);     // Assign Sphere object to array
            shapes[2].setColor(color);

            //display the surface area, volume, and color.
            System.out.println("Area : " + shapes[2].getArea());
            System.out.println("Volume : " + shapes[2].getVolume());
            System.out.println("Color: " + shapes[2].getColor());
            System.out.println();

            //Uses the max method to find the larger of the three solid shapes, display the
            //name and area of the solid shape


            SolidShape.max(shapes);
        }
    }

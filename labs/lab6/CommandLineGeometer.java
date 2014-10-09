import java.util.Date;
import java.util.Scanner;

public class CommandLineGeometer {

    private enum GeometricShape {sphere, triangle, cylinder};

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        GeometricShape shape = GeometricShape.sphere;
        double radius;
        double height;
        int x;
        int y;
        int z;

        System.out.println("Gregory M. Kapfhammer " + new Date());
        System.out.println("Welcome to the Command Line Geometer!");
        System.out.println();

        System.out.println("What is the radius for the " + shape + "?");
        radius = scan.nextDouble();
        System.out.println();

        System.out.println("Calculating the volume of a " + shape + " with radius equal to " + radius);
        double sphereVolume = GeometricCalculator.calculateSphereVolume(radius);
        System.out.println("The volume is equal to " + sphereVolume);
        System.out.println();

        shape = GeometricShape.triangle;

        System.out.println("What is the length of the first side?");
        x = scan.nextInt();

        System.out.println("What is the length of the second side?");
        y = scan.nextInt();

        System.out.println("What is the length of the third side?");
        z = scan.nextInt();
        System.out.println();

        System.out.println("Calculating the area of a " + shape);
        double triangleArea = GeometricCalculator.calculateTriangleArea(x, y, x);
        System.out.println("The area is equal to " + triangleArea);
        System.out.println();

        shape = GeometricShape.cylinder;

        System.out.println("What is the radius for the " + shape + "?");
        radius = scan.nextDouble();
        System.out.println();

        System.out.println("What is the height for the " + shape + "?");
        height = scan.nextDouble();
        System.out.println();

        System.out.println("Calculating the volume of a " + shape + " with radius equal to " + radius);
        double cylinderVolume = GeometricCalculator.calculateCylinderVolume(radius, height);
        System.out.println("The volume is equal to " + sphereVolume);
        System.out.println();
    }
}

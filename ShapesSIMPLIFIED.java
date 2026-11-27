import java.util.Scanner;
import java.lang.Math; // Not used

public class MENSIS1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        GeometricShapesCalculations shape = new GeometricShapesCalculations();
        
        //Declaration && Initialization
        String choice, loop;
        int choice2;
        double radius, result, base, height, side, sideA, sideB, sideC;
        result = 0;
        
        //Introduction && Choice
        System.out.println("--- Welcome to basic shape-related calculator ---");
        do {
        System.out.println("What shape would you like to do calculations on?");
        System.out.println("Available shapes:\nCircle, Triangle, Square, Rectangle, Parallelogram");
        System.out.print("Shape choice: ");
        choice = scan.next();
        
        //Real Party
        if (choice.equalsIgnoreCase("Circle")) {
            System.out.println("----- CIRCLE CALCULATIONS -----");
            System.out.print("Enter value for Radius: ");
            radius = scan.nextDouble();
            
            System.out.printf("Area: %.4f", shape.circleArea(radius));
            System.out.printf("Diameter: %.4f", shape.circleDiameter(radius));
            System.out.printf("Circumference: %.4f", shape.circleCircumference(radius));
            System.out.printf("Semi-Circle Area: %.4f", shape.circleSemiArea(radius));
            System.out.printf("Semi-Circle Perimeter: %.4f", shape.circleSemiPerimeter(radius));
            
        } else if (choice.equalsIgnoreCase("Triangle")) {
            System.out.println("----- TRIANGLE CALCULATIONS -----");
            System.out.println("Please enter the number of your choice");
            System.out.println("1.\tArea");
            System.out.println("2.\tPerimeter");
            System.out.print("Choice: ");
            choice2 = scan.nextInt();
            
            switch (choice2) {
                case 1:
                    System.out.print("Enter value for Base: ");
                    base = scan.nextDouble();
                    System.out.print("Enter value for Height: ");
                    height = scan.nextDouble();
                    result = shape.triangleArea(base, height);
                    break;
                case 2:
                    System.out.print("Enter value for side A: ");
                    sideA = scan.nextDouble();
                    System.out.print("Enter value for side B: ");
                    sideB = scan.nextDouble();
                    System.out.print("Enter value for side C: ");
                    sideC = scan.nextDouble();
                    result = shape.trianglePerimeter(sideA, sideB, sideC);
                    break;
                default:
                    System.out.println("Unrecognized input");
            }
            System.out.printf("%.4f", result);

        } else if (choice.equalsIgnoreCase("Square")) {
            System.out.println("----- SQUARE CALCULATIONS -----");
            System.out.print("Enter value for Sides: ");
            side = scan.nextDouble();
            
            System.out.printf("\nArea: %.4f", shape.squareArea(side));
            System.out.printf("\nPerimeter: %.4f", shape.squarePerimeter(side));

        } else if (choice.equalsIgnoreCase("Rectangle")) {
            System.out.println("----- RECTANGLE CALCULATIONS -----");
            System.out.print("Enter value for Base: ");
            base = scan.nextDouble();
            System.out.print("Enter value for Height: ");
            height = scan.nextDouble();
            
            System.out.printf("Area: %.4f", shape.rectangleArea(height, base));
            System.out.printf("Perimeter: %.4f", shape.rectanglePerimeter(height, base));

        } else if (choice.equalsIgnoreCase("Parallelogram")) {
            System.out.println("----- PARALLELOGRAM CALCULATIONS -----");
            System.out.println("Please enter the number of your choice");
            System.out.println("1.\tArea");
            System.out.println("2.\tPerimeter");
            System.out.print("Choice: ");
            choice2 = scan.nextInt();
            
            switch (choice2) {
                case 1:
                    System.out.print("Enter value for Base: ");
                    base = scan.nextDouble();
                    System.out.print("Enter value for Height: ");
                    height = scan.nextDouble();
                    result = shape.parallelogramArea(base, height);
                    break;
                case 2:
                    System.out.print("Enter value for side A: ");
                    sideA = scan.nextDouble();
                    System.out.print("Enter value for side B: ");
                    sideB = scan.nextDouble();
                    result = shape.parallelogramPerimeter(sideA, sideB);
                    break;
                default:
                    System.out.println("Unrecognized input");
            }
            System.out.printf("%.4f", result);

        } else {
            System.out.println("\nUnrecognized input");
        }
            System.out.println("\nReturn to start? [Y/N]");
            loop = scan.next();
        } while (loop.equalsIgnoreCase("Y"));
    }
}

import java.util.Scanner;
import java.lang.Math; //Not used

public class MENSIS1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        GeometricShapesCalculations shape = new GeometricShapesCalculations();

        //Declarations && Initializations
        String choice, loop;
        int choice2;
        double radius, result, base, height, side, sideA, sideB, sideC;
        result = 0;

        //Start
        System.out.println("--- Welcome to basic shape-related calculator ---");
        do {
        System.out.println("What shape would you like to do calculations on?");
        System.out.println("Available shapes: Circle, Triangle, Square, Rectangle, Parallelogram");
        System.out.print("Shape choice: ");
        choice = scan.next();
        
        if (choice.equalsIgnoreCase("Circle")) {
            System.out.println("----- CIRCLE CALCULATIONS -----"); // CIRCLE ----------
            System.out.println("Please enter the number of your choice");
            System.out.println("1.\tArea");
            System.out.println("2.\tDiameter");
            System.out.println("3.\tCircumference");
            System.out.println("4.\tSemi-Circle Area");
            System.out.println("5.\tSemi-Circle Perimeter");
            System.out.print("Choice: ");
            choice2 = scan.nextInt();
            System.out.print("Enter value for Radius: ");
            radius = scan.nextDouble();
            
            switch (choice2) {
                case 1:
                    result = shape.circleArea(radius);
                    break;
                case 2:
                    result = shape.circleDiameter(radius);
                    break;
                case 3:
                    result = shape.circleCircumference(radius);
                    break;
                case 4:
                    result = shape.circleSemiArea(radius);
                    break;
                case 5:
                    result = shape.circleSemiPerimeter(radius);
                    break;
                default:
                    System.out.println("Unrecognized input");
            }
            System.out.printf("%.4f", result);
            
        } else if (choice.equalsIgnoreCase("Triangle")) {
            System.out.println("----- TRIANGLE CALCULATIONS -----"); // TRIANGLE ----------
            System.out.println("Please enter the number of your choice");
            System.out.println("1.\tArea");
            System.out.println("2.\tPerimeter");
            System.out.print("Choice: ");
            choice2 = scan.nextInt();
            
            switch (choice2) {
                case 1:
                    System.out.println("Enter value for Base: ");
                    base = scan.nextDouble();
                    System.out.println("Enter value for Height: ");
                    height = scan.nextDouble();
                    result = shape.triangleArea(base, height);
                    break;
                case 2:
                    System.out.println("Enter value for side A: ");
                    sideA = scan.nextDouble();
                    System.out.println("Enter value for side B: ");
                    sideB = scan.nextDouble();
                    System.out.println("Enter value for side C: ");
                    sideC = scan.nextDouble();
                    result = shape.trianglePerimeter(sideA, sideB, sideC);
                    break;
                default:
                    System.out.println("Unrecognized input");
            }
            System.out.printf("%.4f", result);

        } else if (choice.equalsIgnoreCase("Square")) {
            System.out.println("----- SQUARE CALCULATIONS -----"); // SQUARE ----------
            System.out.println("Please enter the number of your choice");
            System.out.println("1.\tArea");
            System.out.println("2.\tPerimeter");
            System.out.print("Choice: ");
            choice2 = scan.nextInt();
            System.out.print("Enter value for Side: ");
            side = scan.nextDouble();
            
            switch (choice2) {
                case 1:
                    result = shape.squareArea(side);
                    break;
                case 2:
                    result = shape.squarePerimeter(side);
                    break;
                default:
                    System.out.println("Unrecognized input");
            }
            System.out.printf("%.4f", result);

        } else if (choice.equalsIgnoreCase("Rectangle")) {
            System.out.println("----- RECTANGLE CALCULATIONS -----"); // RECTANGLE ----------
            System.out.println("Please enter the number of your choice");
            System.out.println("1.\tArea");
            System.out.println("2.\tPerimeter");
            System.out.print("Choice: ");
            choice2 = scan.nextInt();
            
            switch (choice2) {
                case 1:
                    System.out.println("Enter value for Base: ");
                    base = scan.nextDouble();
                    System.out.println("Enter value for Height: ");
                    height = scan.nextDouble();
                    result = shape.rectangleArea(base, height);
                    break;
                case 2:
                    System.out.println("Enter value for Base: ");
                    base = scan.nextDouble();
                    System.out.println("Enter value for Height: ");
                    height = scan.nextDouble();
                    result = shape.rectanglePerimeter(base, height);
                    break;
                default:
                    System.out.println("Unrecognized input");
            }
            System.out.printf("%.4f", result);

        } else if (choice.equalsIgnoreCase("Parallelogram")) {
            System.out.println("----- PARALLELOGRAM CALCULATIONS -----"); // PARALLELOGRAM ----------
            System.out.println("Please enter the number of your choice");
            System.out.println("1.\tArea");
            System.out.println("2.\tPerimeter");
            System.out.print("Choice: ");
            choice2 = scan.nextInt();
            
            switch (choice2) {
                case 1:
                    System.out.println("Enter value for Base: ");
                    base = scan.nextDouble();
                    System.out.println("Enter value for Height: ");
                    height = scan.nextDouble();
                    result = shape.parallelogramArea(base, height);
                    break;
                case 2:
                    System.out.println("Enter value for side A: ");
                    sideA = scan.nextDouble();
                    System.out.println("Enter value for side B: ");
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

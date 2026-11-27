public class GeometricShapesCalculations {
    
    double result;
    
    public double circleArea (double radius) {
        return result = 3.1416 * (radius * radius);
    }
    public double circleDiameter (double radius) {
        return result = 2 * radius;
    }
    public double circleCircumference (double radius) {
        return result = 2 * 3.1416 * radius;
    }
    public double circleSemiArea (double radius) {
        return result = 3.1416 * (radius * radius) * 0.5;
    }
    public double circleSemiPerimeter (double radius) {
        return result = 3.1416 * radius + 2 * radius;
    }
    // -------------------- TRIANGLE --------------------
    public double triangleArea (double base, double height) {
        return result = base * height * 0.5;
    }
    public double trianglePerimeter (double sideA, double sideB, double sideC) {
        return result = sideA + sideB + sideC;
    }
    // -------------------- SQUARE --------------------
    public double squareArea (double side) {
        return result = side * side;
    }
    public double squarePerimeter (double side) {
        return result = 4 * side;
    }
    // -------------------- RECTANGLE --------------------
    public double rectangleArea (double length, double width) {
        return result = length * width;
    }
    public double rectanglePerimeter (double length, double width) {
        return result = 2 * (length + width);
    }
    // -------------------- PARALLELOGRAM --------------------
    public double parallelogramArea (double base, double height) {
        return result = base * height;
    }
    public double parallelogramPerimeter (double sideA, double sideB) {
        return result = 2 * (sideA + sideB);
    }
}

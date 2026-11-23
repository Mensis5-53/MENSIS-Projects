import java.util.Scanner;

public class Mensiss_triangle {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //Declaration
        int x, y, z, num;
        
        //Input
        System.out.print("Enter a number; ");
        num = scan.nextInt();
        
        //A-Triangle
        System.out.println("A)");
        for (x=1; x <= num; x++) {
            for (y=1; y<=x; y++) {
                System.out.print("* ");
            }
            System.out.println();           
        }
        //B-Triangle
        System.out.println("\nB)");
        for (z=1; z <= num; z++) {
            for (y=num; y >= z; y--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //C-Triangle
        System.out.println("\nC)");
        for (x=1; x <= num; x++) {
            for (y=1; y<=x; y++) {
                System.out.print("* ");
            }
            System.out.println();           
        }
        for (z=1; z <= num; z++) {
            for (y=num; y > z; y--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

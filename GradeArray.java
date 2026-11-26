import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

		int sum = 0;
		double avg;
        int[] grades = new int[3];
        String[] names = new String[3];

		
        for (int i = 0; i < grades.length; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scan.next();
            System.out.print("Enter " + names[i] + "'s grade: ");
            grades[i] = scan.nextInt();
            if (grades[i] == -1) {
            	i = i-2;
            	System.out.println("Returning to previous number");
            }
        }

        System.out.println("\nStudent grades:");

        for (int i = 0; i < grades.length; i++) {
            System.out.println(names[i] + " - " + grades[i]);
        }
        for (int i = 0; i < grades.length; i++) {
        	sum += grades[i];
        }
        avg = (double) sum / grades.length;
        System.out.print("Average grade: ");
        System.out.printf("%.3f", avg);

    }
}

import java.lang.Math;

public class Random {
	public static void main(String[] args) {
		
		int x = 0;
		
		//0 <= Random < 1
		do {
		x++;
		double random = Math.random();
		System.out.printf("\n%.4f", random);
		} while (x < 10 );
	}
}

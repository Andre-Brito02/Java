import java.io.IOException;
import java.util.Scanner;

public class Ex1001 {
	public static void main(String[] args)throws IOException {
		Scanner s = new Scanner(System.in);
		
		int A = s.nextInt();
		int B = s.nextInt();
		int X = A + B;
		
		System.out.printf("X = %d\n", X);
	}
}

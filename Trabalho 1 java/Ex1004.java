import java.io.IOException;
import java.util.Scanner;

public class Ex1004 {
    public static void main(String[] args)throws IOException {
		Scanner s = new Scanner(System.in);
		
		int A = s.nextInt();
		int B = s.nextInt();
		int PROD = A * B;
		
		System.out.printf("PROD = %d\n", PROD);
	}
}

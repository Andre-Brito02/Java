import java.io.IOException;
import java.util.Scanner;

public class Ex1007 {
    public static void main(String[] args)throws IOException {
		Scanner s = new Scanner(System.in);
		
		int A = s.nextInt();
		int B = s.nextInt();
		int C = s.nextInt();
		int D = s.nextInt();
		
		int diferenca = (A * B) - (C * D);
		
		System.out.println("DIFERENCA = " + diferenca);
	}
}

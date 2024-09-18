import java.io.IOException;
import java.util.Scanner;

public class Ex1008 {
    public static void main(String[] args)throws IOException {
		Scanner s = new Scanner(System.in);
		
		int number = s.nextInt();
		int hours = s.nextInt();
		double moneyPerHours = s.nextDouble();
		double salary = hours * moneyPerHours;
		
		System.out.printf("NUMBER = %d\n", number);
		System.out.printf("SALARY = U$ %.2f\n", salary);
	}
}

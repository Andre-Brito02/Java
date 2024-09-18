import java.util.Scanner;
import java.io.IOException;

public class Ex1011 {
    public static void main(String[] args)throws IOException{
		Scanner s = new Scanner(System.in);
		
		double raio = s.nextDouble();
		double PI = 3.14159;
		double volume = (4.0 / 3) * PI * Math.pow(raio, 3); 
		
		System.out.printf("VOLUME = %.3f\n", volume);
	}
}

import java.util.Scanner;
import java.io.IOException;

public class Ex1014 {
    public static void main(String[] args)throws IOException{
		Scanner s = new Scanner(System.in);
		
		int km = s.nextInt();
		double combustivel_gasto = s.nextDouble();
		double consumo_medio = km / combustivel_gasto;
		
		System.out.printf("%.3f km/l\n", consumo_medio);
	}
}

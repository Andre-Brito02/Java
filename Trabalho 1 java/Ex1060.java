import java.io.IOException;
import java.util.Scanner;

public class Ex1060 {
    public static void main(String[] args)throws IOException{
		Scanner s = new Scanner(System.in);
		
		double a = s.nextDouble();
		double b = s.nextDouble();
		double c = s.nextDouble();
		double d = s.nextDouble();
		double e = s.nextDouble();
		double f = s.nextDouble();
		
		int numeros_pares = 0;
		
		if(a > 0) {
			numeros_pares++;
		}
		
		if(b > 0) {
			numeros_pares++;
		}
		
		if(c > 0) {
			numeros_pares++;
		}
		
		if(d > 0) {
			numeros_pares++;
		}
		
		if(e > 0) {
			numeros_pares++;
		}
		
		if(f > 0) {
			numeros_pares++;
		}
		
		System.out.println("" + numeros_pares + " valores positivos");
		
	}//static void
}

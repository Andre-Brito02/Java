import java.io.IOException;
import java.util.Scanner;

public class Ex1064 {
    public static void main(String[] args)throws IOException{
		Scanner s = new Scanner(System.in);
		
		double a = s.nextDouble();
		double b = s.nextDouble();
		double c = s.nextDouble();
		double d = s.nextDouble();
		double e = s.nextDouble();
		double f = s.nextDouble();
		double media = 0;
		
		int numeros_pares = 0;
		
		if(a > 0) {
			numeros_pares++;
			media += a;
		}
		
		if(b > 0) {
			numeros_pares++;
			media += b;
		}
		
		if(c > 0) {
			numeros_pares++;
			media += c;
		}
		
		if(d > 0) {
			numeros_pares++;
			media += d;
		}
		
		if(e > 0) {
			numeros_pares++;
			media += e;
		}
		
		if(f > 0) {
			numeros_pares++;
			media += f;
		}
		
		media /= numeros_pares;
		
		System.out.println("" + numeros_pares + " valores positivos");
		System.out.printf("%.1f\n", media);
		
	}//static void
}

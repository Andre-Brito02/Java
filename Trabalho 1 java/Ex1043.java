import java.util.Scanner;
import java.io.IOException;

public class Ex1043 {
    public static void main(String[] args)throws IOException {
		Scanner s = new Scanner(System.in);
		
		String linha = s.nextLine();
		String[] valores = linha.split("\\s");
		
		double a = Double.parseDouble(valores[0]);
		double b = Double.parseDouble(valores[1]);
		double c = Double.parseDouble(valores[2]);
		double perimetro = 0;
		double area_trapezio = 0;
		
		
		if((a > Math.abs(b - c) && a < b + c) || (b > Math.abs(a - c) && b < a + c) || (c > Math.abs(a - b) && c < a + b)) {
			perimetro = a + b + c;
			System.out.printf("Perimetro = %.1f\n", perimetro);
		}else {
			area_trapezio = ((a + b) * c) / 2;
			System.out.printf("Area = %.1f\n", area_trapezio);
		}
			
	}//static void
}

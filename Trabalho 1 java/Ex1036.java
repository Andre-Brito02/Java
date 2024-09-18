import java.util.Scanner;
import java.io.IOException;

public class Ex1036 {
    public static void main(String[] args)throws IOException {
		Scanner s = new Scanner(System.in);
		
		String linha = s.nextLine();
		String[] valores = linha.split("\\s");
		
		double a = Double.parseDouble(valores[0]);
		double b = Double.parseDouble(valores[1]);
		double c = Double.parseDouble(valores[2]);
		double delta, r1, r2;
		
		delta = Math.pow(b, 2) - 4 * a * c;
		
		if(delta < 0 || (2 * a == 0)) {
			System.out.println("Impossivel calcular");
		}
		
		else if(delta > 0) {
			r1 = (- b + Math.sqrt(delta)) / (2 * a);
			r2 = (- b - Math.sqrt(delta)) / (2 * a);
			System.out.printf("R1 = %.5f\nR2 = %.5f\n", r1, r2);
		}
		
		else {
			r1 = r2 = (- b + Math.sqrt(delta)) / (2 * a);
			System.out.printf("R1 = %.5f\nR2 = %.5f\n", r1, r2);
		}
		
	}
}

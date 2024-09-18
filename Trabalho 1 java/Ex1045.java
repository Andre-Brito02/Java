import java.util.Scanner;
import java.io.IOException;

public class Ex1045 {
    public static void main(String[] args)throws IOException {
		Scanner s = new Scanner(System.in);
		
		String linha = s.nextLine();
		String[] valores = linha.split("\\s");
		
		double a = Double.parseDouble(valores[0]);
		double b = Double.parseDouble(valores[1]);
		double c = Double.parseDouble(valores[2]);
		
		double maior = 0;
		double meio = 0;
		double menor = 0;
		double somas_quadrado = 0;
		
		if(a >= b && a >= c) {
			maior = a;
		}
		
		else if(b >= a && b >= c) {
			maior = b;
		}
		
		else if(c >= a && c >= b) {
			maior = c;
		}
		
		if((a >= b && a <= c) || (a >= c && a <= b)) {
			meio = a;
		}
		
		else if((b >= a && b <= c) || (b >= c && b <= a)) {
			meio = b;
		}
		
		else if((c >= a && c <= b) || (c >= b && c <= a)) {
			meio = c;
		}
		
		if(a <= b && a <= c) {
			menor = a;
		}
		
		else if(b <= a && b <= c) {
			menor = b;
		}
		
		else if(c <= a && c <= b) {
			menor = c;
		}
		
		a = maior;
		b = meio;
		c = menor;
		
		somas_quadrado = Math.pow(b,2) + Math.pow(c, 2);
		
		if(a >= b + c) {
			System.out.println("NAO FORMA TRIANGULO");
		}else {
			
			if(somas_quadrado == Math.pow(a, 2)) {
				System.out.println("TRIANGULO RETANGULO");
			}
			
			if(somas_quadrado < Math.pow(a, 2)) {
				System.out.println("TRIANGULO OBTUSANGULO");
			}
			
			if(somas_quadrado > Math.pow(a, 2)) {
				System.out.println("TRIANGULO ACUTANGULO");
			}
			
			if((a == b && a == c) || (b == a && b == c)) {
				System.out.println("TRIANGULO EQUILATERO");
			}
			
			if((a == b && a != c) || (a == c && a != b) || (b == c && b != a)) {
				System.out.println("TRIANGULO ISOSCELES");
			}
			
		}
	}//static void
}

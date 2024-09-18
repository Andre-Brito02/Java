import java.util.Scanner;
import java.io.IOException;

public class Ex1012 {
    public static void main(String[] args)throws IOException{
		Scanner s = new Scanner(System.in);
		
		String linha = s.nextLine();
		String[] valores = linha.split("\\s");
		
		double A = Double.parseDouble(valores[0]);
		double B = Double.parseDouble(valores[1]);
		double C = Double.parseDouble(valores[2]);
		double PI = 3.14159;
		
		double triangulo = (A * C) / 2;
		double circulo = PI * Math.pow(C, 2);
		double trapezio = ((A + B) * C) / 2;
		double quadrado = Math.pow(B, 2);
		double retangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f\n", triangulo);
		System.out.printf("CIRCULO: %.3f\n", circulo);
		System.out.printf("TRAPEZIO: %.3f\n", trapezio);
		System.out.printf("QUADRADO: %.3f\n", quadrado);
		System.out.printf("RETANGULO: %.3f\n", retangulo);	
	}
}

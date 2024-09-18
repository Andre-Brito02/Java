import java.util.Scanner;
import java.io.IOException;

public class Ex1042 {
    public static void main(String[] args)throws IOException {
		Scanner s = new Scanner(System.in);
		
		String linha = s.nextLine();
		String[] valores = linha.split("\\s");
		
		int a = Integer.parseInt(valores[0]);
		int b = Integer.parseInt(valores[1]);
		int c = Integer.parseInt(valores[2]);
		
		int menor = 0;
		int meio = 0; 
		int maior = 0;
		
		if(a > b && a > c) {
			maior = a;
		}
		
		else if(b > a && b > c) {
			maior = b;
		}
		
		else if(c > a && c > b) {
			maior = c;
		}
		
		if((a > b && a < c) || (a > c && a < b)) {
			meio = a;
		}
		
		else if((b > a && b < c) || (b > c && b < a)) {
			meio = b;
		}
		
		else if((c > a && c < b) || (c > b && c < a)) {
			meio = c;
		}
		
		if(a < b && a < c) {
			menor = a;
		}
		
		else if(b < a && b < c) {
			menor = b;
		}
		
		else if(c < a && c < b) {
			menor = c;
		}
		
		System.out.println(menor);
		System.out.println(meio);
		System.out.println(maior);
		System.out.println();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}//static void
}

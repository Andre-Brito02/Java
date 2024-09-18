import java.io.IOException;
import java.util.Scanner;

public class Ex1065 {
    public static void main(String[] args)throws IOException{
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int d = s.nextInt();
		int e = s.nextInt();	
		int numeros_pares = 0;
		
		if(a %2 == 0) {
			numeros_pares++;
		}
		
		if(b %2 == 0) {
			numeros_pares++;
		}
		
		if(c %2 == 0) {
			numeros_pares++;
		}
		
		if(d %2 == 0) {
			numeros_pares++;
		}
		
		if(e %2 == 0) {
			numeros_pares++;
		}
		
		System.out.println("" + numeros_pares + " valores pares");
		
	}//static void
}

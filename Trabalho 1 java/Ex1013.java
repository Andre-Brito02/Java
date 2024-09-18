import java.util.Scanner;
import java.io.IOException;

public class Ex1013 {
    public static void main(String[] args)throws IOException{
		Scanner s = new Scanner(System.in);
		
		String linha = s.nextLine();
		String[] valores = linha.split("\\s");
		
		int a = Integer.parseInt(valores[0]);
		int b = Integer.parseInt(valores[1]);
		int c = Integer.parseInt(valores[2]);
		
		if(a >= b && a >= c) {
			System.out.println("" + a + " eh o maior");
		}
		
		else if(b >= a && b >= c){
			System.out.println("" + b + " eh o maior");
		}
		
		else if(c >= a && c >= b) {
			System.out.println("" + c + " eh o maior");
		}
	}
}

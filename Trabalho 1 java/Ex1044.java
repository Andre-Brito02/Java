import java.util.Scanner;
import java.io.IOException;

public class Ex1044 {
    public static void main(String[] args)throws IOException {
		Scanner s = new Scanner(System.in);
		
		String linha = s.nextLine();
		String[] valores = linha.split("\\s");
		
		int a = Integer.parseInt(valores[0]);
		int b = Integer.parseInt(valores[1]);
		
		if(b % a == 0 || a % b == 0) {
			System.out.println("Sao Multiplos");
		}else {
			System.out.println("Nao sao Multiplos");
		}
			
	}//static void
}

import java.util.Scanner;
import java.io.IOException;

public class Ex1041 {
    public static void main(String[] args)throws IOException {
		Scanner s = new Scanner(System.in);
		
		String linha = s.nextLine();
		String[] valores = linha.split("\\s");
		
		double x = Double.parseDouble(valores[0]);
		double y = Double.parseDouble(valores[1]);
		
		if(x > 0.0 && y > 0.0) {
			System.out.println("Q1");
		}
		
		else if(x < 0.0 && y > 0.0) {
			System.out.println("Q2");
		}
		
		else if(x < 0.0 && y < 0.0) {
			System.out.println("Q3");
		}
		
		else if(x > 0.0 && y < 0.0) {
			System.out.println("Q4");
		}
		
		else if(x == 0.0 && y == 0.0){
			System.out.println("Origem");
		}
		
		else if((x > 0 || x < 0) && y == 0) {
			System.out.println("Eixo X");
		}
		
		else if((y > 0 || y < 0) && x == 0) {
			System.out.println("Eixo Y");
		}
	}//static void
}

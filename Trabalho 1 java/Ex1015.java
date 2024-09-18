import java.util.Scanner;
import java.io.IOException;

public class Ex1015 {
    public static void main(String[] args)throws IOException{
		Scanner s = new Scanner(System.in);
		
		String linha = s.nextLine();
		String[] valores = linha.split("\\s");
		
		String linha2 = s.nextLine();
		String[] valores2 = linha2.split("\\s");
		
		double x1 = Double.parseDouble(valores[0]);
		double y1 = Double.parseDouble(valores[1]);
		
		double x2 = Double.parseDouble(valores2[0]);
		double y2 = Double.parseDouble(valores2[1]);
		
		double distancia = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2 - y1, 2));
		
		System.out.printf("%.4f\n", distancia);
	}
}

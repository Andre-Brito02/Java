import java.util.Scanner;
import java.io.IOException;

public class Ex1009 {
    public static void main(String[] args)throws IOException{
		Scanner s = new Scanner(System.in);
		
		String nome = s.next();
		double salarioFixo = s.nextDouble();
		double totalVendas = s.nextDouble();
		double totalRecebido = salarioFixo + ((totalVendas * 15) / 100);
		
		System.out.printf("TOTAL = R$ %.2f\n", totalRecebido);
		
	}
}

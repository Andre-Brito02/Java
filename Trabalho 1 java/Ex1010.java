import java.util.Scanner;
import java.io.IOException;

public class Ex1010 {
    public static void main(String[] args)throws IOException{
		Scanner s = new Scanner(System.in);
		
		String linha = s.nextLine();
		String[] valores = linha.split("\\s");
		String linha2 = s.nextLine();
		String[] valores2 = linha2.split("\\s");
		
		
		int codigoPeca = Integer.parseInt(valores[0]);
		int qtdPecas = Integer.parseInt(valores[1]);
		double valorPecas = Double.parseDouble(valores[2]);

		int codigoPeca2 = Integer.parseInt(valores2[0]);
		int qtdPecas2 = Integer.parseInt(valores2[1]);
		double valorPecas2 = Double.parseDouble(valores2[2]);
		
		double valorTotal = (qtdPecas * valorPecas) + (qtdPecas2 * valorPecas2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotal);
	}
}

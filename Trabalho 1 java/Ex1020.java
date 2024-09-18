import java.util.Scanner;
import java.io.IOException;

public class Ex1020 {
    public static void main(String[] args)throws IOException {
		Scanner s = new Scanner(System.in);
		
		int idade_dias = s.nextInt();
		int ano = 0;
		int mes = 0;
		int dia = 0;
		
		ano = idade_dias / 365;
		idade_dias = idade_dias % 365;
		
		mes = idade_dias / 30;
		
		dia = idade_dias % 30;
		
		System.out.println("" + ano + " ano(s)");
		System.out.println("" + mes + " mes(es)");
		System.out.println("" + dia + " dia(s)");
	}
}

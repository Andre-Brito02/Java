import java.util.Scanner;
import java.io.IOException;

public class Ex1021 {
    public static void main(String[] args)throws IOException {
		Scanner s = new Scanner(System.in);
		
		double cedulas = s.nextDouble();
		
		int notas_100 = 0;
		int notas_50 = 0;
		int notas_20 = 0;
		int notas_10 = 0;
		int notas_5 = 0;
		int notas_2 = 0;
		
		int moeda_1 = 0;
		int moeda_50 = 0;
		int moeda_25 = 0;
		int moeda_10 = 0;
		int moeda_5 = 0;
		int moeda_01 = 0;
		
		notas_100 = (int)cedulas / 100;
		cedulas = cedulas % 100;
		
		notas_50 = (int)cedulas / 50;
		cedulas = cedulas % 50;
		
		notas_20 = (int)cedulas / 20;
		cedulas = cedulas % 20;
		
		notas_10 = (int)cedulas / 10;
		cedulas = cedulas % 10;
		
		notas_5 = (int)cedulas / 5;
		cedulas = cedulas % 5;
		
		notas_2 = (int)cedulas / 2;
		cedulas = cedulas % 2;
		
		moeda_1 = (int)cedulas;
		cedulas = cedulas % 1;
		
		moeda_50 = (int)(cedulas / 0.5);
		cedulas = cedulas % 0.5;
		
		moeda_25 = (int)(cedulas / 0.25);
		cedulas = cedulas % 0.25;
		
		moeda_10 = (int)(cedulas / 0.10);
		cedulas = cedulas % 0.10;
		
		moeda_5 = (int)(cedulas / 0.05);
		cedulas = cedulas % 0.05;
		
		moeda_01 = (int)(cedulas / 0.01);
		
		System.out.println("NOTAS:");
		System.out.println("" + notas_100 + " nota(s) de R$ 100.00");
		System.out.println("" + notas_50 + " nota(s) de R$ 50.00");
		System.out.println("" + notas_20 + " nota(s) de R$ 20.00");
		System.out.println("" + notas_10 + " nota(s) de R$ 10.00");
		System.out.println("" + notas_5 + " nota(s) de R$ 5.00");
		System.out.println("" + notas_2 + " nota(s) de R$ 2.00");
		System.out.println("MOEDAS:");
		System.out.println("" + moeda_1 + " moeda(s) de R$ 1.00");
		System.out.println("" + moeda_50 + " moeda(s) de R$ 0.50");
		System.out.println("" + moeda_25 + " moeda(s) de R$ 0.25");
		System.out.println("" + moeda_10 + " moeda(s) de R$ 0.10");
		System.out.println("" + moeda_5 + " moeda(s) de R$ 0.05");
		System.out.println("" + moeda_01 + " moeda(s) de R$ 0.01");
	}
}

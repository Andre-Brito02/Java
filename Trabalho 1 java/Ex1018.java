import java.util.Scanner;
import java.io.IOException;

public class Ex1018 {
    public static void main(String[] args)throws IOException {
		Scanner s = new Scanner(System.in);
		
		int cedulas = s.nextInt();
		int cedulas_inicial = cedulas;
		int notas_cem = 0;
		int notas_cinquenta = 0;
		int notas_vinte = 0;
		int notas_dez = 0;
		int notas_cinco = 0;
		int notas_dois = 0;
		int notas_um = 0;
		
		notas_cem = cedulas / 100;
		cedulas = cedulas % 100;		

		notas_cinquenta = cedulas / 50;
		cedulas = cedulas % 50;		
		
		notas_vinte = cedulas / 20;
		cedulas = cedulas % 20;				

		notas_dez = cedulas / 10;
		cedulas = cedulas % 10;		
		
		notas_cinco = cedulas / 5;
		cedulas = cedulas % 5;		
			
		notas_dois = cedulas / 2;
		
		notas_um = cedulas % 2;			

		
		System.out.println("" + cedulas_inicial);	
		System.out.println("" + notas_cem + " nota(s) de R$ 100,00");
		System.out.println("" + notas_cinquenta + " nota(s) de R$ 50,00");
		System.out.println("" + notas_vinte + " nota(s) de R$ 20,00");
		System.out.println("" + notas_dez + " nota(s) de R$ 10,00");
		System.out.println("" + notas_cinco + " nota(s) de R$ 5,00");
		System.out.println("" + notas_dois + " nota(s) de R$ 2,00");
		System.out.println("" + notas_um + " nota(s) de R$ 1,00");
	
	}
}

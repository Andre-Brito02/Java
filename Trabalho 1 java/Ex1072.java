import java.io.IOException;
import java.util.Scanner;

public class Ex1072 {
    public static void main(String[] args)throws IOException{
		Scanner s = new Scanner(System.in);
		
		int contador = 0;
		int dentro = 0;
		int fora = 0;
		
		while(contador < 5) {
			int numero = s.nextInt();
			
			if(numero >= 10 && numero <=20) {
				dentro++;
			}
			
			else if(numero < 0) {
				
			}
			
			else {
				fora++;
			}
			contador++;
		}
		
		
		System.out.println("" + dentro + " in");
		System.out.println("" + fora + " out");
		
	}//static void
}

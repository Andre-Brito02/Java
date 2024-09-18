import java.io.IOException;
import java.util.Scanner;

public class Ex1073 {
    public static void main(String[] args)throws IOException{
		Scanner s = new Scanner(System.in);
		
		int numero = s.nextInt();
		int contador = 1;
		int quadrado = 0;
		
		while(contador <= numero) {
			if(contador %2 == 0) {
				quadrado = (int)Math.pow(contador, 2);
				System.out.printf("%d^2 = %d\n", contador, quadrado);
			}//if
			contador++;
		}//while
		
	}//static void
}

import java.io.IOException;
import java.util.Scanner;

public class Ex1071 {
    public static void main(String[] args)throws IOException{
		Scanner s = new Scanner(System.in);
		
		int x = s.nextInt();
		int y = s.nextInt();
		int maior, menor;
		int soma_impar = 0;
		
		if(x > y) {
			maior = x;
			menor = y;
		}else {
			maior = y;
			menor = x;
		}
		
		while(menor < maior) {
			if(menor == maior) {
				System.out.println("0");
				break;
			}
			
			if(menor %2 == 0) {
				
			}
			
			else if(menor == y || menor == x) {
				
			}
			
			else {
				soma_impar += menor;
			}
			menor++;
		}
		
		System.out.println(soma_impar);
		
	}//static void
}

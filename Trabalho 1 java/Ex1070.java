import java.io.IOException;
import java.util.Scanner;

public class Ex1070 {
    public static void main(String[] args)throws IOException{
		Scanner s = new Scanner(System.in);
		
		int x = s.nextInt();
		int contador = 0;
		boolean v = true;
		
		while(v) {
			if(x %2 == 0) {
				
			}else {
				System.out.println(x);
				contador++;
			}
			
			if(contador == 6) {
				break;
			}
			
			x++;
		
		}//while
	
	}//static void
}

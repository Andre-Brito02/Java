import java.io.IOException;
import java.util.Scanner;

public class Ex1067 {
    public static void main(String[] args)throws IOException{
		Scanner s = new Scanner(System.in);
		
		int x = s.nextInt();
		int contador = 1;
		
		while(contador <= x) {
			if(contador %2 == 0) {
				
			}else {
				System.out.println(contador);
			}
			contador++;
		}
	}//static void
}

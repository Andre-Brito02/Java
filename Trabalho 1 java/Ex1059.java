import java.io.IOException;

public class Ex1059 {
    public static void main(String[] args)throws IOException{
		
		int contador = 1;
		
		while(contador <= 100) {
			if(contador %2 == 0) {
				System.out.println(contador);
			}
			contador++;
		}
		
	}//static void
}

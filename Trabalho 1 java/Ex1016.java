import java.util.Scanner;
import java.io.IOException;

public class Ex1016 {
    public static void main(String[] args)throws IOException{
		Scanner s = new Scanner(System.in);
		
		int quilometragem = s.nextInt();
		int distancia_tempo_minutos = quilometragem * 2;
		
		System.out.println("" + distancia_tempo_minutos + " minutos");
	}
}

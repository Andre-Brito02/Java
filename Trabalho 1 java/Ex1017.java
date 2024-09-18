import java.util.Scanner;
import java.io.IOException;

public class Ex1017 {
    public static void main(String[] args)throws IOException{
		Scanner s = new Scanner(System.in);
		
		int tempo_viagem = s.nextInt();
		int velocidade_media = s.nextInt();
		double distancia = tempo_viagem * velocidade_media;
		double litros_gastos = distancia / 12;
		
		System.out.printf("%.3f\n", litros_gastos);
	}
}

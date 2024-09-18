import java.util.Scanner;
import java.io.IOException;

public class Ex1019 {
    public static void main(String[] args)throws IOException{
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int segundos = 0;
		int minutos = 0;
		int horas = 0;
		
		horas = n / 3600;
		n = n % 3600;
		minutos = n / 60;
		segundos = n % 60;
		System.out.println("" + horas + ":" + "" + minutos + ":" + "" + segundos);
	}
}

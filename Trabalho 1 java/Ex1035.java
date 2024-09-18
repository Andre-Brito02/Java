import java.util.Scanner;
import java.io.IOException;

public class Ex1035 {
    public static void main(String[] args)throws IOException {
		Scanner s = new Scanner(System.in);
		
		String linha = s.nextLine();
		String[] valores = linha.split("\\s");
		
		int A = Integer.parseInt(valores[0]);
		int B = Integer.parseInt(valores[1]);
		int C = Integer.parseInt(valores[2]);	
		int D = Integer.parseInt(valores[3]);
		
		if((B > C) && (D > A) && ((C + D) > (A + B)) && (C >= 0 && D >= 0) && (A %2 == 0)) {
			System.out.println("Valores aceitos");
		}else {
			System.out.println("Valores nao aceitos");
		}
	}
}

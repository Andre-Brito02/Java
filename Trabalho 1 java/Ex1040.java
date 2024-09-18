import java.util.Scanner;
import java.io.IOException;
import java.text.DecimalFormat;

public class Ex1040 {
    public static void main(String[] args)throws IOException {
		Scanner s = new Scanner(System.in);
		
		String linha = s.nextLine();
		String[] valores = linha.split("\\s");
		
		double n1 = Double.parseDouble(valores[0]);
		double n2 = Double.parseDouble(valores[1]);
		double n3 = Double.parseDouble(valores[2]);
		double n4 = Double.parseDouble(valores[3]);
		double n_exame = 0.0;
		double media = 0.0;
		double media_exame = 0.0;
		
		media = (double)((n1 * 2) + (n2 * 3) + (n3 * 4) + n4) / 10.0;
		
		DecimalFormat df = new DecimalFormat("#.#");
		String n = df.format(media);
		
		if(media >= 7.0) {
			System.out.printf("Media: %s\n", n);
			System.out.println("Aluno aprovado.");
		}
		
		else if(media < 5.0) {
			System.out.printf("Media: %s\n", n);
			System.out.println("Aluno reprovado.");
		}
		
		else if(media >= 5.0 && media <= 6.9) {
			System.out.printf("Media: %s\n", n);
			System.out.println("Aluno em exame.");
			n_exame = s.nextDouble();
			System.out.printf("Nota do exame: %.1f\n", n_exame);
			media_exame = (media + n_exame) / 2;
			
			if(media_exame >= 5.0) {
				System.out.println("Aluno aprovado.");
				System.out.printf("Media final: %.1f\n", media_exame);
			}
			
			else {
				System.out.println("Aluno reprovado.");
				System.out.printf("Media final: %.1f\n", media_exame);
			}
			
		}
					
	}//static void
}

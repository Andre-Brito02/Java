import java.io.IOException;
import java.util.Scanner;

public class Ex1061 {
    public static void main(String[] args) throws IOException{
        Scanner s = new Scanner (System.in);

        System.out.printf("Digite que dia iniciou: \n");
        int n1 = s.nextInt();

        System.out.printf("Digite em sequencia a hora, minutos e segundos: \n");
        int n2 = s.nextInt();
        int n3 = s.nextInt();
        int n4 = s.nextInt();

        System.out.printf("\nDigite que dia finalizou: \n");
        int n5 = s.nextInt();

        System.out.printf("Digite em sequencia a hora, minutos e segundos: \n");
        int n6 = s.nextInt();
        int n7 = s.nextInt();
        int n8 = s.nextInt();

        int n11 = n1 * 86400;
        int n22 = n2 * 3600;
        int n33 = n3*60;
        int total1 = n11 + n22 + n33 + n4;

        int n55 = n5 * 86400;
        int n66 = n6 * 3600;
        int n77 = n7*60;
        int total2 = n55 + n66 + n77 + n8;

        int result = total2 - total1;
        int dia = result/86400;
        int resto = result%86400;
        int hora = resto/3600;
        resto = resto%3600;
        int min = resto/60;
        resto = resto%60;
        int sec = resto;

        System.out.printf("\n"+ dia + " Dia(s)\n" + hora + " Hora(s)\n" + min + " Minuto(s)\n" + sec + " Segundo(s)");

    }
}

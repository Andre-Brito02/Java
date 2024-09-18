import java.io.IOException;
import java.util.Scanner;

public class Ex1153 {
    public static void main(String[] args) throws IOException{
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int fatorial = 1;

        for(int i = 1; i <= n; i++){
            fatorial *= i;
        }

        System.out.println(fatorial);
    }
}

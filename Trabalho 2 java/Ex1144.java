import java.io.IOException;
import java.util.Scanner;

public class Ex1144 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 1; i <= N; i++) {
            int val1 = i;
            int val2 = i * i;
            int val3 = i * i * i;

            System.out.printf("%d %d %d%n", val1, val2, val3);
            System.out.printf("%d %d %d%n", val1, val2 + 1, val3 + 1); 
        }
   }
}
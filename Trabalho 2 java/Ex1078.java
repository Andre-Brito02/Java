import java.io.IOException;
import java.util.Scanner;

public class Ex1078 {
    public static void main(String args[])throws IOException{
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.printf("%d x %d = %d\n", i, n, i*n);
        }
    }
}

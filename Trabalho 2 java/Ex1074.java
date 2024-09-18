import java.io.IOException;
import java.util.Scanner;

public class Ex1074{
    public static void main(String args[])throws IOException{
        Scanner s = new Scanner(System.in);

        int vezes = s.nextInt();

        for(int i = 0; i < vezes; i++){
            int num = s.nextInt();

            if(num == 0){
                System.out.println("NULL");
            }

            else if(num %2 == 0 && num > 0){
                System.out.println("EVEN POSITIVE");
            }

            else if(num %2 == 0 && num < 0){
                System.out.println("EVEN NEGATIVE");
            }

            else if(num %2 != 0 && num > 0){
                System.out.println("ODD POSITIVE");
            }

            else if(num %2 != 0 && num < 0){
                System.out.println("ODD NEGATIVE");
            }
        }

    }
}
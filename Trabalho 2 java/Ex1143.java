import java.io.IOException;
import java.util.Scanner;

public class Ex1143 {
    public static void main(String[] args) throws IOException{
        Scanner s = new Scanner(System.in);

        int i = s.nextInt();
        int contador = 0;

        while(contador < i){
            
            for(int j = 1; j <= 3; j++){
                System.out.print((int)Math.pow(contador+1, j) + " ");
            }

            System.out.println();
            
            contador++;
        }
    }
}

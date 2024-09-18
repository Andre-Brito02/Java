import java.io.IOException;
import java.util.Scanner;

public class Ex1164 {
    public static void main(String[] args) throws IOException{
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int soma = 0;

        for(int i = 0; i < n; i++){
            int x = s.nextInt();

            for(int j = 1; j <= x; j++){
                if(j == x){
                    continue;
                }
                
                else if(x %j == 0){
                    soma += j;
                    System.out.println(soma);
                }
            }//for j
            if(soma == x){
                System.out.println("" + x + " eh perfeito");
            }else{
                System.out.println("" + x + " nao eh perfeito");
            }
            soma = 0;
        }//for
    }
}
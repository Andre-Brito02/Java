import java.io.IOException;
import java.util.Scanner;

public class Ex1159 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        boolean t = true;
        int soma = 0, contador = 0;

        for(;t;){
            int x = s.nextInt();
            contador = 0;
            soma = 0;
            
            if(x == 0){
                t = false;
                continue;
            }
            
            else{
                while(t){
                    if(x %2 == 0){
                        soma += x;
                        contador++;
                    }

                    if(contador == 5){
                        t = false;
                        continue;
                    }

                    x++;
                }//while
                System.out.println(soma);
            }//else
            t = true;
        }//for

    }
}

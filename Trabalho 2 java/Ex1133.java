import java.io.IOException;
import java.util.Scanner;

public class Ex1133 {
    public static void main(String[] args) throws IOException{
        Scanner s = new Scanner(System.in);

        int x = s.nextInt();
        int y = s.nextInt();
        int maior = 0, menor = 0;

        if(x > y){
            maior = x;
            menor = y;
        }

        else if(y > x){
            maior = y;
            menor = x;
        }

        else{
            maior = x;
            menor = y;
        }

        while(menor < maior){
            if(menor >= 0){
                if(menor %5 == 2 || menor %5 == 3){
                    System.out.println(menor);
                }
            }
                        
            menor++;
        }
    }
}

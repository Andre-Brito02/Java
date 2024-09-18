import java.io.IOException;
import java.util.Scanner;

public class Ex1132 {
    public static void main(String[] args) throws IOException{
        Scanner s = new Scanner(System.in);

        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int maior = 0, menor = 0, soma = 0;

        if(num1 > num2){
            maior = num1;
            menor = num2;
        }

        else if(num2 > num1){
            maior = num2;
            menor = num1;
        }

        else{
            maior = num1;
            menor = num2;
        }

        while(menor <= maior){
            if(menor %13 != 0){
                soma += menor;
            }
            
            menor++;
        }

        System.out.println(soma);
    }    
}

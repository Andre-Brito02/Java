import java.io.IOException;
import java.util.Scanner;

public class Ex1114 {
    public static void main(String[] args)throws IOException {
        Scanner s = new Scanner(System.in);

        int senha = 2002;
        boolean x = true;

        while(x){
            int tentativa_senha = s.nextInt();

            if(tentativa_senha == senha){
                System.out.println("Acesso Permitido");
                x = false;
                continue;
            }else{
                System.out.println("Senha Invalida");
            }
        }
    }
}

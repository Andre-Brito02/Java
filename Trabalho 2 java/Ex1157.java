import java.io.IOException;
import java.util.Scanner;

public class Ex1157 {
    public static void main(String[] args) throws IOException{
        Scanner s = new Scanner(System.in);

        int valor = s.nextInt();

        for(int i = 1; i <= valor;i++){
            if(valor %i == 0){
                System.out.println(i);
            }
        }
    }
}

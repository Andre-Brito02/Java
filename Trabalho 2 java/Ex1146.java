import java.io.IOException;
import java.util.Scanner;

public class Ex1146 {
    public static void main(String[] args) throws IOException{
        Scanner s = new Scanner(System.in);

        boolean x = true;

        while(x){
            int valor = s.nextInt();

            if(valor == 0){
                x = false;
                continue;
            }else{
                for(int i = 1; i <= valor; i++){
                    if(i == valor){
                        System.out.printf("%d\n", i);
                    }else
                        System.out.printf("%d ", i);
                }
            }
        }
    }
}

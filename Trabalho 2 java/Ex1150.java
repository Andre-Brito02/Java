import java.io.IOException;
import java.util.Scanner;

public class Ex1150 {
    public static void main(String[] args) throws IOException{
        Scanner s = new Scanner(System.in);

        int x = s.nextInt();
        int z = s.nextInt();
        int contador = 0, soma = x;
        boolean t = true;

        while(t){
            if(x >= z){
                z = s.nextInt();
            }

            else if(z > x){
                t = false;
                continue;
            }
        }//while

        for(int i = 1; i < z; i++){
            if(soma < z){
                contador++;
            }else{
                break;
            }
            soma += x+i;
        }
        //contador nums que somados em sequencia sao menores q z, contador+1 nums que somados ultaprassam z 
        System.out.println(contador+1);
    }
}

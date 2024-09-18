import java.io.IOException;
import java.util.Scanner;

public class Ex1134 {
    public static void main(String[] args) throws IOException{
        Scanner s = new Scanner(System.in);

        int alcool = 0, gasolina = 0, diesel = 0;
        boolean x = true;
        
        while(x){
            int produto = s.nextInt();
            if(produto > 0){

                if(produto == 1){
                    alcool++;
                }

                else if(produto == 2){
                    gasolina++;
                }

                else if(produto == 3){
                    diesel++;
                }

                else if(produto == 4){
                    x = false;
                    continue;
                }

                else{
                    continue;
                }

            }else{
                break;
            }
        }//while

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }
}

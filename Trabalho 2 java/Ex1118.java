import java.io.IOException;
import java.util.Scanner;

public class Ex1118 {
    public static void main(String[] args)throws IOException {
        Scanner s = new Scanner(System.in);

        boolean x = true;
        int nota_valida = 0;
        double media = 0;

        while(x){
            double nota = s.nextDouble();

            if(nota < 0 || nota > 10){
                System.out.println("nota invalida");
                continue;
            }else{
                media += nota;
                nota_valida++;

                if(nota_valida == 2){
                    System.out.printf("media = %.2f\n", media/2);
                    
                    System.out.println("novo calculo (1-sim 2-nao)");
                    int novo_calculo = s.nextInt();
                        
                    if(novo_calculo == 1){
                        nota_valida = 0;
                        media = 0;
                        continue;
                    }

                    else if(novo_calculo == 2){
                        x = false;
                        continue;
                    }
                    
                    else{
                        System.out.println("novo calculo (1-sim 2-nao)");
                        novo_calculo = s.nextInt();

                        if(novo_calculo == 1){
                            nota_valida = 0;
                            media = 0;
                            continue;
                        }
    
                        else if(novo_calculo == 2){
                            x = false;
                            continue;
                        }
                        
                    }
                    
                }
            }
        }
    }
}

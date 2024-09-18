import java.io.IOException;
import java.util.Scanner;

public class Ex1048 {
    public static void main(String[] args)throws IOException{
        Scanner s = new Scanner(System.in);  
    
        double salario = s.nextDouble();
        double reajuste = 0;
        double novo_salario = 0;
        char p = 37;

        if(salario >= 0.0 && salario <= 400.00){
            reajuste = salario * 0.15;
            novo_salario = salario + reajuste;

            System.out.printf("Novo salario: %.2f\n",novo_salario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.printf("Em percentual: 15 %c\n", p);
        }

        else if(salario >= 400.01 && salario <= 800.00){
            reajuste = salario * 0.12;
            novo_salario = salario + reajuste;

            System.out.printf("Novo salario: %.2f\n",novo_salario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.printf("Em percentual: 12 %c\n", p);
        
        }
        
        else if(salario >= 800.01 && salario <= 1200.00){
            reajuste = salario * 0.10;
            novo_salario = salario + reajuste;

            System.out.printf("Novo salario: %.2f\n",novo_salario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.printf("Em percentual: 10 %c\n", p);
        }
        
        else if(salario >= 1200.01 && salario <= 2000.00){
            reajuste = salario * 0.07;
            novo_salario = salario + reajuste;

            System.out.printf("Novo salario: %.2f\n",novo_salario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.printf("Em percentual: 7 %c\n", p);
        }

        else{
            reajuste = salario * 0.04;
            novo_salario = salario + reajuste;

            System.out.printf("Novo salario: %.2f\n",novo_salario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.printf("Em percentual: 4 %c\n", p);
        }

    }//static void
}

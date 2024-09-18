import java.io.IOException;
import java.util.Scanner;

public class Ex1051 {
    public static void main (String[] args) throws IOException{
        Scanner s = new Scanner (System.in);

        System.out.printf("Digite seu salario: \n");
        double sal = s.nextFloat();

        double sal1 = sal - 2000;

        if ((sal >= 0) && (sal <= 2000)){
        System.out.printf("Voce esta isento a taxas");}

        else if ((sal > 2000) && (sal <= 3000)){
        double tax = sal1 * 0.08;
        System.out.printf("Voce foi taxado em R$ " + tax);}

        else if((sal > 3000) && (sal <= 4500)){
        double resto = sal1 - 1000;
        double taxar = resto *0.18;
        double sala = 1000;
        double taxas = sala * 0.08;
        double total = taxas + taxar;
        System.out.printf("Voce foi taxado em R$ " + total);}

        else if(sal > 4500){
            double txa1 = 0.08;
            double txa2 = 0.18;
            double txa3 = 0.28;
            double stxa1 = 1000;
            double stxa2 = sal1 - 2500;
            double stxa3 = sal - 4500;
            double c1 = 1000 * txa1;
            double c2 = 1500 *txa2;
            double c3 = (sal - 4500) * txa3;
            double total = c1 + c2 + c3;
            System.out.printf("Voce foi taxado em R$ " + total);}


    }
}

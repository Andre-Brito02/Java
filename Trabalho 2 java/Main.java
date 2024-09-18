import java.util.Scanner;

public class Main {
    public static void mudaQ1Q3(double q1, double q2, double q3, double a, double b){
        double r12Antes = b;
        double r13Antes = a;
        double r23Antes = a;
        double r12depois = a;
        double r13depois = a;
        double r23depois = b;
        double constante = 8.99 * Math.pow(10, 9);
        double Ui = constante * ( ((q1*q2)/r12Antes) + ((q1*q3)/r13Antes) + ((q2*q3)/r23Antes));
        double Uf = constante * ( ((q1*q2)/r12depois) + ((q1*q3)/r13depois) + ((q2*q3)/r23depois));
        double W = Uf - Ui;

        System.out.printf("\nEnergia potencial elétrica antes da mudança: %.2f J\n", Ui);
        System.out.printf("Energia potencial elétrica depois da mudança: %.2f J\n", Uf);
        System.out.printf("Trabalho realizado: %.2f J\n", W);
    }

    public static void mudaQ1Q2(double q1, double q2, double q3, double a, double b){
        double r12Antes = b;
        double r13Antes = a;
        double r23Antes = a;
        double r12depois = b;
        double r13depois = a;
        double r23depois = a;
        double constante = 8.99 * Math.pow(10, 9);
        double Ui = constante * ( ((q1*q2)/r12Antes) + ((q1*q3)/r13Antes) + ((q2*q3)/r23Antes));
        double Uf = constante * ( ((q1*q2)/r12depois) + ((q1*q3)/r13depois) + ((q2*q3)/r23depois));
        double W = Uf - Ui;

        System.out.printf("\nEnergia potencial elétrica antes da mudança: %.2f J\n", Ui);
        System.out.printf("Energia potencial elétrica depois da mudança: %.2f J\n", Uf);
        System.out.printf("Trabalho realizado: %.2f J\n", W);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de Q1: ");
        double q1 = sc.nextDouble();
        q1 *= Math.pow(10, -6);

        System.out.print("Digite o valor de Q2: ");
        double q2 = sc.nextDouble();
        q2 *= Math.pow(10, -6);

        System.out.print("Digite o valor de Q3: ");
        double q3 = sc.nextDouble();
        q3 *= Math.pow(10, -6);

        System.out.print("Digite o valor de A: ");
        double a = sc.nextDouble();
        a /= 100.0;

        System.out.print("Digite o valor de B: ");
        double b = sc.nextDouble();
        b /= 100.0;

        mudaQ1Q3(q1, q2, q3, a, b);
        mudaQ1Q2(q1, q2, q3, a, b);
    }
}
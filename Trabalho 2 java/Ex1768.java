import java.util.Scanner;
import java.io.IOException;

public class Ex1768 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int n = scanner.nextInt();

            if (n % 2 == 0) {
                n--; // Garante que o tamanho da árvore seja ímpar
            }

            int trunkHeight = n / 20; // Altura do tronco da árvore
            int crownHeight = (n ); // Altura da copa da árvore

            for (int i = 1; i <= crownHeight; i += 2) {
                int spaces = (n - i) / 2;

                for (int j = 0; j < spaces; j++) {
                    System.out.print(" ");
                }

                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }

                System.out.println();
            }
            
            int spaces = (n - 1) / 2;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            System.out.println("*"); 

            int trunkTopWidth = (n - 3) / 2;
            for (int i = 0; i < trunkTopWidth; i++) {
                System.out.print(" ");
            }
            System.out.println("***"); 

            System.out.println(); 
        }
    }
}

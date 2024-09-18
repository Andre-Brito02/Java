import java.util.Scanner;
import java.io.IOException;

public class Ex1253 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int numCases = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha pendente

        for (int i = 0; i < numCases; i++) {
            String sentence = scanner.nextLine();
            int shift = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha pendente

            StringBuilder decodedSentence = new StringBuilder();

            for (int j = 0; j < sentence.length(); j++) {
                char c = sentence.charAt(j);

                if (c >= 'A' && c <= 'Z') {
                    char decodedChar = (char) ('A' + ((c - 'A' - shift + 26) % 26));
                    decodedSentence.append(decodedChar);
                } else {
                    decodedSentence.append(c);
                }
            }

            System.out.println(decodedSentence.toString());
        }
    }
}

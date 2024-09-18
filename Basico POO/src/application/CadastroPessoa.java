package application;
import java.util.Scanner;
import entities.DadosPessoa;

public class CadastroPessoa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite seu email: ");
        String email = sc.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        DadosPessoa novoCadastro = new DadosPessoa(nome, email, idade);

        System.out.println(novoCadastro);

        sc.close();
    }

}
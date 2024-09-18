package application;

import java.util.Scanner;
import entities.DadosAluno;

public class CadastroAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = sc.nextLine();
        System.out.print("Digite a nota do 1° Trimestre do aluno: ");
        double notaTrimestre1 = sc.nextDouble();
        System.out.print("Digite a nota do 2° Trimestre do aluno: ");
        double notaTrimestre2 = sc.nextDouble();
        System.out.print("Digite a nota do 3° Trimestre do aluno: ");
        double notaTrimestre3 = sc.nextDouble();

        DadosAluno novoAluno = new DadosAluno(nome, notaTrimestre1, notaTrimestre2, notaTrimestre3);

        System.out.println(novoAluno);
        sc.close();
    }
}

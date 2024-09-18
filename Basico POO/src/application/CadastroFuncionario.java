package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.DadosFuncionario;

public class CadastroFuncionario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<DadosFuncionario> dados = new ArrayList<>();
        int contador = 0;

        System.out.print("Quantos funcionários serão registrados? ");
        int qtd = sc.nextInt();

        for(int i = 0; i < qtd; i++) {
            sc.nextLine();

            System.out.printf("\nFuncionário #%d: \n", i+1);
            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Salário: ");
            double salario = sc.nextDouble();

            dados.add(new DadosFuncionario(id, nome, salario));
        }

        System.out.print("\nDigite o id do funcionário que receberá aumento: ");
        int id = sc.nextInt();

        for(DadosFuncionario obj: dados) {
            if(obj.getId() == id) {
                double novoSalario = obj.aumentaSalario();
                obj.setSalario(novoSalario);
            }else {
                contador++;
                if(contador == qtd) {
                    System.out.println("Esse Id não existe.");
                }
            }
        }

        System.out.println();
        for(DadosFuncionario obj: dados) {
            System.out.println(obj.getId() + " " + obj.getNome() + " " + obj.getSalario());
        }

        sc.close();
    }
}
package application;

import entities.Product;
import entities.ImportedProduct;
import entities.UsedProduct;

import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println("Product #" + i + " data: ");
            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();

            if(ch == 'i'){
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                System.out.print("Custom fee: ");
                double customFee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, customFee));
            }

            else if(ch == 'c'){
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                list.add(new Product(name, price));
            }

            else if (ch == 'u') {
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                list.add(new UsedProduct(name, price, date));
            }
        }

        System.out.println("\nPrice tags:");
        for(Product p : list){
            System.out.println(p.priceTag());
        }

        sc.close();
    }
}

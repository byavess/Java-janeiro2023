package Aula75Construtores;

import OrientadaObjeto.entities.Material;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaMaterial {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
// Aula This construrores foi comentada pra
        //aproveitar o codiogo pra aula seguinte

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();
        Material material = new Material(name, price, quantity);
       material.setName("Computer");
        System.out.println("updated name : " + material.getName());
        material.setPrice(1200);
        System.out.println("updated name : " + material.getPrice());

        System.out.println();
        System.out.println("Product data: " + material);
        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        quantity = sc.nextInt();
        material.addProducts(quantity);
        System.out.println();
        System.out.println("Updated data: " + material);


        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        material.removeProducts(quantity);
        System.out.println();
        System.out.println("Updated data: " + material);
        sc.close();

    }
}
  //Aula sobrecarga Cosntrutores


//        System.out.println("Enter product data: ");
//        System.out.print("Name: ");
//        String name = sc.nextLine();
//        System.out.print("Price: ");
//        double price = sc.nextDouble();
//// na hora de estaciar o construtor o new deve selecionar o construtor
//        Material material = new Material(name, price);
//        System.out.println();
//        System.out.println("Product data: " + material);
//        System.out.println();
//        System.out.print("Enter the number of products to be added in stock: ");
//        int quantity = sc.nextInt();
//        material.addProducts(quantity);
//        System.out.println();
//        System.out.println("Updated data: " + material);
//        System.out.println();
//        System.out.print("Enter the number of products to be removed from stock: ");
//        quantity = sc.nextInt();
//        material.removeProducts(quantity);
//        System.out.println();
//        System.out.println("Updated data: " + material);
//        sc.close();
//    }


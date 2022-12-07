package OrientadaObjeto;

import OrientadaObjeto.application.ProgramaMaterial;

import java.util.Locale;
import java.util.Scanner;

public class ProgramToString {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ProgramaMaterial product = new ProgramaMaterial();
        System.out.println("Enter product data: ");
        System.out.print("name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.println();
        System.out.println( "Product data : " + product);


        System.out.println();
        System.out.print("Entrer the number fo products to be added in stock: " );
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println( "Product data : " + product);

        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removePrducts(quantity);

        System.out.println();
        System.out.println( "Product data : " + product);


        sc.close();

    }



}
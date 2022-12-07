package OrientadaObjeto.application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramProduct {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ProgramaMaterial product = new ProgramaMaterial();
        System.out.println("Enter product data: ");
        System.out.println("name: ");
        product.name = sc.nextLine();
        System.out.println("Price: ");
        product.price = sc.nextDouble();
        System.out.println("Quantity in stock: ");
        product.quantity = sc.nextInt();
        System.out.println(product.name + "," + product.price + "," + product.quantity);

        sc.close();

    }



}

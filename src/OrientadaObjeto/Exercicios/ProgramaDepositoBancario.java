package OrientadaObjeto.Exercicios;

import OrientadaObjeto.entities.Material;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaDepositoBancario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter account number: ");
        double numeroConta = sc.nextDouble();



        System.out.println("Enter account holder: ");
        String name = sc.nextLine();

        System.out.println( " Is there na inital deposit (y/n)? ");
        boolean iniciar = sc.nextBoolean();




        System.out.print("valorDeposito : ");
        int valorDeposito = sc.nextInt();

        DepositoBancario depositoBancario = new DepositoBancario(name,
                numeroConta, valorDeposito, iniciar);


       // depositoBancario.setName("Computer");



        System.out.println("updated name : " + depositoBancario.getName());
        depositoBancario.setnumeroConta(1200);
        System.out.println("updated name : " + depositoBancario.getnumeroConta());

        System.out.println();
        System.out.println("Product data: " + depositoBancario);
        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        valorDeposito = sc.nextInt();
        depositoBancario.addProducts(valorDeposito);
        System.out.println();
        System.out.println("Updated data: " + depositoBancario);


        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        valorDeposito = sc.nextInt();
        depositoBancario.removeProducts(valorDeposito);
        System.out.println();
        System.out.println("Updated data: " + depositoBancario);
        sc.close();

    }
}

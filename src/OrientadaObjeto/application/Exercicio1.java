package OrientadaObjeto.application;

import OrientadaObjeto.entities.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        System.out.println("Digite a largura e altura do retangulo: ");
        retangulo.width = sc.nextDouble();
        retangulo.height = sc.nextDouble();
        System.out.printf ("AREA = %.2f%n ", retangulo.area());
        System.out.printf("Perimetro =  %.2f%n", retangulo.perimeter());
        System.out.printf("Diagonal =  %.2f%n", retangulo.diagonal());

        sc.close();

    }


}

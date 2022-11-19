package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Escaner {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
//        String x ;
//         x = sc.next();
//        System.out.println("Você digitou: "+x);
//
//        int F;
//        F = sc.nextInt();
//        System.out.println("Voce digitou : "+ F);
//
//        double R;
//        R = sc.nextDouble();
//        System.out.println("Voce digitou : "+ R);
//        System.out.printf("Voce digitou : ", R);
//
//

//        double A;
//                   A = sc.next().charAt(0);
//        System.out.println("Voce digitou : "+ A);
//
//                      System.out.println();

        String w;
        int p;
        double z;
        w = sc.next();
        p = sc.nextInt();
        z = sc.nextDouble();

        System.out.println("dados digitados: ");
        System.out.println(w);
        System.out.println(p);
        System.out.println(z);


        sc.close();
    }
}

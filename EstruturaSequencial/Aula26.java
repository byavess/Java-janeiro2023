package EstruturaSequencial;

import java.util.Scanner;

public class Aula26 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1, s2, s3;
        int x;
        x = sc.nextInt();
        sc.nextLine();// esse foi o segundo *passo. feito pra corrigir o erro

        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("DADOS DIGITADOS: ");
        System.out.println(x); // primerio passo *erro pois foi consumido o next line do s1 tampando o buraco do enter que não foi digitado nada
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);// não sai devido o erro do enter entre a quebra de linha, por isso quebra de linha pendente pois o nextInt não leu a linha toda


        sc.close();

    }
}

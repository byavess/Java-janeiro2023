package EstruturaSequencial;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        System.out.println("olá mundo!");//ln no final quebra de linha
        System.out.print("Olá mundo!");
        System.out.println("Olá!");
        int y = 32;
        System.out.println(y);
        double x = 10.35784;
        System.out.println(x);
        System.out.printf("%.2f%n", x); //formatar o numero de casas decimais e arredonda o numero
        System.out.printf("%.4f%n", x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x);
        System.out.println("RESULTADO = "+ x + " METROS");
        System.out.printf("RESULTADO = %.2f metros%n ",x );


        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);//vários valores concatenados
    }
}

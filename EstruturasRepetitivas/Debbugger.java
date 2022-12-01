package EstruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Debbugger {

        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            double largura = sc.nextDouble();
            double compimento = sc.nextDouble();
            double metroQuadrado = largura * compimento;

            double area = largura * metroQuadrado;
            double preco = area * metroQuadrado;

            System.out.printf("AREA %.2f%n", area);
            System.out.printf("PREÇO = %.2f%n", preco);

        }
    }



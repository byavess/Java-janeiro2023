package EstruturaSequencial;

import java.util.Locale;

public class exercicio1 {
    public static void main(String[] args) {
        String product1 = "Computer";
        String product2 = "Office desk";

        int age =30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;
        System.out.println("Products:  ");
        System.out.printf( product1 + ", which price is R$%.2f%n", price1);
        System.out.printf( product2 +", which price is R$%.2f%n", price2 );
        System.out.println("");
        System.out.print("Record: ");
        System.out.println(age + " years old, code  "+ code +" and gender : "+ gender );
        System.out.println("");
        System.out.printf("Measue with eight decimal places: " + measure+"%n"+ "Rouded three decima plcaes: ", measure);

        Locale.setDefault(Locale.US);
        System.out.printf("%f ", measure);
    }
}

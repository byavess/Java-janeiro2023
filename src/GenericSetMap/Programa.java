package GenericSetMap;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PrintService<Integer> ps = new PrintService<>(); // 2com a alteração pra tip <T> do service não deixar passar "Maria"

        System.out.println("How many values? ");
        int n = sc.nextInt();

       // ps.addValue("Maria");//1 vai da erro que se chama o type safety que e a segurança de tipos >>tem que fazer ajustes tipos casting não e a melhor opoção ai onde entra o generics
        for ( int i = 0; i < n ; i ++){
            int value = sc.nextInt();
            ps.addValue(value);
        }
        ps.print();
        //Integer x = (Integer) ps.first(); //casting (interger) j
        Integer x =  ps.first();//o type  safe vai retronar o Integer, assim não precisa fazer o casting
        System.out.println("First: " + ps.first());
        sc.close();

    }
}

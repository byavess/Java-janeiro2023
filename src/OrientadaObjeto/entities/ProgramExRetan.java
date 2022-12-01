package OrientadaObjeto.entities;

import OrientadaObjeto.ExercicosRetangulo;

import java.util.Locale;
import java.util.Scanner;

public class ProgramExRetan {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
          ExercicosRetangulo retangulo = new ExercicosRetangulo();
        System.out.println("Enter retangulo width and height: ");
        System.out.println("Width: " );
        retangulo.Width = sc.nextDouble();
        System.out.println("He retangulo.Heigth = sc.nextDouble();igth: ");
        retangulo.Heigth = sc.nextDouble();
        double area = sc.nextDouble();
        retangulo.area();


sc.close();


    }
}

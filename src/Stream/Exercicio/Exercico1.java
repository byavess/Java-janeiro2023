package Stream.Exercicio;

import FuncionalLambda.Funcao.Product;

// programa ordem crescente e decrescente e ordem alfabetica
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import java.util.stream.Collectors;


public class Exercico1 {


    public static void main(String[] args) {
    Locale.setDefault(Locale.US);
     Scanner sc = new Scanner(System.in);
        System.out.println( "Enter full file path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<ProducExercio1> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(", ");//split recorta
                list.add(new ProducExercio1(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

 double avg = list.stream().map(p -> p.getPrice()).reduce(0.0, (x,y) -> x + y) / list.size();//reducer permite fazer o somatorio dos precos
            System.out.println("Average price : " + String.format("%.2F",avg));

            Comparator<String> com = (s1, s2)  -> s1.toUpperCase().compareTo(s2.toUpperCase());
 List<String> names = list.stream().filter(p -> p.getPrice() < avg).map(p -> p.getName()).sorted(com.reversed()).collect(Collectors.toList());

                names.forEach(System.out::println);

             } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();


    }



}

package FuncionalLambda.Original;


import FuncionalLambda.Product;

import java.util.ArrayList;
import java.util.List;


import java.util.stream.Collectors;

public class FuncionalFunction {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

//map >>>pega a coleção de valores e aplica pra cada coleção
       //1 List<String> names = list.stream().map(Product::staticCaseName).collect(Collectors.toList());//so funciana pra list p

        //Quando chega na lambda in line colocamos a atribuição no lugar do func esse e o ultimo
       // Function<Product,String> func = p -> p.getName().toUpperCase();

       //3 List<String> name = list.stream().map(func).collect(Collectors.toList());
      //2  List<String> name = list.stream().map(Product::nonStaticCaseName).collect(Collectors.toList()); //so acrscentou o non e mudou o s de name da variavel

      //A MELHOR opção Lambda in line

        List<String> name = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

       name.forEach(System.out::println);
    }
}

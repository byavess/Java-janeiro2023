package FuncionalLambda.Original;

import FuncionalLambda.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class funcionalConsumer {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

      // list.forEach(new PriceUpdate()); //vai executar um consumer que tem metodo acepte//atualiza o preço da lista

        double factor = 1.1;
        //primeira maneira

       //list.forEach(System.out::println);//::reference metodo para println
     //   list.forEach(Product::staticPriceUpdate);
        list.forEach(p -> p.setPrice(p.getPrice()*factor));

        //maneira correta
        list.forEach(p -> p.setPrice(p.getPrice() * factor));
    }
}

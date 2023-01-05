package Set.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


//para usar TreeSet a classe entidade tem que ser uma implementação do Comarable<>
public class ProgramaTreeset { public static void main(String[] args) {



    Set<Product> set = new TreeSet<>();

    set.add(new Product ("TV", 900.0));
    set.add( new Product ("Notebook", 1200.0));
    set.add( new Product ("Tablet", 400.0));

   for(Product p : set) {
       System.out.println(p);
   }



}

}

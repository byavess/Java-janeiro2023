package Set.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
//***  -> "tal que"
public class ProgramaSet {
    public static void main(String[] args) {
//        Set<String> set = new HashSet<>();
//        set.add("TV");
//        set.add("Notebook");
//        set.add("Tablet");
//// o hashset não coloca na ordem
//        System.out.println(set.contains("Notebook"));
//
//        for (String p : set ){
//            System.out.println(p);
//        }
//    }

        //***  -> "tal que"
        // esse ordena

//    Set<String> set = new TreeSet<>();
//        set.add("TV");
//        set.add("Notebook");
//        set.add("Tablet");

//        System.out.println(set.contains("Notebook"));
//
//        for (String p : set ){
//        System.out.println(p);
//    }
//}
        //***  -> "tal que"
        // esse mante a ordem

    Set<String> set = new LinkedHashSet<>();
        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");

   set.remove("Tablet");
        set.removeIf(x -> x.length()>=3); //remove quem tem mais de três caracteres
        set.removeIf(x -> x.charAt(0) == 'T');

        for (String p : set ){
        System.out.println(p);
    }
}
}

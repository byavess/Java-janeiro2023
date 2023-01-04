package Interface;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparablePrograma {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String path = "C:\\estudo\\teste\\in.txt";

        try (BufferedReader br = new BufferedReader( new FileReader(path))){
            String name = br.readLine();
            while (name != null){
                list.add(name);
                name = br.readLine();
            }
            Collections.sort(list);// ordena a coleção
            for (String s : list){
                System.out.println(s);
            }

        } catch (IOException e) {
        System.out.println("Error: " +e.getMessage());
        }
    }
}

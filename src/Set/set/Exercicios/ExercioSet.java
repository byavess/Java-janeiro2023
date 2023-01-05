package Set.set.Exercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExercioSet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter file full path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            Set<LogEntry> set = new HashSet<>();
            String line= br.readLine();
            while (line!= null){
                String[] fileds = line.split("");//reconrtando a string
                String username = fileds[0];

                Date moment = Date.from(Instant.parse(fileds[1]));
                set.add(new LogEntry(username,moment));

                line = br.readLine();
            }
            System.out.println("Total users: " + set.size());


        }catch (IOException e ) {
            System.out.printf("Error: "+ e.getMessage());
        }
        sc.close();

    }


}

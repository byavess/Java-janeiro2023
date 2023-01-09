package JPA.Application;

import JPA.Dominio.Pessoa;

public class ProgramaJpa {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa(1, "carlos da silva", "carlosdasilva@gmail.com");
        Pessoa p2 = new Pessoa(2, "Valeria linda", "valerialinda@gmail.com");
        Pessoa p3 = new Pessoa(3, "Joana Dark", "joanadark@gmail.com");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

    }


}

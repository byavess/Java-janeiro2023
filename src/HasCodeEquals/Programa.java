package HasCodeEquals;

public class Programa {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Maria", "maria@gmail.com");
        Cliente c2 = new Cliente("Maria", "maria@gmail.com");


        String s1 = "Test"; // se colocar o new ele força a ser diferente
        String s2 = "Test";// tratamento especial pra literais então tem que forçar com o new

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c1 == c2);// compara a referencia de memoria então vai da false
    }
}

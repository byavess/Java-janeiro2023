package EstruturaCondicional;
//quando ta sem valor ou somente o nome
public class ScopoEVariavelNaoIniciada {
    public static void main(String[] args) {
        double price = 400;
        double discout;
        if(price < 300){
           discout = price * 0.1; //variável dentro do escopo{discout} so vai ser lido dentro desse escopo
            System.out.println(discout);
        }
       // System.out.println(discout); //     System.out.println(discout);fora do scopo{}
        else {
            discout = 0 ;
        }
        System.out.println(discout);
    }
}

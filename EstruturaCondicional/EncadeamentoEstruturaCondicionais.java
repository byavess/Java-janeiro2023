package EstruturaCondicional;

import java.util.Scanner;

// colocando mais di uma condição no if e no else começar com outra condiçao if else novamente
public class EncadeamentoEstruturaCondicionais {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int hora;
        System.out.println("Quantas horas? ");
        hora = sc.nextInt();

        if (hora < 12) {
            System.out.println("Bom dia!");
        }
        else {
            if(hora < 18 ){
                System.out.println("Boa tarde!");


            }
            else {//else if
                System.out.println("Boa noite!");

            }
//            else  if(){
//                pode repetir quantas vezes quiser pra deixar o codigo mais curto
            // no ultimo sempre somente else
//            }



        }
        sc.close();

    }
}

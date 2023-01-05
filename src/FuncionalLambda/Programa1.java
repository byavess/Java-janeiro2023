package FuncionalLambda;

import java.util.Arrays;

public class Programa1 {
    public static int globalValue = 3;
    public static void main(String[] args) {
        int[] vect = new int[] {3, 4, 5};
        changeOddValues(vect); //acrescenta e depende do valor externo .. mais dificl de entender isso e transparencia referencial
        System.out.println(Arrays.toString(vect));
    }
    public static void changeOddValues(int[] numbers) {//percorre o vetor e testa
        for (int i=0; i<numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i] += globalValue;
            }
        }
    }
}

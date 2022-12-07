package OrientadaObjeto.application;

import OrientadaObjeto.entities.Funcionarios;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Exercico2 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Funcionarios funcionarios = new Funcionarios();
        System.out.println("Digite os dados do funcionario: ");
        System.out.println("nome: ");
        funcionarios.nome = sc.nextLine();
        System.out.println("salario: ");
        funcionarios.salarioBruto = sc.nextDouble();
        System.out.println("imposto: ");
        funcionarios.imposto = sc.nextDouble();
        System.out.printf("Nome: ",  funcionarios.nome);
        System.out.printf("Salario Bruto: R$ %.2f%n" , funcionarios.salarioBruto);
        System.out.printf("Imposto: R$ %.2f%n", funcionarios.imposto);

        System.out.println();
        System.out.println("atualização de data: "+ funcionarios);
    }
}

package Interface.exercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("entre com os dados do contrato");
        System.out.print("numero");
        int number = sc.nextInt();
        System.out.println("Data(dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), fmt);
        System.out.println("valor do contrato");
        double totalValue = sc.nextDouble();

        Contract obj= new Contract(number, date, totalValue);

        System.out.print("Entre om o numero de parcelas: ");
        int n = sc.nextInt();

        ContractService contractService = new ContractService(null);
        ContractService.processContract(obj,n);

        System.out.println("Parcelas");
        for (Instalmente instalmente : obj.getInstalments()){
            System.out.println(instalmente);
        }




        sc.close();
    }
}

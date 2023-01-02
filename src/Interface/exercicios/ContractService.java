package Interface.exercicios;

import java.time.LocalDate;

public class ContractService {

    private OnlinePaymenteService onlinePaymenteService;

    public ContractService(OnlinePaymenteService onlinePaymenteService) {
        this.onlinePaymenteService = onlinePaymenteService;
    }

    public static void processContract(Contract contract, int months){
        for ( int i = 1; i<= months; i++){
            LocalDate dueDate= contract.getDate().plusMonths(i);
        }

    }
}

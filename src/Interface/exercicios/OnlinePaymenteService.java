package Interface.exercicios;

public interface OnlinePaymenteService {

    double paymentFee(double amount);
    double interest(double amount, int months );

}

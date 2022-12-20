package entities;

public class BusinesAccount extends Account { //extends pra ser herdada a classe

    private Double loanLimit;
    public BusinesAccount(){

    }
    public BusinesAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);//constrtutor criado automatico fazendo a heranca chamando o construtor da super clase
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }



    public void loan (double amount){
        if(amount<= loanLimit) {
         //   deposit(amount);// testando o erro do protected
            balance += amount - 10.0;
        }
    }
    @Override
    public void withdraw(double amount){
       super.withdraw(amount);
       balance -= 2.0;
    }


}

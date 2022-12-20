package application;

import entities.Account;
import entities.BusinesAccount;
import entities.SavingsAccount;

public class ProgramaCasting {
    public static void main(String[] args) {
        Account acc = new Account(1001, "Alex",0.0);
        BusinesAccount bacc = new BusinesAccount(1002, "Maria", 0.0,500.0);

        //UPCASTING

        Account acc1 = bacc;
        Account acc2 = new BusinesAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        //DOWNCASTING  da super classe pra subclasse



       // BusinesAccount acc4 = acc2; //
        BusinesAccount acc4 = (BusinesAccount) acc2; // dessa forma com parenteses força a fazer o downcasting
        acc4.loan(100.0);
        //BusinesAccount acc5 = (businesAccount0acc3;//nem sempre da certo por conta do compilador ai tem que usar o instanceof
        if(acc3 instanceof BusinesAccount) {
            BusinesAccount acc5 = (BusinesAccount)acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }
        if (acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount)acc3;
            acc5.updateBalance();
            System.out.println("UPDATE");
        }


        }

    }


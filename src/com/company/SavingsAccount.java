package com.company;

public class SavingsAccount extends Account{
    private final double interestRate;

    public SavingsAccount(int idNumber, double startBal, double interest){
        super(idNumber, startBal);
        interestRate = interest;
    }

    public void withdraw(double amount){
        if(currentBalance() > amount) {
            decreaseBalance(amount);
        }
    }

    public double monthlyInterest() {
        return currentBalance() * (interestRate / 12 );
    }
}

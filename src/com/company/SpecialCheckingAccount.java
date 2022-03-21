package com.company;

public class SpecialCheckingAccount extends CheckingAccount{
    private double annualInterestRate;
    private double minBalance;

    public SpecialCheckingAccount(int idNumber, double startBal, double cc, double air, double min){
        super(idNumber, startBal, cc);
        annualInterestRate = air;
        minBalance = min;
    }

    public void clearCheck(double amount) {
        if (currentBalance() > minBalance){
            decreaseBalance(amount);
        }
        else{
            super.clearCheck(amount);
        }
    }

    public double monthlyInterest(){
        double x = annualInterestRate / 12;
        return currentBalance() * x;
    }
}

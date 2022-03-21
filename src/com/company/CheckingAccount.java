package com.company;

public class CheckingAccount extends Account {

    /**
     * @param idNumber
     * @param startBal
     */
    private double checkCharge;

    public CheckingAccount(int idNumber, double startBal, double cc) {
        super(idNumber, startBal);
        checkCharge = cc;
    }

    public void clearCheck(double amount)
    {
        decreaseBalance(amount + checkCharge);
    }

    public double monthlyInterest() {
        return 1.0;
    }

}

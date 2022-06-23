/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.BankingApp;

/**
 *
 * @author Me
 */
public class Savings extends Debit{
    double transactionFee;
    
    public Savings (double balance) {
        super(balance, 0.025);
        transactionFee = 5;
    }
    
    public void withdraw(double amount) {
        if(balance - amount - transactionFee >= 0) {
            super.withdraw(amount+transactionFee);
        }
    }
}

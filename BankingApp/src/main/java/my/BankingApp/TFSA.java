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
public class TFSA extends Debit{
    double contributionLimit;
    double runningContribution;
    
    public TFSA(double balance) {
        super(balance, 0.02);
        contributionLimit = 6000;
    }
    
    public void deposit(double amount) {
        if (runningContribution + amount <= 6000) {
            runningContribution += amount;
            super.deposit(amount);
        }
    }
    
    public void newYear() {
        runningContribution = 0;
    }
}

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
public class Debit {
    double balance;
    double interest;
    
    public Debit(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }
    
    public void deposit(double amount) {
        balance += amount;     
    }
    
    public void withdraw(double amount) {
        if (balance - amount >= 0) {
            balance -= amount;
        }   
    }
    
    public void addInterest(){
        balance += balance*interest;
    }
}

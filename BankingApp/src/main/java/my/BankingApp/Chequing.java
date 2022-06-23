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
public class Chequing extends Debit{
    public Chequing (double balance) {
        super(balance, 0.01);
    }
}

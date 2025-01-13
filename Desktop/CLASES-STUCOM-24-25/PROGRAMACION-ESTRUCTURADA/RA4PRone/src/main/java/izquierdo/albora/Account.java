/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package izquierdo.albora;

/**
 *
 * @author Usuario 1
 */
public class Account {
    //private long number;
    private double balance;
    private String holder;

    public Account(double balance, String holder) {
        //this.number = number;
        //THIS.NUMBER = NUMBER;
        this.balance = balance;
        this.holder = holder;
    }


   // public long getNumber() {
        //return number;
    //}

    public double getBalance() {
        return balance;
    }

    public String getHolder() {
        return holder;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }
    
    
    

}



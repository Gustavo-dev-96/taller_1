/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1;

import javax.swing.JOptionPane;

/**
 *
 * @author Gusta
 */
public class BankAccount {

    /**
     * class attributes
     */
    
    private int accountNumber;
    private boolean activated;
    private int saldo;

    /**
     * constructor method
     */

    public BankAccount() {
        
        this.saldo = 2000;
        this.accountNumber = 12345678;
        action();
    }
    
    /**
     * getter and setter
     * @return activated 
     */

    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    /**
     * the method allows executing two options, withdraw or deposit
     */
    
    private void action(){
        int select = 0;
        int value;
        do {
            select = Integer.parseInt(JOptionPane.showInputDialog(null, "select option \n\n"
                    + "1. withdraw \n"
                    + "2. deposit \n"
                    + "3. Salir \n\n"
                    + "Tu saldo es de : $" + this.saldo));
            switch(select){
                case 1:
                    value = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the value to be withdrawn"));
                    withdraw(value);
                    break;
                case 2:
                    value = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the value to be withdrawn"));
                    deposit(value);
                    break;
            }
        } while (select <= 2);
    }
    
    /**
     * the method validates the account number to access to withdraw the value
     * @param value amount to withdraw
     */
    private void withdraw(int value){
        int account = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter account number"));
        if (account == this.accountNumber) {
            if (value < this.saldo) {
                this.saldo = this.saldo - value;
               JOptionPane.showMessageDialog(null, "Successful withdrawal, your new balance is: " + this.saldo);
           }else{
               JOptionPane.showMessageDialog(null, "Sorry, insufficient balance : " + this.saldo);
           }
        }else{
            JOptionPane.showMessageDialog(null,"incorrect account number");
        }
    }

    /**
     * method that allows you to make the deposit to the account
     * @param value amount to withdraw
     */
    
    public void deposit(int value){
        this.saldo += value;
        JOptionPane.showMessageDialog(null, "Successful deposit, your new balance is: " + this.saldo + " account number " + this.accountNumber);
    }

    /**
     * method to print the attributes of the class
     */
    
    public void balance(){
        JOptionPane.showMessageDialog(null, "your account was left with a balance of: $" + this.saldo);
    }
    
    
    
    
}

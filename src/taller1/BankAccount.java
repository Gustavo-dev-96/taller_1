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
    
    private int accountNumber;
    private boolean activated;
    private int saldo;

    public BankAccount() {
        
        this.saldo = 2000;
        this.accountNumber = 12345678;
        action();
    }
    
    

    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }
    
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
    
    public void deposit(int value){
        this.saldo += value;
        JOptionPane.showMessageDialog(null, "Successful deposit, your new balance is: " + this.saldo + " account number " + this.accountNumber);
    }
    
    public void balance(){
        JOptionPane.showMessageDialog(null, "your account was left with a balance of: $" + this.saldo);
    }
    
    
    
    
}

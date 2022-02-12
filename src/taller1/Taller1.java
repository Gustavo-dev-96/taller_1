/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller1;

import javax.swing.JOptionPane;

/**
 *
 * @author Gusta
 */
public class Taller1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int option;
        
        do {
            
            option = Integer.parseInt(JOptionPane.showInputDialog(null,"select an option \n\n"
                + "1. Person registration \n"
                + "2. Fruit inventory \n"
                + "3. Bank account \n"
                + "4. Register products \n"
                + "5. Register cars \n"
                + "6. Exit"));
            
            
            switch(option){
                case 1:
                    Person registration = new Person();
                    String name = JOptionPane.showInputDialog(null, "Enter your name");
                    registration.setName(name);
                    boolean result = registration.validate();
                    if (result) {
                        registration.print();
                    }else{
                        JOptionPane.showMessageDialog(null, "You are not of legal age");
                    }
                    break;
                case 2:
                    Fruit fruit = new Fruit();
                    fruit.printFruit();
                    break;
                case 3:
                    BankAccount account = new BankAccount();
                    account.balance();
                    break;
                case 4:
                        RegisterToInventory newInventory = new RegisterToInventory();
                    break;
                case 5:
                        RegisterToInventoryCars cars = new RegisterToInventoryCars();
               
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("wrong choice ");
                    
            }
                    
        } while (option <= 6);
    }
    
}

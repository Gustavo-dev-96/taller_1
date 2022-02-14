package taller1;

import javax.swing.JOptionPane;

public class RegisterToInventoryCars extends RegisterToInventory {

    /**
     * class constructor method
     */
    public RegisterToInventoryCars() {
        printRegister(1);
    }

    /**
     * method inherited from parent class RegisterToInventory
     * the number of items to register is captured
     */
    @Override
    public void amountToRegister(){
        int amount = Integer.parseInt(JOptionPane.showInputDialog(null,"How Many Cars Will You Register ?"));
        recordData(amount);
        
    }

    /**
     * method inherited from parent class RegisterToInventory
     * takes as a parameter the number of articles to register
     * instance the article class to record the data of the cart 
     * type object and then the class that allows saving in the 
     * arraylist is instantiated
     */

    @Override
    public void recordData(int amount){
        for (int i = 0; i <amount;i++)
        {
            int item = i + 1;
            String code  = JOptionPane.showInputDialog(null, "enter the car code " + item);
            String name = JOptionPane.showInputDialog(null, "car name " + item  );
            int price = Integer.parseInt(JOptionPane.showInputDialog(null,"car price " + item));
            Article article = new Article(code,name,price);
            inventory.insert(article);
        }
    }

}

package taller1;

import javax.swing.JOptionPane;


public class RegisterToInventory {

    /**
     * instantiate the class
     */

    Inventory inventory;

    /**
     * constructor method
     * instantiate the class Inventory()
     * the createList method is called
     * declare the amountToRegister() method
     */

    public RegisterToInventory() {

        inventory = new Inventory();
        inventory.createList();
        amountToRegister();
    }

    /**
     * Capture the number of articles to be registered. The method that receives the quantity to be registered as 
     * a parameter is declared and finally the class is declared to send the type of article to be printed.
     * 
     * printRegister(0) if it receives 0 it is a product and if it receives 1 it is a car
     */

    public void amountToRegister(){
        int amount = Integer.parseInt(JOptionPane.showInputDialog(null,"How Many Products Will You Register ?"));
        recordData(amount);
        printRegister(0);
    }

    /**
     * the method receives the parameter that contains the number of articles to register then it instantiates 
     * the article class to send the data to register finally from the inventory class the insert 
     * method is called that saves the object in the arraylist
     * @param amount parameter that defines the number of items to register
     */

    protected void recordData(int amount){
        for (int i = 0; i <amount;i++)
        {
            int item = i + 1;
            String code  = JOptionPane.showInputDialog(null, "enter the reference code " + item);
            String name = JOptionPane.showInputDialog(null, "enter item name " + item  );
            int price = Integer.parseInt(JOptionPane.showInputDialog(null,"item price " + item));
            Article article = new Article(code,name,price);
            inventory.insert(article);
        }
    }

    /**
     * method to print the objects of the arraylist
     * receives as a parameter the type of article to register
     * @param a the type of article to register in this case a product
     */
    public void printRegister(int a){
        String result = inventory.print(a);
        JOptionPane.showMessageDialog(null, result);
    }



    



}

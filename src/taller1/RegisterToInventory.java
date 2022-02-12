package taller1;

import javax.swing.JOptionPane;


public class RegisterToInventory {

    Inventory inventory;

    public RegisterToInventory() {

        inventory = new Inventory();
        inventory.createList();
        amountToRegister();
    }

    public void amountToRegister(){
        int amount = Integer.parseInt(JOptionPane.showInputDialog(null,"How Many Products Will You Register ?"));
        recordData(amount);
        printRegister(0);
    }

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


    public void printRegister(int a){
        String result = inventory.print(a);
        JOptionPane.showMessageDialog(null, result);
    }



    



}

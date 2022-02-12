package taller1;

import javax.swing.JOptionPane;

public class RegisterToInventoryCars extends RegisterToInventory {


    public RegisterToInventoryCars() {
        printRegister(1);
    }

    @Override
    public void amountToRegister(){
        int amount = Integer.parseInt(JOptionPane.showInputDialog(null,"How Many Cars Will You Register ?"));
        recordData(amount);
        
    }

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

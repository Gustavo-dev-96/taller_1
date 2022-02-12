package taller1;

import java.util.ArrayList;

import javax.swing.JOptionPane;




public class Inventory{

    ArrayList<Article> inventory;
    

    public Inventory() {
    }

    public void createList(){

        inventory = new ArrayList();
    }

    public void insert(Article article){
        inventory.add(article);
        System.out.println("vamos bien");
    }


    public String print(){
        String report = "";
        for (int i = 0; i < inventory.size(); i++) {
            report += (i+1) + " " + inventory.get(i).toString()+"\n";
        }

        return report;
    }


    


}

package taller1;

import java.util.ArrayList;

import javax.swing.JOptionPane;




public class Inventory{

    public ArrayList<Article> inventory;
    public String typeArticle = "Product"; 
    

    public Inventory() {
    }

    public void createList(){

        inventory = new ArrayList();
    }

    public void insert(Article article){
        inventory.add(article);
    }


    public String print(int a){
        
        if (a == 1) {
            typeArticle = "Car";
        }

        String report = "";
        for (int i = 0; i < inventory.size(); i++) {
            report += (i+1) + " " + typeArticle + " " + inventory.get(i).toString()+"\n";
        }

        return report;
    }


    


}

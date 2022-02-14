package taller1;

import java.util.ArrayList;

public class Inventory{
    /**
     * declares the arraylist of type item
     * variable that stores the type of article to register
     */
    public ArrayList<Article> inventory;
    public String typeArticle = "Product"; 
    
    /**
     * constructor method
     */

    public Inventory() {
    }

    /**
     * method that creates the arraylist
     */
    public void createList(){

        inventory = new ArrayList();
    }

    /**
     * method that allows to insert the object to the arraylist
     * @param article contains the object to register
     */

    public void insert(Article article){
        inventory.add(article);
    }

    /**
     * method that prints the objects of the arraylist and validates the type of item to print
     * the types of items are products and cars
     * @param a parameter that contains the type of article
     * @return string containing the objects of the arraylist
     */
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

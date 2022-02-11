package taller1;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Movies {
    private String name;
    private int  price;
    private String duration;

    public Movies() {
        String nameItem = JOptionPane.showInputDialog(null, "FILM NAME");
        int priceItem = Integer.parseInt(JOptionPane.showInputDialog(null,"price of the movie"));
        String durationItem = JOptionPane.showInputDialog(null, "duration of the movie");

        RegisterMovie(nameItem,priceItem,durationItem);
    }


    private void RegisterMovie(String a, int b, String c){
        this.name = a;
        this.price = b;
        this.duration = c;
    }

    public void print(){
        JOptionPane.showMessageDialog(null, "film registration \n\n"
                                            + "Name: " + this.name + "\n"
                                            + "Price: " + this.price + "\n"
                                            + "duration: " + this.duration + "\n\n");      
    }

    
}

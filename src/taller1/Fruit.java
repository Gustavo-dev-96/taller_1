/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Gusta
 */
public class Fruit {
    private String name;
    private float averageWeight;
    ArrayList colors = new ArrayList();

    public Fruit() {
        
        this.name = JOptionPane.showInputDialog(null,"enter the name of the fruit");
        this.averageWeight = Float.parseFloat(JOptionPane.showInputDialog(null,"enter the average weight of the fruit"));
        int amount = Integer.parseInt(JOptionPane.showInputDialog(null,"enter color quantity"));
        
        for (int i = 0; i < amount; i++) {
            String color = JOptionPane.showInputDialog(null,"color " + i);
            setColors(color);
        }
        
        
    } 
    
    public ArrayList getColors() {
        return colors;
    }

    public void setColors(String color) {
        this.colors.add(color);
    }
    
    public void printFruit(){
        JOptionPane.showMessageDialog(null, "registered fruit \n\n"
                + "Name: " + this.name + "\n"
                + "averageWeight: " + this.averageWeight + "\n"
                + "Colors: " + this.colors + "\n\n");
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Gusta
 */
public class Person {

    /**
     * class attributes
     */
    private String name;
    private String lastname1;
    private String lastname2;
    private Date dateBirth;
    private float height;
    private int age;

    /**
     * Getter and Setter of the class
     * @return
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    /**
     * enter and validate the age attribute to register
     * @return result will decide if the user can register
     */
    public boolean validate() {
        int ageUser = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese su edad, debe de ser mayor de edad para registrarse"));
        boolean result = false;
        
        if (ageUser >= 18) {
            result = true;
            this.age = ageUser;
            this.lastname1 = JOptionPane.showInputDialog(null,"Enter your first last name");
            this.lastname2 = JOptionPane.showInputDialog(null,"Enter your second last name");
            this.height = Float.parseFloat(JOptionPane.showInputDialog(null,"Enter your height"));
        }
        
        return result;
    }
    
    /**
     * print the attributes
     */
    public void print(){
        JOptionPane.showMessageDialog(null,"registered data \n\n"
            + "Name: " + this.name +"\n" 
            + "Lastname: " + this.lastname1 +"\n"
            + "Lastname: " + this.lastname2 +"\n"
            + "Height: " + this.height +"\n"
            + "Age: " + this.age +"\n");
    }

    

    
}

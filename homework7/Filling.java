/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework7;

public class Filling {
    
    private String color;
    private int amount;
    
    public Filling(String color,int amount){
        this.amount=amount;
        this.color=color;
    }

    public Filling() {
    }

    public String getColor() {
        return color;
    }

    public int getAmount() {
        return amount;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Filling{" + "color=" + color + ", amount=" + amount + '}';
    }
   
    
}

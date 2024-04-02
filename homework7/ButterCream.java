/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework7;

/**
 *
 * @author ya
 */
public class ButterCream extends Filling{
    private String type ;

    public ButterCream(String type, String color, int amount) {
        super(color, amount);
        this.type = type;
    }

  public ButterCream(){
     
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    

    @Override
    public String toString() {
        return "ButterCream{" + "type=" + type + super.toString()+'}';
    }
    
    
}

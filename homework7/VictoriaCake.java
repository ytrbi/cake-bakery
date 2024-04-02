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
public class VictoriaCake extends cake {
    private boolean haveBerries;

    public VictoriaCake(int noLayers, String flavour, Filling filling,boolean haveBerries) {
        super(noLayers,flavour, filling);
        this.haveBerries = haveBerries;
    }

    public boolean isHaveBerries() {
        return haveBerries;
    }

    public void setHaveBerries(boolean haveBerries) {
        this.haveBerries = haveBerries;
    }
    
    @Override
    public int calcPrice(){
        if(isHaveBerries()){
            return super.calcPrice()+30;
        }
        return super.calcPrice();
    }

    @Override
    public String toString() {
        return "VictoriaCake{" + "haveBerries=" + haveBerries + super.toString()+'}';
    }
    
}

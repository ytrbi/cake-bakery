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
public class cake {
    private int noLayers;
    private final String flavour;
    private Filling filling;

    public cake(int noLayers, String flavour, Filling filling) {
        this.noLayers = noLayers;
        this.flavour = flavour;
        this.filling = filling;
    }

    public void setNoLayers(int noLayers) {
        this.noLayers = noLayers;
    }

    public void setFilling(Filling filling) {
        this.filling = filling;
    }

    public String getFlavour() {
        return flavour;
    }

    public Filling getFilling() {
        return filling;
    }

    public int getNoLayers() {
        return noLayers;
    }
    
    public int calcPrice(){
        return 20*noLayers;
    }

    @Override
    public String toString() {
        return "cake{" + "noLayers=" + noLayers + ", flavour=" + flavour + ", filling=" + filling + '}';
    }
    
}

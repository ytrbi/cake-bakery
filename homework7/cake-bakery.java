/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework7;

import java.util.ArrayList;

public class HOMEWORK7 {

  
    public static void main(String[] args) {
        cake[] c = new cake[3];
        System.out.println("** A R R A Y**");
        cake birthday = new cake(3, "Chocolata", new ButterCream("Swiss", "Pink", 250));
        c[0] = birthday;
        c[1] = new cake(4, "Vanilia", new Filling());
        c[2] = new cake(1, "Lemon", new Filling("Yellow", 100));
        c[1].getFilling().setAmount(150);
        
        for (int x = 0; x < c.length; x++) {
            System.out.println(c[x].getFlavour());
        }
        
        ArrayList <VictoriaCake> VicCake = new ArrayList <VictoriaCake>();
        VictoriaCake fraise = new VictoriaCake (7, "Almond", new ButterCream("Swiss","white",250), false);
        VicCake.add(fraise);
        VicCake.add(new VictoriaCake (4,"Vanilla",new Filling("",100),false));
        VicCake.set(1,fraise.isHaveBerries() )[
               {return true;
        
              
    }
    
    
}

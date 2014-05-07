/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg1310653763_u2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import pkg1310653763_u2.Auto.color;

/**
 *
 * @author Manuel Dorfer
 */
public class Main {

    /**
     * @param args the command linei arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Saeugetier test = new Saeugetier("Miezi",22,"weiblich");
        System.out.println(test.printAll());
        
        Mensch eins = new Mensch("Franzi",25,"männlich");
        System.out.println(eins.printAll());
        
       Auto audi = new Auto((short)4,color.Black,(short)420,(short)5,(short)4);
       Auto bmw = new Auto((short)4,color.Red,(short)170,(short)5,(short)4);
       Auto vw = new Auto((short)4,color.White,(short)265,(short)5,(short)4);
       Auto peugeot = new Auto((short)4,color.Black,(short)110,(short)5,(short)4);
       Auto mazda = new Auto((short)4,color.Blue,(short)101,(short)5,(short)4);
       
       List<Auto> l = new ArrayList<Auto>();
        l.add(audi);
        l.add(bmw);
        l.add(vw);
        l.add(peugeot);
        l.add(mazda);
        
        Collections.sort(l);
        for(Auto a : l)
        {
            System.out.println("Leistung: "+a.getPS()+" PS!");
        }
    }
    
}

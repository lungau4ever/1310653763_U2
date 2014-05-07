/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg1310653763_u2;

/**
 *
 * @author Manuel Dorfer
 */
public class Kind {
    public String Vorname, Nachname; 
    public int Alter; 

    public Kind(String vn, String nn, int a) {
        Vorname = vn;
        Nachname = nn;
        Alter = a;
    }

    public int getAlter() {
        return Alter;
    }
    
    public String status(){
        return "Es ist ein Mensch: "+Vorname+" "+Nachname+" "+Alter;
        
    }
}

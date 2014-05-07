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
public class Mensch extends Saeugetier{

    public Mensch(String n, int a, String g) {
        super(n, a, g);
    }
    @Override
    public String printAll(){
        return Name+"#"+Alter+"#"+Geschlecht;
    }
}

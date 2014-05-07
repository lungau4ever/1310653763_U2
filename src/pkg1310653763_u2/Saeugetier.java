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
public class Saeugetier {
   public String Name;
   public int Alter;
   public String Geschlecht;
   
 public Saeugetier(String n, int a, String g) {
        this.Name = n;
        this.Alter = a;
        this.Geschlecht = g;
    }   

    public String getName() {
        return Name;
    }

    public int getAlter() {
        return Alter;
    }

    public String getGeschlecht() {
        return Geschlecht;
    }

    public void setName(String n) {
        this.Name = n;
    }

    public void setAlter(int a) {
        this.Alter = a;
    }

    public void setGeschlecht(String g) {
        this.Geschlecht = g;
    }
    
    public String printAll (){
        return Name+" ist "+Alter+" Jahre alt und "+Geschlecht; 
    }
 
 
}

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
public class Auto extends Fahrzeuge implements Comparable<Auto>{
    
    private boolean Klimaanlage;
    private short Airbags; 
    
    public enum color{
        Silver, Red, Black, Blue, White;
    }

    public Auto(short r, color f, short ps,short tu, short ab) {
        super(r, "Silver", ps,tu,false, (short)0);
        Klimaanlage=false;
        Airbags=ab;
        f=color.Silver;
        
    }

    @Override
    public String toString() {
        return "Mein Auto hat "+this.getPS()+" und fähr mit "+this.getGeschwindigkeit()+" km/h";
    }

    public void klimaanlageAn() {
        if(Klimaanlage==false){
            Klimaanlage = true;
        }
        else if(Klimaanlage ==true){
            System.out.println("Klimaanlage läuft bereits!");
        }
    }
    
      public void klimaanlageAus() {
        if(Klimaanlage==true){
            Klimaanlage = false;
        }
        else if(Klimaanlage ==false){
            System.out.println("Klimaanlage ist bereits aus!");
        }
    }

    public boolean isKlimaanlage() {
        return Klimaanlage;
    }

    public short getAirbags() {
        return Airbags;
    }

    public void setKlimaanlage(boolean Klimaanlage) {
        this.Klimaanlage = Klimaanlage;
    }

    public void setAirbags(short ab) {
        Airbags = ab;
    }
    
    @Override
    public int compareTo(Auto b) {
        
        if(this.getPS() < b.getPS())
        {
            return -1;
        }
        else if(this.getPS()>b.getPS())
        {
            return 1;
        }
        else
        {
            return 0;
        }
    
    
    }
}

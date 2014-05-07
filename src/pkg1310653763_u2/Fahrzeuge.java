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
public class Fahrzeuge {
    
    private short Reifen;
    private String Farben;
    private short PS;
    private short Tueren;
    private boolean Gestartet;
    private short Geschwindigkeit;
    public static int Anzahl=0; 
    
    public Fahrzeuge (short r, String f, short ps,short tu, boolean g, short speed)
    {
     Reifen=r;
     Farben=f;
     PS =ps; 
     Tueren = tu;
     Gestartet=g; 
     Gestartet=false;
     Geschwindigkeit =speed;   
     Anzahl =Anzahl+1;      
    }

    public void setTueren(short tu) {
        Tueren = tu;
    }

    public short getTueren() {
        return Tueren;
    }

    public void beschleunigen(short speed) {
        if(Gestartet=true&&(Geschwindigkeit+speed)<250){
            Geschwindigkeit +=speed;
        }
    }
    public void bremsen(short speed) {
        if(Gestartet=true&&(Geschwindigkeit-speed)>=0){
            Geschwindigkeit -=speed;
        }
    }

    public short getReifen() {
        return Reifen;
    }

    public String getFarben() {
        return Farben;
    }

    public short getPS() {
        return PS;
    }

    public boolean isGestartet() {
        return Gestartet;
    }

    public short getGeschwindigkeit() {
        return Geschwindigkeit;
    }

    public void setReifen(short r) {
        Reifen = r;
    }

    public void setFarben(String f) {
        Farben = f;
    }

    public void setPS(short ps) {
        PS = ps;
    }

    public void setGestartet(boolean g) {
        Gestartet = g;
    }

    public void setGeschwindigkeit(short speed) {
        Geschwindigkeit = speed;
    }

    public static void setAnzahl(int a) {
        Anzahl = a;
    }

    public static int getAnzahl() {
        return Anzahl;
    }

    public void starten() {
        Gestartet = true;
    }
    public void stoppen() {
        Gestartet = false;
    }
}

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
public class Student extends Kind {
    private int Matrikelnummer;
    private String Studiengang;

    public Student(String vn, String nn, int a, int m, String sg) {
        super(vn, nn, a);
        Matrikelnummer=m;
        Studiengang=sg;
    }
    
    @Override
      public String status(){
        return "Es ist ein Student: "+Vorname+" "+Nachname+" "+Alter+" mit der MatNr: "+Matrikelnummer+" und er studiert: "+Studiengang;
      }
     public static void main(String[]args){
        Kind manuel = new Kind("Manuel","Dorfer",24);
        System.out.println(manuel.status());
        
        Student manuel2 =new Student("Manuel","Dorfer",24,1310653763,"Web Business & Technology");
         System.out.println(manuel2.status());
     
}
      

      
      
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nba;

/**
 *
 * @author lhgouber
 */
public class Competitieleider {
    
    private int lidnr;
    private String wachtwoord;
    
    public void WedstrijdHerplannen(Wedstrijd wedstr, Speeldag speeldag, String datum){
        if(speeldag.getWedstrijden().contains(wedstr)){
    
        for(Wedstrijd w : speeldag.getWedstrijden()){
            if(w.equals(wedstr)){
                if()
                w.setDatum(datum);
                break;
            }
        }
        } else System.out.println("Wedstrijd bestaat niet. Controlleer wat u ingegeven hebt.");
    
}
}


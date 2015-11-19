/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nba;

import java.util.ArrayList;

/**
 *
 * @author lhgouber
 */
public class Speeldag {
    private int speeldagNr;
    ArrayList<Wedstrijd>wedstrijden; 

    public Speeldag(int speeldagNr, ArrayList<Wedstrijd> wedstrijden) {
        this.speeldagNr = speeldagNr;
        this.wedstrijden = wedstrijden;
    }

    public int getSpeeldagNr() {
        return speeldagNr;
    }

    public ArrayList<Wedstrijd> getWedstrijden() {
        return wedstrijden;
    }
   
    public void setSpeeldagNr(int speeldagNr) {
        this.speeldagNr = speeldagNr;
    }

    public void setWedstrijden(ArrayList<Wedstrijd> wedstrijden) {
        this.wedstrijden = wedstrijden;
    }
    
    
    
}

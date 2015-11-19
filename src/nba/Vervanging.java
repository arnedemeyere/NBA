/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nba;

/**
 *
 * @author Arne
 */
public class Vervanging {
    
    private Speler spelerA;
    private Speler spelerB;
    private int tijdstip;
    private Wedstrijd wedstrijd;

    public Vervanging(Speler spelerA, Speler spelerB, int tijdstip, Wedstrijd wedstrijd) {
        this.spelerA = spelerA;
        this.spelerB = spelerB;
        this.tijdstip = tijdstip;
        this.wedstrijd = wedstrijd;
    }

    public Speler getSpelerA() {
        return spelerA;
    }

    public void setSpelerA(Speler spelerA) {
        this.spelerA = spelerA;
    }

    public Speler getSpelerB() {
        return spelerB;
    }

    public void setSpelerB(Speler spelerB) {
        this.spelerB = spelerB;
    }

    public int getTijdstip() {
        return tijdstip;
    }

    public void setTijdstip(int tijdstip) {
        this.tijdstip = tijdstip;
    }

    public Wedstrijd getWedstrijd() {
        return wedstrijd;
    }

    public void setWedstrijd(Wedstrijd wedstrijd) {
        this.wedstrijd = wedstrijd;
    }
    
    
    
    
    
}

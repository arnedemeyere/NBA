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
public class Fout {
    
    private Speler speler;
    private int tijdstip;
    private Wedstrijd wedstrijd;

    public Fout(Speler speler, int tijdstip, Wedstrijd wedstrijd) {
        this.speler = speler;
        this.tijdstip = tijdstip;
        this.wedstrijd = wedstrijd;
    }

    public Speler getSpeler() {
        return speler;
    }

    public void setSpeler(Speler speler) {
        this.speler = speler;
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

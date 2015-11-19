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
public class Doelpunt {
    
    private Speler speler;
    private int tijdStip;
    private boolean vrijeWorp;
    private Wedstrijd wedstrijd;

    public Doelpunt(Speler speler, int tijdStip, boolean vrijeWorp, Wedstrijd wedstrijd) {
        this.speler = speler;
        this.tijdStip = tijdStip;
        this.vrijeWorp = vrijeWorp;
        this.wedstrijd = wedstrijd;
    }

    public Speler getSpeler() {
        return speler;
    }

    public void setSpeler(Speler speler) {
        this.speler = speler;
    }

    public int getTijdStip() {
        return tijdStip;
    }

    public void setTijdStip(int tijdStip) {
        this.tijdStip = tijdStip;
    }

    public boolean isVrijeWorp() {
        return vrijeWorp;
    }

    public void setVrijeWorp(boolean vrijeWorp) {
        this.vrijeWorp = vrijeWorp;
    }

    public Wedstrijd getWedstrijd() {
        return wedstrijd;
    }

    public void setWedstrijd(Wedstrijd wedstrijd) {
        this.wedstrijd = wedstrijd;
    }

    
}

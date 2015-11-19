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
public class Stadion {
    
    private Ploeg ploeg;
    private int capaciteit;
    private String locatie;
    private String stadionNaam;

    public Stadion(Ploeg ploeg, int capaciteit, String locatie, String stadionNaam) {
        this.ploeg = ploeg;
        this.capaciteit = capaciteit;
        this.locatie = locatie;
        this.stadionNaam = stadionNaam;
    }
    
    public Ploeg getPloeg() {
        return ploeg;
    }

    public void setPloeg(Ploeg ploeg) {
        this.ploeg = ploeg;
    }

    public int getCapaciteit() {
        return capaciteit;
    }

    public void setCapaciteit(int capaciteit) {
        this.capaciteit = capaciteit;
    }

    public String getLocatie() {
        return locatie;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }

    public String getStadionNaam() {
        return stadionNaam;
    }

    public void setStadionNaam(String stadionNaam) {
        this.stadionNaam = stadionNaam;
    }
    
    
    
}

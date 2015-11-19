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
public class Speler extends Persoon {

    private Ploeg ploeg;
    private String positie;
    private int rugnummer;

    public Speler(String persoonVoornaam, String persoonNaam, String geboorteDatum, int lidNummer, String nationaliteit, Ploeg ploeg, String positie, int rugnummer) {
        super(persoonVoornaam, persoonNaam, geboorteDatum, lidNummer, nationaliteit);
        this.ploeg = ploeg;
        this.positie = positie;
        this.rugnummer = rugnummer;
    }

    public Ploeg getPloeg() {
        return ploeg;
    }

    public void setPloeg(Ploeg ploeg) {
        this.ploeg = ploeg;
    }

    public String getPositie() {
        return positie;
    }

    public void setPositie(String positie) {
        this.positie = positie;
    }

    public int getRugnummer() {
        return rugnummer;
    }

    public void setRugnummer(int rugnummer) {
        this.rugnummer = rugnummer;
    }
    
    
    
}

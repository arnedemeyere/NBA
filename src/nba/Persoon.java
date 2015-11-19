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
public class Persoon {
    
    private String persoonVoornaam;
    private String persoonNaam;
    private String geboorteDatum;
    public int lidNummer;
    private String nationaliteit;

    public Persoon(String persoonVoornaam, String persoonNaam, String geboorteDatum, int lidNummer, String nationaliteit) {
        this.persoonVoornaam = persoonVoornaam;
        this.persoonNaam = persoonNaam;
        this.geboorteDatum = geboorteDatum;
        this.lidNummer = lidNummer;
        this.nationaliteit = nationaliteit;
    }

    public String getPersoonVoornaam() {
        return persoonVoornaam;
    }

    public void setPersoonVoornaam(String persoonVoornaam) {
        this.persoonVoornaam = persoonVoornaam;
    }

    public String getPersoonNaam() {
        return persoonNaam;
    }

    public void setPersoonNaam(String persoonNaam) {
        this.persoonNaam = persoonNaam;
    }

    public String getGeboorteDatum() {
        return geboorteDatum;
    }

    public void setGeboorteDatum(String geboorteDatum) {
        this.geboorteDatum = geboorteDatum;
    }

    public int getLidNummer() {
        return lidNummer;
    }

    public void setLidNummer(int lidNummer) {
        this.lidNummer = lidNummer;
    }

    public String getNationaliteit() {
        return nationaliteit;
    }

    public void setNationaliteit(String nationaliteit) {
        this.nationaliteit = nationaliteit;
    }
    
    
}

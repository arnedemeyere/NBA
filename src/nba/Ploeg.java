/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nba;

import java.util.ArrayList;

/**
 *
 * @author Arne
 */
public class Ploeg {
    
    private String ploegNaam;
    private Stadion stadion;
    private ArrayList<Speler> spelers = new ArrayList<>();
    private String eersteKeuzeOutfit;
    private String tweedeKeuzeOutfit;
    private String coach;
    public int aantalPuntenKlassement;
    public int aantalGewonnenWedstrijden;
    public int totaalAantalGespeeldeWedstrijden;
    public int doelpuntenSaldo;

    public Ploeg(String ploegNaam, Stadion stadion, String eersteKeuzeOutfit, String tweedeKeuzeOutfit, String coach, int aantalPuntenKlassement, int aantalGewonnenWedstrijden, int totaalAantalGespeeldeWedstrijden, int doelpuntenSaldo) {
        this.ploegNaam = ploegNaam;
        this.stadion = stadion;
        this.eersteKeuzeOutfit = eersteKeuzeOutfit;
        this.tweedeKeuzeOutfit = tweedeKeuzeOutfit;
        this.coach = coach;
        this.aantalPuntenKlassement = aantalPuntenKlassement;
        this.aantalGewonnenWedstrijden = aantalGewonnenWedstrijden;
        this.totaalAantalGespeeldeWedstrijden = totaalAantalGespeeldeWedstrijden;
        this.doelpuntenSaldo = doelpuntenSaldo;
    }

    public int getAantalPuntenKlassement() {
        return aantalPuntenKlassement;
    }

    public void setAantalPuntenKlassement(int aantalPuntenKlassement) {
        this.aantalPuntenKlassement = aantalPuntenKlassement;
    }

    public int getAantalGewonnenWedstrijden() {
        return aantalGewonnenWedstrijden;
    }

    public void setAantalGewonnenWedstrijden(int aantalGewonnenWedstrijden) {
        this.aantalGewonnenWedstrijden = aantalGewonnenWedstrijden;
    }

    public int getTotaalAantalGespeeldeWedstrijden() {
        return totaalAantalGespeeldeWedstrijden;
    }

    public void setTotaalAantalGespeeldeWedstrijden(int totaalAantalGespeeldeWedstrijden) {
        this.totaalAantalGespeeldeWedstrijden = totaalAantalGespeeldeWedstrijden;
    }

    public int getDoelpuntenSaldo() {
        return doelpuntenSaldo;
    }

    public void setDoelpuntenSaldo(int doelpuntenSaldo) {
        this.doelpuntenSaldo = doelpuntenSaldo;
    }

    public Stadion getStadion() {
        return stadion;
    }

    public void setStadion(Stadion stadion) {
        this.stadion = stadion;
    }

    public ArrayList<Speler> getSpelers() {
        return spelers;
    }

    public void setSpelers(ArrayList<Speler> spelers) {
        this.spelers = spelers;
    }

    public String getEersteKeuzeOutfit() {
        return eersteKeuzeOutfit;
    }

    public void setEersteKeuzeoutfit(String eersteKeuzeOutfit) {
        this.eersteKeuzeOutfit = eersteKeuzeOutfit;
    }

    public String getTweedeKeuzeOutfit() {
        return tweedeKeuzeOutfit;
    }

    public void setTweedeKeuzeOutfit(String tweedeKeuzeOutfit) {
        this.tweedeKeuzeOutfit = tweedeKeuzeOutfit;
    }

    public String getPloegNaam() {
        return ploegNaam;
    }

    public void setPloegNaam(String ploegNaam) {
        this.ploegNaam = ploegNaam;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }
    
    public void spelerToevoegen(Ploeg ploeg, Speler speler) {
        ploeg.getSpelers().add(speler);
    }
    
    public void spelerVerwijderen(Ploeg ploeg, Speler speler) {
        ploeg.getSpelers().remove(speler);
    }
    
    public void tenueKeuze(Ploeg ploegA, Ploeg ploegB) {
        if(ploegA.getEersteKeuzeOutfit().equalsIgnoreCase(ploegB.getEersteKeuzeOutfit())) {
            System.out.println("Keuze thuisploeg: " + ploegA.getEersteKeuzeOutfit() + "; keuze uitploeg: " + ploegB.getTweedeKeuzeOutfit());
        } else {
            System.out.println("Keuze thuisploeg: " + ploegA.getEersteKeuzeOutfit() + "; keuze uitploeg: " + ploegB.getTweedeKeuzeOutfit());
        }
    }

    @Override
    public String toString() {
        String result = getPloegNaam();
        return result;   
    }
  
}

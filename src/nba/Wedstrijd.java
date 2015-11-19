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
public class Wedstrijd {
    
    private Ploeg thuisPloeg;
    private Ploeg uitPloeg;
    private Stadion stadion;
    private Scheidsrechter scheidsrechter;
    private String datum;
    private String aanvangsuur;
    private int aantalDoelpuntenThuisPloeg;
    private int aantalDoelpuntenUitPloeg;
    private ArrayList<Scheidsrechter> scheidsrechters;

    public Wedstrijd(Ploeg thuisPloeg, Ploeg uitPloeg, Scheidsrechter scheidsrechter, Stadion stadion, String datum, String aanvangsuur, int aantalDoelpuntenThuisPloeg, int aantalDoelpuntenUitPloeg) {
        this.thuisPloeg = thuisPloeg;
        this.uitPloeg = uitPloeg;
        this.scheidsrechter = scheidsrechter;
        this.scheidsrechters = new ArrayList<>();
        this.stadion = stadion;
        this.datum = datum;
        this.aanvangsuur = aanvangsuur;
        this.aantalDoelpuntenThuisPloeg = aantalDoelpuntenThuisPloeg;
        this.aantalDoelpuntenUitPloeg = aantalDoelpuntenUitPloeg;
    }

    public Ploeg getThuisPloeg() {
        return thuisPloeg;
    }

    public void setThuisPloeg(Ploeg thuisPloeg) {
        this.thuisPloeg = thuisPloeg;
    }

    public Ploeg getUitPloeg() {
        return uitPloeg;
    }

    public void setUitPloeg(Ploeg uitPloeg) {
        this.uitPloeg = uitPloeg;
    }

    public ArrayList<Scheidsrechter> getScheidsrechters() {
        return scheidsrechters;
    }

    public void setScheidsrechters(ArrayList<Scheidsrechter> scheidsrechters) {
        this.scheidsrechters = scheidsrechters;
    }
    
    public Stadion getStadion() {
        return stadion;
    }

    public void setStadion(Stadion stadion) {
        this.stadion = stadion;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public Scheidsrechter getScheidsrechter() {
        return scheidsrechter;
    }

    public void setScheidsrechter(Scheidsrechter scheidsrechter) {
        this.scheidsrechter = scheidsrechter;
    }

    
    
    public String getAanvangsuur() {
        return aanvangsuur;
    }

    public void setAanvangsuur(String aanvangsuur) {
        this.aanvangsuur = aanvangsuur;
    }

    public int getAantalDoelpuntenThuisPloeg() {
        return aantalDoelpuntenThuisPloeg;
    }

    public void setAantalDoelpuntenThuisPloeg(int aantalDoelpuntenThuisPloeg) {
        this.aantalDoelpuntenThuisPloeg = aantalDoelpuntenThuisPloeg;
    }

    public int getAantalDoelpuntenUitPloeg() {
        return aantalDoelpuntenUitPloeg;
    }

    public void setAantalDoelpuntenUitPloeg(int aantalDoelpuntenUitPloeg) {
        this.aantalDoelpuntenUitPloeg = aantalDoelpuntenUitPloeg;
    }
    
    public void scheidsrechterToevoegenAanWedstrijd(Wedstrijd wedstrijd, Scheidsrechter scheidsrechter) {
        for(Scheidsrechter s : scheidsrechters) {
            if(s.equals(scheidsrechter)) {
                wedstrijd.getScheidsrechters().add(scheidsrechter);
            }                         
        }
    }
    
    public String naamVanWedstrijd(Wedstrijd wedstrijd) {
        String result = null;
        result = wedstrijd.getThuisPloeg().toString() + "-" + wedstrijd.getUitPloeg().toString() + " ; "+ wedstrijd.getDatum();
        return result;
    }
    
    public String scheidsrechterCheck(Wedstrijd wedstrijd1, Wedstrijd wedstrijd2) { 
        String result = null;
        if(wedstrijd1.getScheidsrechter().equals(wedstrijd2.getScheidsrechter())) {
            if(wedstrijd1.getDatum().equalsIgnoreCase(wedstrijd2.getDatum())) {
                result = "Scheidsrechter kan niet toegewezen worden. Error";
                return result;
            }
        }
        return null;
    }
    
    public void getWinnaar(Ploeg thuisPloeg, Ploeg uitPloeg, Wedstrijd wedstrijd){
        if (wedstrijd.getAantalDoelpuntenThuisPloeg() > wedstrijd.getAantalDoelpuntenUitPloeg()){
            thuisPloeg.aantalPuntenKlassement += 3;
            uitPloeg.aantalPuntenKlassement +=1;
            thuisPloeg.aantalGewonnenWedstrijden +=1; }
        else {
            thuisPloeg.aantalPuntenKlassement +=  1;
            uitPloeg.aantalPuntenKlassement += 3;
            uitPloeg.aantalGewonnenWedstrijden += 1;
        }
            thuisPloeg.doelpuntenSaldo += (wedstrijd.aantalDoelpuntenThuisPloeg - wedstrijd.aantalDoelpuntenUitPloeg);
            uitPloeg.doelpuntenSaldo += (wedstrijd.aantalDoelpuntenUitPloeg - wedstrijd.aantalDoelpuntenThuisPloeg);
            thuisPloeg.totaalAantalGespeeldeWedstrijden +=1;
            uitPloeg.totaalAantalGespeeldeWedstrijden +=1;
            
        
    }
}


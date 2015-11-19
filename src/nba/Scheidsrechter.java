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
public class Scheidsrechter extends Persoon {
    
    private int scheidsrechternummer;
    private String wachtwoord;
    
    public Scheidsrechter(String persoonVoornaam, String persoonNaam, String geboorteDatum, int lidNummer, String nationaliteit, int scheidsrechternummer, String wachtwoord) {
        super(persoonVoornaam, persoonNaam, geboorteDatum, lidNummer, nationaliteit);
    }
    
    public boolean equals(Object o) {
  
    if (o instanceof Scheidsrechter) {
      Scheidsrechter s = (Scheidsrechter) o;
      if (this.lidNummer == s.lidNummer) return true;
    }
    return false; 
  }

    public int getScheidsrechternummer() {
        return scheidsrechternummer;
    }

    public void setScheidsrechternummer(int scheidsrechternummer) {
        this.scheidsrechternummer = scheidsrechternummer;
    }

    public String getWachtwoord() {
        return wachtwoord;
    }

    public void setWachtwoord(String wachtwoord) {
        this.wachtwoord = wachtwoord;
    }
   
    
    
}

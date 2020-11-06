package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] artikli;
    private int brojArtikala;
    public Korpa() {
        artikli = new Artikl[50];
        brojArtikala = 0;
    }
    public Artikl[] getArtikli() {
        return artikli;
    }
    public int dajUkupnuCijenuArtikala() {
        int ukupnaCijena = 0;
        for(int i = 0; i < brojArtikala; i++) ukupnaCijena += artikli[i].getCijena();
        return ukupnaCijena;
    }
    public Artikl izbaciArtiklSaKodom(String kod){
        Artikl nadjenArtikl = null;
        for(int i = 0; i < brojArtikala; i++){
            if(kod.equals(artikli[i].getKod())){
                nadjenArtikl = new Artikl(artikli[i].getNaziv(), artikli[i].getCijena(), artikli[i].getKod());
                while(i <brojArtikala){
                    artikli[i] = artikli[i+1];
                    i++;
                }
                artikli[i] = null;
                brojArtikala--;
                break;
            }
        }
        return nadjenArtikl;
    }
    public boolean dodajArtikl(Artikl a){
        if(brojArtikala < 50){
            artikli[brojArtikala++] = a;
            return true;
        }
        return false;
    }

}

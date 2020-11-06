package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] artikli;
    int brojArtikala = 0;
    public Supermarket(){
        artikli = new Artikl[1000];
        brojArtikala = 0;
    }
    public boolean dodajArtikl(Artikl a) {
        if (brojArtikala < 1000) {
            artikli[brojArtikala++] = a;
            return true;
        }
        return false;
    }
    public Artikl[] getArtikli() {
        return artikli;
    }

    public int getBrojArtikala() {
        return brojArtikala;
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
}

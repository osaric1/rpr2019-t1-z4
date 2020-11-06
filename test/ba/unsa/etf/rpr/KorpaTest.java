package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void getArtikli() {
        Korpa k = new Korpa();
        assertEquals(null,k.getArtikli() );
    }

    @Test
    void dajUkupnuCijenuArtikala() {
        Korpa k = new Korpa();
        k.dodajArtikl(new Artikl("VW", 25000, "1"));
        assertEquals(25000, k.dajUkupnuCijenuArtikala());
    }

    @Test
    void izbaciArtiklSaKodom() {
        Korpa k = new Korpa();
        k.dodajArtikl(new Artikl("VW", 25000, "1"));
        k.dodajArtikl(new Artikl("VW", 25000, "2"));
        k.dodajArtikl(new Artikl("VW", 25000, "3"));
        k.izbaciArtiklSaKodom("3");
        assertEquals(2, k.getBrojArtikala());
    }

    @Test
    void dodajArtikl() {
        Korpa k = new Korpa();
        k.dodajArtikl(new Artikl("VW", 25000, "1"));
        assertEquals(1, k.getBrojArtikala());
    }
}
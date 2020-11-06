package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void testdodajArtikl() {
        Supermarket sp = new Supermarket();
        assertEquals(true, sp.dodajArtikl(new Artikl("abc", 5, "1")));
    }

    @Test
    void testgetArtikli() {
        Supermarket sp = new Supermarket();
        for(int i = 0; i < 5; i++) sp.dodajArtikl(new Artikl("abc", 5, "1"));
        assertEquals(5, sp.getBrojArtikala());
    }

    @Test
    void izbaciArtiklSaKodom() {
        Supermarket sp = new Supermarket();
        sp.dodajArtikl(new Artikl("cdeafaw", 5, "2"));
        sp.izbaciArtiklSaKodom("2");
        assertEquals(0, sp.getBrojArtikala());
    }
}
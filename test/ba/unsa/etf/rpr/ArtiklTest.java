package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {

    @Test
    void getNaziv() {
        Artikl a = new Artikl("Naziv", 0,"1");
        assertEquals("Naziv", a.getNaziv());
    }

    @Test
    void getCijena() {
        Artikl a = new Artikl("Naziv", 0,"1");
        assertEquals(0, a.getCijena());
    }

    @Test
    void getKod() {
        Artikl a = new Artikl("Naziv", 0,"1");
        assertEquals("1", a.getKod().toString());
    }
}
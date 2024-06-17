package arnaud;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class MatriceTest {

    private Service service;
    private Voiture voiture1, voiture2, voiture3, voiture4, voiture5, voiture6;

    @BeforeEach
    public void setUp() {
        voiture1 = new Voiture("Audi", 18000);
        voiture2 = new Voiture("Kia", 12000);
        voiture3 = new Voiture("Tesla", 24000);
        voiture4 = new Voiture("Opel", 6000);
        voiture5 = new Voiture("Peugeot", 9000);
        voiture6 = new Voiture("Renault", 11000);
    }

    @Test
    public void testConstructeurVide() {
        service = new Service();
        assertEquals(0, service.getVoitures().size());
    }

    @Test
    public void testConstructeurAvecUneVoiture() {
        service = new Service(voiture1);
        assertEquals(1, service.getVoitures().size());
        assertTrue(service.getVoitures().contains(voiture1));
    }

    @Test
    public void testConstructeurAvecListeDeVoitures() {
        ArrayList<Voiture> voitures = new ArrayList<>();
        voitures.add(voiture1);
        voitures.add(voiture2);
        service = new Service(voitures);
        assertEquals(2, service.getVoitures().size());
        assertTrue(service.getVoitures().contains(voiture1));
        assertTrue(service.getVoitures().contains(voiture2));
    }

    @Test
    public void testAjouter() {
        service = new Service();
        service.ajouter(voiture1);
        service.ajouter(voiture2);
        assertEquals(2, service.getVoitures().size());
        assertTrue(service.getVoitures().contains(voiture1));
        assertTrue(service.getVoitures().contains(voiture2));
    }

    @Test
    public void testPrix() {
        ArrayList<Voiture> voitures = new ArrayList<>();
        voitures.add(voiture1);
        voitures.add(voiture2);
        voitures.add(voiture3);
        voitures.add(voiture4);
        voitures.add(voiture5);
        voitures.add(voiture6);
        service = new Service(voitures);
        assertEquals(76000, service.prix());
    }

    @Test
    public void testPrixVide() {
        service = new Service();
        assertThrows(ArithmeticException.class, () -> service.prix());
    }

    @Test
    public void testPrixCinqVoitures() {
        ArrayList<Voiture> voitures = new ArrayList<>();
        voitures.add(voiture1);
        voitures.add(voiture2);
        voitures.add(voiture3);
        voitures.add(voiture4);
        voitures.add(voiture5);
        service = new Service(voitures);
        assertEquals(65550, service.prix());
    }
}

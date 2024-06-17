package arnaud;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class ServiceTest {

    @Test
    public void testAjouter(){
        Voiture v1 = new Voiture("Audi", 15200.6F);
        Service s1 = new Service();
        Service s2 = new Service();
        s2.ajouter(v1);
        ArrayList<Voiture> LV = new ArrayList<Voiture>();
        assertTrue(s1.getVoitures().size() == 0);
        assertFalse(s2.getVoitures().size() == 0);
        LV.add(v1);
        assertFalse(s1.getVoitures().size() == 1);
        assertTrue(s2.getVoitures().size() == 1);
    }

    @Test
    public void testPrix(){
        Voiture v1 = new Voiture("Audi", 18000);
        Voiture v2 = new Voiture("Kia", 12000);
        Voiture v3 = new Voiture("Tesla", 24000);
        Voiture v4 = new Voiture("Opel", 6000);
        Voiture v5 = new Voiture("Peugeot", 9000);
        Voiture v6 = new Voiture("Renault", 11000);
        Service s1 = new Service();
        Service s2 = new Service();
        s2.ajouter(v1); s2.ajouter(v2); s2.ajouter(v3); s2.ajouter(v4);
        Service s3 = new Service();
        s3.ajouter(v1); s3.ajouter(v2); s3.ajouter(v3); s3.ajouter(v4); s3.ajouter(v5); s3.ajouter(v6);
        assertTrue(s2.prix() == 60000);
        assertFalse(s2.prix() == 1000);
        assertTrue(s3.prix() == 76000);
        assertFalse(s3.prix() == 1000);
    }

    @Test
    void testNull() {
        ArrayList<Voiture> voitures = new ArrayList<>();
        Service s = new Service(voitures);

        boolean exceptionThrown = false;
        try {
            s.prix();
        } catch (ArithmeticException e) {
            exceptionThrown = true;
            assertEquals("Il n'y a pas de voitures dans le tableau", e.getMessage());
        }

        assertTrue(exceptionThrown, "Expected ArithmeticException to be thrown");
    }
}

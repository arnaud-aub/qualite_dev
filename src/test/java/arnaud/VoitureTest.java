package arnaud;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VoitureTest {

    @Test
    public void testGetter(){
        Voiture v1 = new Voiture("Audi", 15200.6F);
        assertTrue(v1.getMarque() == "Audi");
        assertTrue(v1.getPrix() == 15200.6F);
        assertFalse(v1.getMarque() == "Kia");
        assertFalse(v1.getPrix() == 14569);
    }
}

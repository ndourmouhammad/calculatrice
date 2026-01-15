package com.example.calculatrice;

import com.example.Calculatrice;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatriceTest {

    // Méthode de test pour l'addition
    @Test
    void testSum() {
        Calculatrice calc = new Calculatrice();
        assertEquals(5, calc.sum(2, 3), "2 + 3 doit être égal à 5");
    }

    // Méthode de test pour la soustraction
    @Test
    void testMinus() {
        Calculatrice calc = new Calculatrice();
        assertEquals(1, calc.minus(3, 2), "3 - 2 doit être égal à 1");
    }
}

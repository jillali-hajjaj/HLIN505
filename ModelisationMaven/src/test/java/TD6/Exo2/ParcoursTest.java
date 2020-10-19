package TD6.Exo2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Vector;

import static org.junit.jupiter.api.Assertions.*;

class ParcoursTest {
    Troncon t1;
    Parcours p;
    @BeforeEach
    void setUp(){
        Etape arrivee = new Etape("Etape Arrivée","rue de la rue", 50,NatureEtape.musee);
        Etape depart = new Etape("Etape départ","rue de la voie", 10,NatureEtape.lieuInteretSansVisite);
         Vector<String> rues = new Vector<>();
         rues.add("rue de la voie");
         rues.add("rue de la rue");
         t1 = new Troncon(depart,arrivee,20,rues);
        p = new Parcours();
        p.ajoutTroncon(t1);
    }

    @Test
    void TestNomDesRues(){
        assertTrue(t1.verif());
    }

    @Test
    void TestTempsTrajet(){
        assertEquals(60,t1.getTempsTrajet());
    }
}
package TD3.Exercice4;

import java.io.IOException;

public class ErrModif extends EntNat {

    private int i;
    public ErrModif(int i) {
        this.i = i;
        System.err.println("entier négatif : " + i);
    }


    public void getErr() {
        System.out.println("valeur erronée : " + i);
    }
}

package TD3.Exercice4;

import java.util.ArrayList;

public class ErrConst extends EntNat {
    private int i;
    public ErrConst(int i) {
        this.i = i;
        System.err.println("Entier non naturel : " + i);
    }


    public void getErr() {
        System.out.println("valeur erronée : " + i);
    }
}

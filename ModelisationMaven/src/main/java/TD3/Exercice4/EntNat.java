package TD3.Exercice4;

public class EntNat extends RuntimeException { // en heritant de cette classe on est pas obligé d'avoir throws dans une méthode levanat une excpetion.
    private int i;

    public EntNat(int i) throws ErrModif {
        if(i<0){
            throw new ErrModif(i);
        }
        else {
            this.i = i;
        }
    }

    public EntNat(){
        this.i = 0;
    }

    public void decremente() throws ErrModif {
        if((this.i-1)<0){
            throw new ErrModif(i-1);
        }
        else {
            this.i--;
        }

    }
    public static void decremente(EntNat n) throws ErrModif {
            n.decremente();
    }

    public int getN() {
        return i;
    }

    public void setN(int i) throws ErrModif {
        if(i<0){
            throw new ErrModif(i);
        }
        else {
            this.i = i;
        }
    }
}

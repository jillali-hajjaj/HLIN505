package TD2;

public class Constante extends Expression{

    private double valeur;

    public Constante(double valeur) {
        this.valeur = valeur;
    }

    public double eval(){
        return valeur;
    }
    public double getValeur() {
        return valeur;
    }
}

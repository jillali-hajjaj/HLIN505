package TD5.Exo1;

public interface IPile<A> {
    boolean estVide();
    A depile();
    void empile(A a);
    int nbElements();
    A sommet();
}

package TD5.Exo1;

import java.util.LinkedList;

public class CPile<A> implements IPile<A> {
    LinkedList<A> listeChainee;

    public CPile() {
        this.listeChainee = new LinkedList<A>();
    }

    @Override
    public boolean estVide() {
        return listeChainee.isEmpty();
    }

    @Override
    public A depile() {
        return listeChainee.pop();
    }

    @Override
    public void empile(A o) {
        listeChainee.addFirst(o);
    }

    @Override
    public int nbElements() {
        return listeChainee.size();
    }

    @Override
    public A sommet() {
        return listeChainee.getFirst();
    }


}


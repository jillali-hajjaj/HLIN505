package TD5.Exo4;

import java.util.ArrayList;
import java.util.Collection;


public class Pochette<A extends Document> {

    private String theme;
    Collection<A> listDoc;

    public Pochette(String theme) {
        this.theme = theme;
        this.listDoc = new ArrayList<A>();
    }

    public void transferer(Pochette<? super A> pochette) throws Exception { // n'accepter que les classe qui sont une superclasse de A qui sont des documents donc
        for (A a: listDoc) {
            pochette.addDoc(a);
        }
    }


    public void addDoc(A doc) throws Exception{
        listDoc.add(doc) ;
    }

    public int nbDoc() {
        return listDoc.size();
    }

    @Override
    public String toString() {
        return "Theme= " + theme + " : " + nbDoc() ;
    }
}
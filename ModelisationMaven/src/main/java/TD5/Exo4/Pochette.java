package TD5.Exo4;

import java.util.ArrayList;
import java.util.Collection;


public class Pochette<A extends Document> {

    private String theme;
    Collection<A> listDoc;

    public Pochette(String theme) {
        this.theme = theme;
        this.listDoc = new ArrayList<>();
    }

    public void transferer(Pochette<? super A> pochette) throws Exception {
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
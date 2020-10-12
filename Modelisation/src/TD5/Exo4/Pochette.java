package TD5.Exo4;

import java.util.ArrayList;

public class Pochette <T extends Document> {
    private String theme;
    private ArrayList<Document> pochette;
    public Pochette() {
        this.theme = "Pochette de Document";
        pochette = new ArrayList<>();
    }

    public void ajouterDocument(T a) throws Exception{
        pochette.add(a);
    }

    @Override
    public String toString() {
        return theme + " / Nombre de document dans la pochette : " + pochette.size();
    }

    public int nbDocument() {return pochette.size();}

    public void transfererDocument(Pochette p){

    }
}

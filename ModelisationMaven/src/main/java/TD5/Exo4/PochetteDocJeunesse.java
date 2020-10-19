package TD5.Exo4;

public class PochetteDocJeunesse<A extends DocumentJeunesse> extends Pochette<A>{

    int ageConseille;
    public PochetteDocJeunesse(String theme, int age) {
        super(theme);
        ageConseille = age;
    }

    @Override
    public void addDoc(A doc) throws Exception {
        if (ageConseille > doc.ageMinConseille()) {
            throw new Exception("Exeption de l'age la") ;
        }
        super.addDoc(doc);
    }
}

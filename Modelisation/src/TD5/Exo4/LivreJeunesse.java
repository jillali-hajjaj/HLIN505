package TD5.Exo4;

public class LivreJeunesse extends Livre implements DocumentJeunesse{
    private int ageRequis;
    @Override
    public int ageRequis() {
        return ageRequis;
    }
}

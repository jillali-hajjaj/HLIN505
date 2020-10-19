package TD5.Exo3;

public class FileAttenteAvecPriorite<T extends ElementAvecPriorite> extends FileAttente<T> {
    public T sort(){
        if(contenu.isEmpty()){return null;}
        T min = contenu.get(0);

        for (T a : contenu
             ) {
            if(a.priorite() < min.priorite()){
                min  = a;
            }
        }
        contenu.remove(min);
        return min;
    }
}

package TD5.Exo3;

import java.util.ArrayList;
public class FileAttente<T>
{
    protected ArrayList<T> contenu;
    public FileAttente(){contenu=new ArrayList<T>();}
    public void entre(T p) {contenu.add(p);}
    public T sort()
    {
        T p=null;
        if (!contenu.isEmpty())
        {p=contenu.get(0);
            contenu.remove(0);}
        return p;
    }
    public boolean estVide(){return contenu.isEmpty();}
    public String toString(){return ""+contenu;}
}
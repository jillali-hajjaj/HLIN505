package TD5.Exo2;
public class Tableau <A extends Comparable<A>> {
    private A T [];

    public Tableau (A T []){
        this.T = T;} // on fait ici une recopie "superficielle"
    public void triBulles (){
        int i = T.length -2;
        boolean ech = true;
        while (i >=0 && ech){ // A l'etape i on fait remonter la plus grande valeur sur 0 + 1 donc il fallait mettre i>=0
            ech = false;
            for (int j = 0; j <= i; j ++)
                if (T[j].compareTo(T[j+1])>0 ){
                    A aux = T[j];
                    T[j] = T[j+1];
                    T[j+1] = aux;
                    ech = true;
                }
            i--;
        }
    }

    public void affiche ()	{
        for(int i = 0; i < T.length; i++)
            System.out.print(T[i]+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        Integer T[] = {10,2,6,11, 7, 2, -1, 0, 9};
        Tableau<Integer> obj = new Tableau<Integer>(T);
        obj.triBulles();
        obj.affiche();
    }
}
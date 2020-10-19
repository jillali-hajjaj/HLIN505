package TD5.Exo3;


class FileAttenteAvecPrioriteTest {
    public static void main(String[] args) {
        Personne p1 = new Personne("Titi", (int) (Math.random() * (80 - 0)));
        Personne p2 = new Personne("Ttoto", (int) (Math.random() * (12 - 0)));
        Personne p3 = new Personne("jean", (int) (Math.random() * (30 - 25)));
        Personne p4 = new Personne("momo", (int) (Math.random() * (90 - 20)));
        Personne p5 = new Personne("momo", (int) (Math.random() * (5 - 0)));

        FileAttente<Personne> a = new FileAttente<>();
        FileAttenteAvecPriorite<Personne> ap = new FileAttenteAvecPriorite<>();
        ap.entre(p1);
        ap.entre(p2);
        ap.entre(p3);
        ap.entre(p4);
        ap.entre(p5);

        a.entre(p1);
        a.entre(p2);
        a.entre(p3);
        a.entre(p4);
        a.entre(p5);

        System.out.println(ap.toString());
        ap.sort();
        System.out.println(ap.toString());
        ap.sort();
        System.out.println(ap.toString());
        ap.sort();
        System.out.println(ap.toString());
        ap.sort();
        System.out.println(ap.toString());

    }
}
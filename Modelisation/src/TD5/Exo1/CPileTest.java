package TD5.Exo1;

class CPileTest {
    public static void main(String[] args) {
        CPile<String> c = new CPile<>();
        c.empile("ui");
        System.out.println(c.nbElements());;
        c.depile();
        System.out.println(c.nbElements());;
    }
}
package TD1;

class ListeChaineTest {
    public static void main(String[] args) {
        ListeChaine list = new ListeChaine();
        list.addFirst(2);
        list.addFirst(1);
        list.print();
        System.out.println(list.size());
        list.reverse().print();
        list.print();
    }
}
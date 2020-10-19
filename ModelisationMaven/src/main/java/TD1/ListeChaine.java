package TD1;

public class ListeChaine {


    private Node racine;

    public ListeChaine() {
        this.racine = null;
    }

    public Node getNext() {
        return racine.next;
    }

    public int size() {
        int size = 0;
        Node element = racine;
        while (element != null) {
            size++;
            element = element.next;
        }

        return size;
    }

    public void addFirst(int v) {
        int ancTaille = this.size();
        Node element = new Node(v);
        element.next = racine;
        racine = element;
        assert this.size() == ancTaille+1;
    }

    public void print() {
        String s = "Liste {";
        String s1 = "";
        Node element = racine;
        while (element != null) {
            s1 = s1 + " " + element.value;
            element = element.next;
        }
        System.out.println(s + s1 + " }");

    }

    public ListeChaine reverse() {
        Node element = racine;
        ListeChaine reverse = new ListeChaine();
        while (element != null) {
            reverse.addFirst(element.value);
            element = element.next;
        }

        return reverse;
    }

    public  class Node{
        private int value;
        private Node next;

        public Node(int v) {
            value = v;
            next = null;
        }
    }

}
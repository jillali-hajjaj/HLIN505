package TD4;

import java.io.IOException;


class SongTest {
    public static void main(String[] args) {
        try {
            SimplePlayList p = new SimplePlayList("playlis1","./Modelisation/src/TD4/playlis1.txt");
            System.out.println("Artiste " + p.toString());
            System.out.println("Durée totale " + p.getDuration());
            System.out.println("Taille totale " + p.getSize());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
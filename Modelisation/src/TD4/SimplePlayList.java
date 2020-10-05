package TD4;

import java.io.*;
import java.util.ArrayList;

public class SimplePlayList extends AbstractAudioElement implements Playlist{
    private ArrayList<Song> playlist;
    public SimplePlayList(String title, String path) throws IOException{
        super(title, path);
        playlist = new ArrayList<Song>();
        if(new File(path).exists()){
            BufferedReader file = new BufferedReader(new FileReader(path));
            String c = file.readLine();
            c = file.readLine(); // on saute une ligne
            while (c!=null){
                String tab[];
                tab=c.split("-"); // Nous avons le fichier playlist de la forme title/path/singer/duration
                try{
                    playlist.add(new Song(tab[0],tab[1], tab[2], Integer.parseInt(tab[3])));
                } catch (IncorrectFileNameException e) {
                    e.printStackTrace();
                }
                c = file.readLine();
            }
        }
        else {
            File playlist = new File(path);
            try {
                playlist.createNewFile();
                super.setFile(playlist);
                BufferedWriter fichier = new BufferedWriter(new FileWriter(path));
                fichier.write(title);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public int getDuration() {
        int duree = 0;
        for (Song s: playlist) {
            duree += s.getDuration();
        }
        return duree;
    }

    @Override
    public long getSize() {
        int size = 0;
        for (Song s: playlist
        ) {
            size += s.getSize();
        }
        return size;
    }

    @Override
    public int getNbElement() {
        return playlist.size();
    }

    @Override
    public String toString() {
        String p = "";
        for (Song s:playlist
             ) {
            p += s.getTitle() + " - ";
        }
        return p;
    }
}

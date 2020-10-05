package TD4;

import java.io.File;

public class Song extends AbstractAudioElement{
    private String singer;
    private int duration;

    public Song(String title, String path, String singer, int duration) throws IncorrectFileNameException {
        super(title, path);
        if(!new File(path).exists()){
            throw new IncorrectFileNameException(path);
        }
        this.singer = singer;
        this.duration = duration;
    }

    @Override
    public int getDuration() {
        return duration;
    }

    @Override
    public long getSize() {
        return super.getFile().length();
    }

    public String getSinger() {
        return singer;
    }

    @Override
    public String toString() {
        return "Song{" +
                "singer='" + singer + '\'' +
                ", duration=" + duration +
                '}';
    }
}

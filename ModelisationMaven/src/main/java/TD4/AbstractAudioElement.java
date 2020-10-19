package TD4;

import java.io.File;

public abstract class AbstractAudioElement implements ElementAudio {
    private File file;
    private String title;
    private String path;

    public AbstractAudioElement( String title, String path) {
        this.title = title;
        this.path = path;
        this.file = new File(path);
    }

    public File getFile() {
        return file;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getPath() {
        return path;
    }

    public void setFile(File file) {
        this.file = file;
    }
}

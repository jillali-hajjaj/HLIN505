package TD4;

import java.io.IOException;

public class IncorrectFileNameException extends IOException {
    private String path;
    public IncorrectFileNameException(String path) {
         this.path = path;
    }

    public String getPath() {
        return path;
    }
}

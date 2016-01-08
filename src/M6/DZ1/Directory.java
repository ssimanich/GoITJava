package M6.DZ1;

public class Directory {
File AudioFile;
File ImageFile;
File TextFile;

public void ss() throws Exception {
        try {   AudioFile.read();
                ImageFile.read();
                TextFile.read();
                throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
        }
}}


package M6.DZ1;

public class AudioFile extends File {
    public void MyAudioFileException() {
        try {
            throw new IllegalArgumentException();}
        catch(IllegalArgumentException e) {
            System.err.println("[Error]:AudioFile is not found");
        }}

    @Override
    public void read() {

    }
}

package M6.DZ1;

public class TextFile  extends File {
    public void MyTextFileException() {
        try {
            throw new IllegalArgumentException();}
        catch(IllegalArgumentException e) {
            System.err.println("[Error]:AudioFile is not found");
        }}

    @Override
    public void read() {

    }
}

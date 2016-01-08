package M6.DZ1;

public class ImageFile extends File {
    public void MyImageFileException() {
        try {
            throw new IllegalArgumentException();}
        catch(IllegalArgumentException e) {
            System.err.println("[Error]:AudioFile is not found");
        }}

    @Override
    public void read() {

    }
}



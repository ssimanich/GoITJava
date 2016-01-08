package M6.DZ1;

public abstract class File{
    public void MyFileException() {
        try {
            throw new IllegalStateException();}
        catch(IllegalStateException e ){}}

    public abstract void read();
}
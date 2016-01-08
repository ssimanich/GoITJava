package M6.DZ1;

public abstract class File{
    public void state() {
        try {
            throw new IllegalStateException();}
        catch(IllegalStateException e ){}}

    public abstract void read();
}
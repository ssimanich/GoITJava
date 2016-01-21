package M6.DZ2;
public class AnOldManException extends Throwable {
    private int bigAge;

    public AnOldManException(final int bigAge){
        this.bigAge=bigAge;
    }
    public int getBigAge(){
        return bigAge;
    }
}

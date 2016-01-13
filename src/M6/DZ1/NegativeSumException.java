package M6.DZ1;

public class NegativeSumException extends RuntimeException {
    private int sum;

    public NegativeSumException(final int sum)
    {
        this.sum=sum;
    }
    public int getSum(){
        return sum;
    }
}

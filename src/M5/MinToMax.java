package M5;

public class MinToMax {
    public int massMin(int[] mass) {
        int min = mass[0];
        for (int element : mass) {
            if (min > element) min = element;
        }
        return min;
    }

    public int massMax(int[] mass) {
        int max = mass[0];
        for (int element : mass) {
            if (max < element) max = element;
        }
        return max;
    }
}

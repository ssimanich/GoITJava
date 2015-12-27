package mod5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] mass = {2,-1,3,1};
        int[] sort = QuickSort.sort(mass, 0, 3);
        System.out.println(Arrays.toString(sort));
    }
}
